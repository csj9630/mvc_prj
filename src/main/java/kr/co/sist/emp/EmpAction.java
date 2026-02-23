package kr.co.sist.emp;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.sist.action.Action;

public class EmpAction implements Action {
	private String viewPage;
	private boolean forwardFlag;
	
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		SelectEmpService sds = SelectEmpService.getInstance();
		
		//Web Parameter 받기
		String paramDeptno=request.getParameter("deptno");
		int deptno=0;
		if(paramDeptno != null && !"".equals(paramDeptno)) {
			deptno=Integer.parseInt(paramDeptno);
		}//end if
		
		List<EmpDomain> list=sds.searchEmpInDept(deptno);
		request.setAttribute("empData", list);
		
		//세션에도 할당하고 싶다면?
		HttpSession session = request.getSession();
		session.setAttribute("empData", list);
		
		
		
		viewPage="emp/empList";
		forwardFlag = true;
	}

	@Override
	public String viewPage() {
		return viewPage;
	}

	@Override
	public boolean isForward() {
		return forwardFlag;
	}

}
