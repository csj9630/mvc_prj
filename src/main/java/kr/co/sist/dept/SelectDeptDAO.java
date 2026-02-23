package kr.co.sist.dept;

import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;

import kr.co.sist.dao.MyBatisHandler;

public class SelectDeptDAO {
	// ------싱글톤 패턴----------
	private static SelectDeptDAO sDAO;

	private SelectDeptDAO() {
		// 생성자 잠금
	}

	public static SelectDeptDAO getInstance() {
		if (sDAO == null) {
			sDAO = new SelectDeptDAO();
		} // end if
		return sDAO;
	}// getInstance
	// ----------------------------
	
	public List<DeptDomain> selectAllDept() throws PersistenceException{
		List<DeptDomain> list = null;
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		list = ss.selectList("kr.co.sist.dept.selectAllDept");
		if(ss != null) {ss.close();}//end if
		
		return list;
	}//selectAllDept
	
	
	
}//class
