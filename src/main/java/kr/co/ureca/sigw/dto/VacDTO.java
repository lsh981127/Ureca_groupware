package kr.co.ureca.sigw.dto;

import java.time.LocalDateTime;

public class VacDTO {

	private int sign_no; // 결재문서 번호 
	private String vac_type; // 연차 종류 (연차, 반차) 
	private LocalDateTime vac_start_date; //연차시작일 
	private LocalDateTime vac_end_date; // 연차종료일 
	private double vac_duration; // 연차기간 
	private String vac_reason; // 연차사유 
	
	public int getSign_no() {
		return sign_no;
	}
	public void setSign_no(int sign_no) {
		this.sign_no = sign_no;
	}
	public String getVac_type() {
		return vac_type;
	}
	public void setVac_type(String vac_type) {
		this.vac_type = vac_type;
	}
	public LocalDateTime getVac_start_date() {
		return vac_start_date;
	}
	public void setVac_start_date(LocalDateTime vac_start_date) {
		this.vac_start_date = vac_start_date;
	}
	public LocalDateTime getVac_end_date() {
		return vac_end_date;
	}
	public void setVac_end_date(LocalDateTime vac_end_date) {
		this.vac_end_date = vac_end_date;
	}
	public double getVac_duration() {
		return vac_duration;
	}
	public void setVac_duration(double vac_duration) {
		this.vac_duration = vac_duration;
	}
	public String getVac_reason() {
		return vac_reason;
	}
	public void setVac_reason(String vac_reason) {
		this.vac_reason = vac_reason;
	}
	@Override
	public String toString() {
		return "VacDTO [sign_no=" + sign_no + ", vac_type=" + vac_type + ", vac_start_date=" + vac_start_date
				+ ", vac_end_date=" + vac_end_date + ", vac_duration=" + vac_duration + ", vac_reason=" + vac_reason
				+ "]";
	}
	
	
	 
}
