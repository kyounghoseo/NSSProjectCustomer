package com.nss.customer.customerdao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nss.customer.customervo.CustomerVO;

@Repository
public class CustomerDaoImpl implements CustomerDao {
	@Autowired
	private SqlSession sqlSession;

	@Override
	public int customerInsert(CustomerVO cvo) {
		// TODO Auto-generated method stub
		return sqlSession.insert("csInsert", cvo);
	}

	@Override
	public int customerUpdate(CustomerVO cvo) {
		// TODO Auto-generated method stub
		return sqlSession.update("csUpdate", cvo);
	}

}
