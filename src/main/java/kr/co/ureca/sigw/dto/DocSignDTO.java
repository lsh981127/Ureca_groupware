package kr.co.ureca.sigw.dto;

import java.time.LocalDateTime;

public class DocSignDTO {

	private int sign_no; // 결재문서 번호
	private int emp_no; // 상신자 사번

	private int sign_path_emp_no1; // 결재자 사번 1
	private int sign_path_emp_no2; // 결재자 사번 2 (0이면 지정되지 않은 것)
	private int sign_path_emp_no3; // 결재자 사번 3 (0이면 지정되지 않은 것)
	private LocalDateTime sign_reg_date; // 등록날짜
	private String sign_type; // 결재문서 타입 (휴가)
	private String sign_step; // (enum 필요) 결재문서 단계 (0:진행중 / 1: 1번 결재자 승인 or 반려 완료 / 2: 2번 결재자 승인 or 반려 완료 / 3: 3번 결재자 승인 or 반려 완료)
	private	int sign_status; // (enum 필요) 결재문서 상태 (0:진행중, 1:승인, 2:반려)
	private LocalDateTime sign_date; // 결재날짜 (완료 기준 - 승인 or 반려된 날짜)


	public String getSign_step() {
		return sign_step;
	}

	public void setSign_step(String sign_step) {
		this.sign_step = sign_step;
	}

	public int getSign_status() {
		return sign_status;
	}

	public void setSign_status(int sign_status) {
		this.sign_status = sign_status;
	}

	public int getSign_no() {
		return sign_no;
	}
	public void setSign_no(int sign_no) {
		this.sign_no = sign_no;
	}
	public int getEmp_no() {
		return emp_no;
	}
	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}
	public int getSign_path_emp_no1() {
		return sign_path_emp_no1;
	}
	public void setSign_path_emp_no1(int sign_path_emp_no1) {
		this.sign_path_emp_no1 = sign_path_emp_no1;
	}
	public int getSign_path_emp_no2() {
		return sign_path_emp_no2;
	}
	public void setSign_path_emp_no2(int sign_path_emp_no2) {
		this.sign_path_emp_no2 = sign_path_emp_no2;
	}
	public int getSign_path_emp_no3() {
		return sign_path_emp_no3;
	}
	public void setSign_path_emp_no3(int sign_path_emp_no3) {
		this.sign_path_emp_no3 = sign_path_emp_no3;
	}
	public LocalDateTime getSign_reg_date() {
		return sign_reg_date;
	}
	public void setSign_reg_date(LocalDateTime sign_reg_date) {
		this.sign_reg_date = sign_reg_date;
	}
	public String getSign_type() {
		return sign_type;
	}
	public void setSign_type(String sign_type) {
		this.sign_type = sign_type;
	}


	public void setSign_date(LocalDateTime sign_date) {
		this.sign_date = sign_date;
	}

	public LocalDateTime getSign_date() {
		return sign_date;
	}

	@Override
	public String toString() {
		return "DocSignDTO [sign_no=" + sign_no + ", emp_no=" + emp_no + ", sign_path_emp_no1=" + sign_path_emp_no1
				+ ", sign_path_emp_no2=" + sign_path_emp_no2 + ", sign_path_emp_no3=" + sign_path_emp_no3
				+ ", sign_reg_date=" + sign_reg_date + ", sign_type=" + sign_type + ", sign_step=" + sign_step
				+ ", sign_status=" + sign_status + ", sign_date=" + sign_date + "]";
	}




}
