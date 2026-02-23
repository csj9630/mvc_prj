package kr.co.sist.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Action {
	/**
	 * Web Parameter, 관계 유지 객체 사용
	 * @param request
	 * @param response
	 * @throws IOException
	 * @throws ServletException
	 */
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException;
	
	/**
	 * view 페이지명을 변환
	 * @return
	 */
	public String viewPage();
	
	/**
	 * 
	 * @return
	 */
	public boolean isForward();
}//class
