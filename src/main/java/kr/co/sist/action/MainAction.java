package kr.co.sist.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MainAction implements Action {

	private String viewPage;
	private boolean forwardFlag;
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		// TODO Auto-generated method stub
		viewPage="index";
		forwardFlag=true;
	}

	@Override
	public String viewPage() {
		// TODO Auto-generated method stub
		return viewPage;
	}

	@Override
	public boolean isForward() {
		// TODO Auto-generated method stub
		return forwardFlag;
	}

}
