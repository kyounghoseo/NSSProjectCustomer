package com.nss.customer.menrunningdao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.nss.customer.menrunningvo.MenRunningVO;

@Repository
public class MenRunningDaoImpl implements MenRunningDao{

	@Inject
	private SqlSession sqlSession;
	
	@Override
	public List<MenRunningVO> runningList(MenRunningVO mrvo) {
			return sqlSession.selectList("runningList", mrvo);
	}
}
