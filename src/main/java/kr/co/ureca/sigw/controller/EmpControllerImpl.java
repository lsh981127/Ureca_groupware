package kr.co.ureca.sigw.controller;

import kr.co.ureca.sigw.dto.EmpDTO;
import kr.co.ureca.sigw.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class EmpControllerImpl implements EmpController {

	@Autowired
	EmpService empService;

	@RequestMapping(value = "/test_jdbc", method = RequestMethod.GET)
	public String testJdbc(Model model) {

		List<EmpDTO> allEmpList = empService.allEmpList();

		model.addAttribute("allEmpList", allEmpList);

		return "test_jdbc";
	}

	@GetMapping(value = "/hello")
	public String helloMethod(Model model) {
		model.addAttribute("message", "message from controller");
		return "hello";
	}

} // class
