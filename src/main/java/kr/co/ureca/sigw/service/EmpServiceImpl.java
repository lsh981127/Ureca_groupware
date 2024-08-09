package kr.co.ureca.sigw.service;

import kr.co.ureca.sigw.dto.EmpDTO;
import kr.co.ureca.sigw.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	EmpRepository empRepository;

	@Override
	public List<EmpDTO> allEmpList() {
		List<EmpDTO> allEmpList = empRepository.allEmpList();
		return allEmpList;
	}

}
