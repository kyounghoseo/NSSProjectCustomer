package com.nss.customer.menlifestyledao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.nss.customer.menlifestylevo.MenLifeStyleVO;

@Repository
public class MenLifeStyleDaoImpl implements MenLifeStyleDao {
	
	@Inject
	private SqlSession sqlSession;

	//남성 라이프스타일 리스트
	@Override
	public List<MenLifeStyleVO> lifestyleList(MenLifeStyleVO mlsvo) {
		return sqlSession.selectList("lifestyleList",mlsvo);
	}

}
