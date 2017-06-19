package com.nss.customer.mensoccerdao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.nss.customer.mensoccerservice.MenSoccerService;
import com.nss.customer.mensoccervo.MenSoccerVO;

@Repository
public class MenSoccerDaoImpl implements MenSoccerService{

	@Inject
	private SqlSession sqlSession;
	
	//남성 축구화 리스트
	@Override
	public List<MenSoccerVO> soccerList(MenSoccerVO msvo) {
		return sqlSession.selectList("soccerList",msvo);
	}

}
