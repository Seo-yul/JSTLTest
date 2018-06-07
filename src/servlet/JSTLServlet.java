package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.Person;


public class JSTLServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String id = req.getParameter("id");
		
		req.setAttribute("name", name);
		req.setAttribute("id", id);

		List<String> list = new ArrayList<>();
		list.add("양고기");
		list.add("소고기");
		list.add("돼지고기");
		list.add("닭고기");
		req.setAttribute("list", list);
		
		HashMap<String, String> sMap = new HashMap<>();
		sMap.put("아침", "닭고기map");
		sMap.put("점심", "돼지고기map");
		sMap.put("저녁", "소고기map");
		req.setAttribute("map", sMap);
		
		
		Person person = new Person("철수",35);
		req.setAttribute("Person", person);
		
		ArrayList<Person> pList = new ArrayList<>();
		pList.add(new Person("영희",26));
		pList.add(new Person("훈이",26));
		pList.add(new Person("맹구",26));
		req.setAttribute("PList", pList);
		
		HashMap<String, Person> pMap = new HashMap<>();
		pMap.put("친구1", new Person("짱구",26));
		pMap.put("친구2", new Person("원장",56));
		pMap.put("친구3", new Person("선생",56));
		req.setAttribute("pMap", pMap);
		
		
		RequestDispatcher rd = req.getRequestDispatcher("result.jsp");
		rd.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	
	

}
