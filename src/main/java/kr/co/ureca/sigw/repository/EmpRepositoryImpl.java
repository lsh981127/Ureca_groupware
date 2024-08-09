package kr.co.ureca.sigw.repository;

import kr.co.ureca.sigw.dto.EmpDTO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmpRepositoryImpl implements EmpRepository {

	@Autowired
	SqlSession sqlSession;

	@Override
	public List<EmpDTO> allEmpList() {
		List<EmpDTO> allEmpList = sqlSession.selectList("EmpMapper.allEmpList");
		return allEmpList;
	}

}
