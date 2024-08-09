package kr.co.ureca.sigw.dto;

public class EmpDTO {

	private String emp_no;
	private String dept_no;
	private String emp_vac_cnt;
	private String emp_position;
	private String emp_name;

    public String getEmp_no() {
        return emp_no;
    }

    public void setEmp_no(String emp_no) {
        this.emp_no = emp_no;
    }

    public String getDept_no() {
        return dept_no;
    }

    public void setDept_no(String dept_no) {
        this.dept_no = dept_no;
    }

    public String getEmp_vac_cnt() {
        return emp_vac_cnt;
    }

    public void setEmp_vac_cnt(String emp_vac_cnt) {
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

    @Override
    public String toString() {
        return "EmpDTO{" +
                "emp_no=" + emp_no +
                ", dept_no=" + dept_no +
                ", emp_vac_cnt=" + emp_vac_cnt +
                ", emp_position=" + emp_position +
                ", emp_name=" + emp_name +
                '}';
    }
} // class
