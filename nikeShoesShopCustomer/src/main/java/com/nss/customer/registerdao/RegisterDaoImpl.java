package com.nss.customer.registerdao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nss.customer.registervo.RegisterVO;

@Repository
public class RegisterDaoImpl implements RegisterDao {
	@Autowired
	private SqlSession sqlSession;

	@Override
	public int customerInsert(RegisterVO cvo) {
		// TODO Auto-generated method stub
		return sqlSession.insert("csInsert", cvo);
	}

	@Override
	public int customerUpdate(RegisterVO cvo) {
		// TODO Auto-generated method stub
		return sqlSession.update("csUpdate", cvo);
	}

}
