package servlet;

import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.BoardDAO;
import jdk.nashorn.internal.ir.RuntimeNode.Request;
import sun.rmi.server.Dispatcher;
import vo.Board;

@WebServlet(urlPatterns = "/board")
public class BoardServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		String action = req.getParameter("action");
		HttpSession session = req.getSession();
		String userId = (String) session.getAttribute("loginId");
		System.out.println("접속한 유저 : " + userId);
		BoardDAO dao = new BoardDAO();
		if (action.equals("boardList")) {
			/**
			 * 게시글 목록 가져오기
			 */
			int count = dao.countBoard();
			List<Board> blist = dao.selectBoard();
			req.setAttribute("count", count);
			req.setAttribute("bList", blist);
			RequestDispatcher dispatcher = req.getRequestDispatcher("boradList.jsp");
			dispatcher.forward(req, resp);
		}else if (action.equals("boradWrite")) {
			/**
			 * 게시글쓰기
			 */
			String id = (String) req.getSession().getAttribute("loginId");
			if (id == null) {
				RequestDispatcher dispatcher = req.getRequestDispatcher("login.jsp");
				dispatcher.forward(req, resp);
			}
			RequestDispatcher dispatcher = req.getRequestDispatcher("boradWrite.jsp");
			dispatcher.forward(req, resp);
		}else if (action.equals("boradInput")) {
			String id = (String) req.getSession().getAttribute("loginId");
			if (id == null) {
				RequestDispatcher dispatcher = req.getRequestDispatcher("login.jsp");
				dispatcher.forward(req, resp);
			}
			String title = req.getParameter("title");
			String content = req.getParameter("content");

			Board vo = new Board();
			vo.setUserId(id);
			vo.setTitle(title);
			vo.setContent(content);

			System.out.println(vo.toString());
			dao.insertBoard(vo);
			

			resp.sendRedirect("board?action=boardList");
			//RequestDispatcher dispatcher = req.getRequestDispatcher("board?action=boardList");
			//dispatcher.forward(req, resp);
		} else	if (action.equals("boradRead")) {
			String id = (String) req.getSession().getAttribute("loginId");
			if (id == null) {
				RequestDispatcher dispatcher = req.getRequestDispatcher("login.jsp");
				dispatcher.forward(req, resp);
			}
			int boardNum = Integer.parseInt(req.getParameter("boardNum"));

			Board vo = new Board(boardNum, null, null, null, 0, null);
					vo = dao.selectBoardRead(vo);
					
			System.out.println(vo.toString());

			req.setAttribute("BoardRead", vo);
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("boradRead.jsp");
			dispatcher.forward(req, resp);
		}

	}

}
