package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		
		String birth = req.getParameter("birth");
		int age = Integer.parseInt(req.getParameter("age"));
		String phone = req.getParameter("phone1") + req.getParameter("phone2");
		String address = req.getParameter("addr1") + req.getParameter("addr2");
		String introduce = req.getParameter("introduce");
		
		Member member = new Member(userId, userPwd, userName, gender, hobby, birth, age, address, phone, introduce);
		MemberDAO dao = new MemberDAO();
		dao.insertMember(member);
		
		}
		if(action.equals("action")){
			String userId = req.getParameter("userId");
			String userPw = req.getParameter("userPw");
			
			MemberDAO dao = new MemberDAO();
			Member member = new Member(userId, userPw, null, null, null, null, 0, null, null, null);
			member = dao.selectMember(member);

			
			if(member!=null) {
				userId = member.getUserId();
				userPw = member.getUserPwd();
				String userName = member.getUserName();
				String gender = member.getGender();
				String hobby = member.getHobby();
				String birth = member.getBirth();
				int age = member.getAge();
				String address = member.getAddress();
				String phone = member.getPhone();
				String introduce = member.getIntroduce();
				
				System.out.println(member);
				
				req.setAttribute("userId", userId);
				req.setAttribute("userPw", userPw);
				req.setAttribute("userName", userName);
				req.setAttribute("gender", gender);
				req.setAttribute("hobby", hobby);
				req.setAttribute("birth", birth);
				req.setAttribute("age", age);
				req.setAttribute("address", address);
				req.setAttribute("phone", phone);
				req.setAttribute("introduce", introduce);
				
				
				RequestDispatcher dispatcher = req.getRequestDispatcher("home.jsp");
				dispatcher.forward(req, resp);
			}else {
				RequestDispatcher dispatcher = req.getRequestDispatcher("fail.jsp");
				dispatcher.forward(req, resp);
			}
		}
		
	}

	
}
