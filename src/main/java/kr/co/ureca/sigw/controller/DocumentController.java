package kr.co.ureca.sigw.controller;

import kr.co.ureca.sigw.dto.DocSignDTO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.time.LocalDateTime;

@Controller
public class DocumentController {

    @Autowired
    SqlSession sqlSession;

    @RequestMapping(value="/doc")
    public String create_doc_page()
    {
        return "create_doc";
    }

    @PostMapping("/doc/create_doc")
    public void create_doc(DocSignDTO form)
    {
        // 여기에서 form으로 받은 형태
        // 여기에서 임시값을 다 설정
        DocSignDTO temp = new DocSignDTO();
        temp.setEmp_no(1);
        temp.setSign_path_emp_no1(form.getSign_path_emp_no1());
        temp.setSign_path_emp_no2(form.getSign_path_emp_no2());
        temp.setSign_path_emp_no3(form.getSign_path_emp_no3());
        temp.setSign_reg_date(LocalDateTime.now());
        temp.setSign_type("휴가");
        temp.setSign_step(0);
        temp.setSign_status(0);
        temp.setSign_date(form.getSign_date());
        sqlSession.insert("EmpMapper.DocInsert", temp);
        return ;
    }
//
//
//    @PutMapping(value="/create_doc")
//    public String create_doc(DocSignDTO form)
//    {
//        // 여기에서 form으로 받은 형태
//        // 여기에서 임시값을 다 설정
//        DocSignDTO temp = new DocSignDTO();
//        temp.setSign_no(2);
//        temp.setEmp_no(1);
//        temp.setSign_path_emp_no1(form.getSign_path_emp_no1());
//        temp.setSign_path_emp_no2(form.getSign_path_emp_no2());
//        temp.setSign_path_emp_no3(form.getSign_path_emp_no3());
//        temp.setSign_reg_date(LocalDateTime.now());
//        temp.setSign_type("휴가");
//        temp.setSign_step("0");
//        temp.setSign_status(0);
//        temp.setSign_date(form.getSign_date());
//        sqlSession.insert("EmpMapper.DocInsert", temp);
//        return "";
//    }

}
