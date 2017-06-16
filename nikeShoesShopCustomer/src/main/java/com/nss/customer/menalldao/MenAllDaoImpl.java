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
	
	@Override
	public List<MenAllVO> allList(MenAllVO mavo) {
		return SqlSession.selectList("allList",mavo);
	}

}
