package com.nss.customer.womenlifestyledao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.nss.customer.womenlifestylevo.WomenLifeStyleVO;

@Repository
public class WomenLifeStyleDaoImpl implements WomenLifeStyleDao{
	
	@Inject
	private SqlSession SqlSession;

	@Override
	public List<WomenLifeStyleVO> wmlifestyleList(WomenLifeStyleVO wlsvo) {

		return SqlSession.selectList("wmlifestyleList",wlsvo);
	}

}
