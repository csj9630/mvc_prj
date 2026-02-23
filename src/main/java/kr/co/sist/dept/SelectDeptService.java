package kr.co.sist.dept;

import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;

public class SelectDeptService {
	// ------싱글톤 패턴----------
	private static SelectDeptService ss;
	private SelectDeptService() { }// 생성자 잠금 	 
	public static SelectDeptService getInstance() {
		if (ss == null) { ss = new SelectDeptService(); } 
		return ss; 
	}// getInstance
// ----------------------------
	public List<DeptDomain> searchAllDept() {
		List<DeptDomain> list = null;
		SelectDeptDAO sdDAO = SelectDeptDAO.getInstance();
		try {
			list = sdDAO.selectAllDept();
		} catch (PersistenceException pe) {
			pe.printStackTrace();
		}//end catch
		
		return list;
	}//searchAllDept
	
}//class
