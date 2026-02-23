package kr.co.sist.emp;

import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;

public class SelectEmpService {
	// ------싱글톤 패턴----------
	private static SelectEmpService ss;
	private SelectEmpService() { }// 생성자 잠금 	 
	public static SelectEmpService getInstance() {
		if (ss == null) { ss = new SelectEmpService(); } 
		return ss; 
	}// getInstance
// ----------------------------
	public List<EmpDomain> searchEmpInDept(int deptno) {
		List<EmpDomain> list = null;
		SelectEmpDAO sdDAO = SelectEmpDAO.getInstance();
		try {
			list = sdDAO.selectAllDept(deptno);
		} catch (PersistenceException pe) {
			pe.printStackTrace();
		}//end catch
		
		return list;
	}//searchAllDept
	
}//class
