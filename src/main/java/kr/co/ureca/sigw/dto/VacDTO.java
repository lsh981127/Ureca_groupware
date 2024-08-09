package kr.co.ureca.sigw.dto;

public class VacDTO {

	private String sign_no;
	private String vac_type;
	private String vac_start_date;
	private String vac_end_date;
	private String vac_duration;
	private String vac_reason;

    public String getSign_no() {
        return sign_no;
    }

    public void setSign_no(String sign_no) {
        this.sign_no = sign_no;
    }

    public String getVac_type() {
        return vac_type;
    }

    public void setVac_type(String vac_type) {
        this.vac_type = vac_type;
    }

    public String getVac_start_date() {
        return vac_start_date;
    }

    public void setVac_start_date(String vac_start_date) {
        this.vac_start_date = vac_start_date;
    }

    public String getVac_end_date() {
        return vac_end_date;
    }

    public void setVac_end_date(String vac_end_date) {
        this.vac_end_date = vac_end_date;
    }

    public String getVac_duration() {
        return vac_duration;
    }

    public void setVac_duration(String vac_duration) {
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
        return "VacDTO{" +
                "sign_no='" + sign_no + '\'' +
                ", vac_type='" + vac_type + '\'' +
                ", vac_start_date='" + vac_start_date + '\'' +
                ", vac_end_date='" + vac_end_date + '\'' +
                ", vac_duration='" + vac_duration + '\'' +
                ", vac_reason='" + vac_reason + '\'' +
                '}';
    }
} // class
