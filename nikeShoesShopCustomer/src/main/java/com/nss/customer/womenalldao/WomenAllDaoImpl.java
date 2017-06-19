package com.nss.customer.womenalldao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.nss.customer.womenallvo.WomenAllVO;

@Repository
public class WomenAllDaoImpl implements WomenAllDao{
	
	@Inject
	private SqlSession sqlSession;

	@Override
	public List<WomenAllVO> wmallList(WomenAllVO wavo) {
		
		return sqlSession.selectList("wmallList",wavo);
	}

}
