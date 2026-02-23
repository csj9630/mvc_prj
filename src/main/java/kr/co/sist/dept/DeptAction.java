package kr.co.sist.dept;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.sist.action.Action;

public class DeptAction implements Action {
	private String viewPage;
	private boolean forwardFlag;
	
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		SelectDeptService sds = SelectDeptService.getInstance();
		List<DeptDomain> list = sds.searchAllDept();
		request.setAttribute("deptData", list);
		
		
		viewPage="dept/deptList";
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
