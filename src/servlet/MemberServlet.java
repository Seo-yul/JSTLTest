package servlet;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.MemberDAO;
import vo.Member;

@WebServlet(urlPatterns="/member")
public class MemberServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		HttpSession session = req.getSession();
		String action = req.getParameter("action");
		
		if(action.equals("join")){
			
		String userId = req.getParameter("userid");
		String userPwd =  req.getParameter("userpwd");
		String userName =  req.getParameter("username");
		String gender =  req.getParameter("gender");
		String [] h = req.getParameterValues("hobby");
		
		String hobby = "";
		for(int i=0; i<h.length; i++)
			hobby += h[i] + " " ;
		
		Timestamp birth =Timestamp.valueOf(req.getParameter("birth"));
		String age = req.getParameter("age");
		String phone = req.getParameter("phone1") + req.getParameter("phone2");
		String address = req.getParameter("addr1") + req.getParameter("addr2");
		String introduce = req.getParameter("introduce");
		
		Member member = new Member(userId, userPwd, userName, gender, hobby, birth, age, address, phone, introduce);
		MemberDAO dao = new MemberDAO();
		dao.insertMember(member);
		
		}
		
		else if(action.equals("login")){
			
			System.out.println("action : login");
			String userId = req.getParameter("userId");
			String userPwd = req.getParameter("userPw");
			System.out.println(userId+" "+userPwd);
			MemberDAO dao = new MemberDAO();
			Member member = new Member(userId, userPwd, null, null, null, null, null, null, null, null);
			
			member = dao.selectMember(member);
			System.out.println(member.toString());
			
			if(member!=null) {
				userId = member.getUserId();
				userPwd = member.getUserPwd();
				String userName = member.getUserName();
				String gender = member.getGender();
				String hobby = member.getHobby();
				String birth = member.getBirth().toString();
				String age = member.getAge();
				String address = member.getAddress();
				String phone = member.getPhone();
				String introduce = member.getIntroduce();
				
				req.setAttribute("userId", userId);
				req.setAttribute("userPw", userPwd);
				req.setAttribute("userName", userName);
				req.setAttribute("gender", gender);
				req.setAttribute("hobby", hobby);
				req.setAttribute("birth", birth);
				req.setAttribute("age", age);
				req.setAttribute("address", address);
				req.setAttribute("phone", phone);
				req.setAttribute("introduce", introduce);
				
				session.setAttribute("loginId", userId);
				session.setAttribute("loginName", userName);
			
				
				
				RequestDispatcher dispatcher = req.getRequestDispatcher("home.jsp");
				dispatcher.forward(req, resp);
			}else {
				RequestDispatcher dispatcher = req.getRequestDispatcher("fail.jsp");
				dispatcher.forward(req, resp);
			}
		}
		if(action.equals("logout")){
			req.getSession().invalidate();
			
			RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
			rd.forward(req, resp);
		}
		
	}

	
}
