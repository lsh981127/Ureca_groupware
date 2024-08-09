package kr.co.ureca.sigw.dto;

public class DeptDTO {

	private int dept_no; // 부서번호
	private String dept_name; //부서명 
	
	public int getDept_no() {
		return dept_no;
	}
	public void setDept_no(int dept_no) {
		this.dept_no = dept_no;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	@Override
	public String toString() {
		return "DeptDTO [dept_no=" + dept_no + ", dept_name=" + dept_name + "]";
	}
	
	
	
	
	
}
