package kr.co.ureca.sigw.controller;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.ureca.sigw.dto.DeptDTO;
import kr.co.ureca.sigw.dto.DocSignDTO;
import kr.co.ureca.sigw.dto.EmpDTO;
import kr.co.ureca.sigw.dto.VacDTO;

@Controller
public class HomeController {

	@Autowired
	SqlSession sqlSession;
	
	@GetMapping("/")
	public String home(Model model)
	{
		return "home";
	} // home
	
	@RequestMapping(value="/test_dept_list", method=RequestMethod.GET)
	public String testJdbc0(Model model)
	{
		List<DeptDTO> allDeptList = sqlSession.selectList("EmpMapper.allDeptList");
		model.addAttribute("allDeptList", allDeptList);
		
		return "test_dept_list";
	}
	
	@RequestMapping(value="/test_emp_list", method=RequestMethod.GET)
	public String testJdbc1(Model model)
	{
		List<EmpDTO> allEmpList = sqlSession.selectList("EmpMapper.allEmpList");
		model.addAttribute("allEmpList", allEmpList);
		
		return "test_emp_list";
	}
	
	@RequestMapping(value="/test_doc_sign_list", method=RequestMethod.GET)
	public String testJdbc2(Model model)
	{
		List<DocSignDTO> allDocSignList = sqlSession.selectList("EmpMapper.allDocSignList");
		model.addAttribute("allDocSignList", allDocSignList);
		
		return "test_doc_sign_list";
	}
	
	@RequestMapping(value="/test_vac_list", method=RequestMethod.GET)
	public String testJdbc3(Model model)
	{
		List<VacDTO> allVacList = sqlSession.selectList("EmpMapper.allVacList");
		
		model.addAttribute("allVacList", allVacList);
		return "test_vac_list";
	}
	
} // class
