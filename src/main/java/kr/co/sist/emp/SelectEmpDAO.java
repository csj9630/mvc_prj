package kr.co.sist.emp;

import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;

import kr.co.sist.dao.MyBatisHandler;

public class SelectEmpDAO {
	// ------싱글톤 패턴----------
	private static SelectEmpDAO sDAO;

	private SelectEmpDAO() {
		// 생성자 잠금
	}

	public static SelectEmpDAO getInstance() {
		if (sDAO == null) {
			sDAO = new SelectEmpDAO();
		} // end if
		return sDAO;
	}// getInstance
	// ----------------------------
	
	public List<EmpDomain> selectAllDept(int deptno) throws PersistenceException{
		List<EmpDomain> list = null;
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		list = ss.selectList("kr.co.sist.emp.selectEmpInDept",deptno);
		if(ss != null) {ss.close();}//end if
		
		return list;
	}//selectAllDept
	
	
	
}//class
