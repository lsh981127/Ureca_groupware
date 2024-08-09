package kr.co.ureca.sigw.dto;

public class DocDTO {

	private String sign_no;
	private String emp_no;
	private String sign_path_emp_no1;
	private String sign_path_emp_no2;
	private String sign_path_emp_no3;
	private String sign_reg_date;
	private String sign_type;
	private String sign_step;
	private String sign_status;
	private String sign_date;


    public String getSign_no() {
        return sign_no;
    }

    public void setSign_no(String sign_no) {
        this.sign_no = sign_no;
    }

    public String getEmp_no() {
        return emp_no;
    }

    public void setEmp_no(String emp_no) {
        this.emp_no = emp_no;
    }

    public String getSign_path_emp_no1() {
        return sign_path_emp_no1;
    }

    public void setSign_path_emp_no1(String sign_path_emp_no1) {
        this.sign_path_emp_no1 = sign_path_emp_no1;
    }

    public String getSign_path_emp_no2() {
        return sign_path_emp_no2;
    }

    public void setSign_path_emp_no2(String sign_path_emp_no2) {
        this.sign_path_emp_no2 = sign_path_emp_no2;
    }

    public String getSign_path_emp_no3() {
        return sign_path_emp_no3;
    }

    public void setSign_path_emp_no3(String sign_path_emp_no3) {
        this.sign_path_emp_no3 = sign_path_emp_no3;
    }

    public String getSign_reg_date() {
        return sign_reg_date;
    }

    public void setSign_reg_date(String sign_reg_date) {
        this.sign_reg_date = sign_reg_date;
    }

    public String getSign_type() {
        return sign_type;
    }

    public void setSign_type(String sign_type) {
        this.sign_type = sign_type;
    }

    public String getSign_step() {
        return sign_step;
    }

    public void setSign_step(String sign_step) {
        this.sign_step = sign_step;
    }

    public String getSign_status() {
        return sign_status;
    }

    public void setSign_status(String sign_status) {
        this.sign_status = sign_status;
    }

    public String getSign_date() {
        return sign_date;
    }

    public void setSign_date(String sign_date) {
        this.sign_date = sign_date;
    }


    @Override
    public String toString() {
        return "DocDTO{" +
                "sign_no='" + sign_no + '\'' +
                ", emp_no='" + emp_no + '\'' +
                ", sign_path_emp_no1='" + sign_path_emp_no1 + '\'' +
                ", sign_path_emp_no2='" + sign_path_emp_no2 + '\'' +
                ", sign_path_emp_no3='" + sign_path_emp_no3 + '\'' +
                ", sign_reg_date='" + sign_reg_date + '\'' +
                ", sign_type='" + sign_type + '\'' +
                ", sign_step='" + sign_step + '\'' +
                ", sign_status='" + sign_status + '\'' +
                ", sign_date='" + sign_date + '\'' +
                '}';
    }
} // class
