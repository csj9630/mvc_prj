package kr.co.sist.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.sist.action.Action;
import kr.co.sist.action.MainAction;
import kr.co.sist.dept.DeptAction;
import kr.co.sist.emp.EmpAction;


public class MainController extends HttpServlet {
	private static Map<String,Action> siteMap;
	
	static {//클래스를 실행할 때 자동으로 호출되는 static 영역
		siteMap = new HashMap<String, Action>();
		siteMap.put("M001", new MainAction()); //indedx 화면으로 이동.
		siteMap.put("D0001", new DeptAction()); //모든 부서 조회 화면으로 이동.
		siteMap.put("E0001", new EmpAction()); //모든 부서 조회 화면으로 이동.
		
	}//static
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doPost(request, response);//GET 방식 요청이 있다면 doPost로 가서 처리
	}//doGet

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8"); //post방식 한글처리.
		
		String cmd = request.getParameter("cmd");

		if(!siteMap.containsKey(cmd)) {
			cmd = "M001";
		}//end if
		
		//입력키로 action을 찾고
		Action action = (Action)siteMap.get(cmd);
		if(action == null) {
			action = (Action)siteMap.get("M001");
		}//end if

		//action의 메서드 호출
		action.execute(request, response);//web parameter 처리, 관계 유지
		String url = action.viewPage()+".jsp";//view 페이지명
		boolean forwardFlag = action.isForward();//이동방식
	
		moveUrl(request, response, url, forwardFlag);
	}//doPost
	
	public void moveUrl(HttpServletRequest request, HttpServletResponse response,String url, boolean forwardFlag) throws ServletException, IOException {
		if(forwardFlag) {
			RequestDispatcher rd = request.getRequestDispatcher(url);
			rd.forward(request, response);
		}else {
			response.sendRedirect(url);
		}
		
	}//moveUrl
		
	

}//class
