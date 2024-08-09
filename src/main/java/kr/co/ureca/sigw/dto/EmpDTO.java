package kr.co.ureca.sigw.dto;

public class EmpDTO {

	private int emp_no; // 사번 
	private int dept_no; // 부서번호 
	private double emp_vac_cnt; // 잔여연차 
	private String emp_position; // 직급 
	private String emp_name; // 사원명 
	private String emp_id; // 아이디 
	private String emp_password; // 비밀번호 
	private int emp_auth; // 권한 
	
	public int getEmp_no() {
		return emp_no;
	}
	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}
	public int getDept_no() {
		return dept_no;
	}
	public void setDept_no(int dept_no) {
		this.dept_no = dept_no;
	}
	public double getEmp_vac_cnt() {
		return emp_vac_cnt;
	}
	public void setEmp_vac_cnt(double emp_vac_cnt) {
		this.emp_vac_cnt = emp_vac_cnt;
	}
	public String getEmp_position() {
		return emp_position;
	}
	public void setEmp_position(String emp_position) {
		this.emp_position = emp_position;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_password() {
		return emp_password;
	}
	public void setEmp_password(String emp_password) {
		this.emp_password = emp_password;
	}
	public int getEmp_auth() {
		return emp_auth;
	}
	public void setEmp_auth(int emp_auth) {
		this.emp_auth = emp_auth;
	}
	@Override
	public String toString() {
		return "EmpDTO [emp_no=" + emp_no + ", dept_no=" + dept_no + ", emp_vac_cnt=" + emp_vac_cnt + ", emp_position="
				+ emp_position + ", emp_name=" + emp_name + ", emp_id=" + emp_id + ", emp_password=" + emp_password
				+ ", emp_auth=" + emp_auth + "]";
	}
	
	
	
	
}
