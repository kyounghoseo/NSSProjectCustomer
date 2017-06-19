package com.nss.customer.menalldao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.nss.customer.menallvo.MenAllVO;

@Repository
public class MenAllDaoImpl implements MenAllDao{

	@Inject
	private SqlSession sqlSession;
	
	//남성 전체상품 리스트
	@Override
	public List<MenAllVO> allList(MenAllVO mavo) {
		return sqlSession.selectList("allList",mavo);
	}

}