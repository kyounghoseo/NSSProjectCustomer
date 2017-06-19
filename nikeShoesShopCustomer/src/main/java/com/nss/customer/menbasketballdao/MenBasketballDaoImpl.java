package com.nss.customer.menbasketballdao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.nss.customer.menbasketballvo.MenBasketballVO;

@Repository
public class MenBasketballDaoImpl implements MenBasketballDao {

	@Inject
	private SqlSession sqlSession;
	
	//남성 농구화 리스트
	@Override
	public List<MenBasketballVO> basketballList(MenBasketballVO mbvo) {
		return sqlSession.selectList("basketballList",mbvo);
	}

}
