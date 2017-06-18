package com.nss.customer.menalldao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.nss.customer.menallvo.MenAllVO;

@Repository
public class MenAllDaoImpl implements MenAllDao{

	@Inject
	private SqlSession SqlSession;
	
	//남자 전체상품 리스트
	@Override
	public List<MenAllVO> allList(MenAllVO mavo) {
		return SqlSession.selectList("allList",mavo);
	}

	//남자 전체상품 상세보기
	@Override
	public MenAllVO allDetail(MenAllVO mavo) {
		
		return SqlSession.selectOne("allDetail",mavo);
	}

}
