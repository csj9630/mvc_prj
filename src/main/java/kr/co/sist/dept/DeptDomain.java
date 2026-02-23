package kr.co.sist.dept;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter // Getter
@Setter // Setter
@ToString // ToString

public class DeptDomain {
	private int deptno;
	private String dname,loc;
}
