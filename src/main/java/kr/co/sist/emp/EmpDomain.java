package kr.co.sist.emp;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter // Getter
@Setter // Setter
@ToString // ToString

public class EmpDomain {
	private String ename, job;
	private int sal;
	private Date hiredate;
}
