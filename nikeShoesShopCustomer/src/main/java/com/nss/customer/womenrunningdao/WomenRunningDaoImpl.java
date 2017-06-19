package com.nss.customer.womenrunningdao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.nss.customer.womenrunningvo.WomenRunningVO;

@Repository
public class WomenRunningDaoImpl implements WomenRunningDao{
	
	@Inject
	private SqlSession sqlSession;
	@Override
	public List<WomenRunningVO> runningList(WomenRunningVO wrvo) {
		
		return sqlSession.selectList("runningList",wrvo);
	}

}
