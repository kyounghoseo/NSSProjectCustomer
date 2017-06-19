package com.nss.customer.logindao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nss.customer.customervo.CustomerVO;

@Repository
public class LoginDaoImpl implements LoginDao {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public CustomerVO loginInsert(CustomerVO cvo) {//濡쒓렇�씤 �벑濡�
		// TODO Auto-generated method stub
		return sqlSession.selectOne("logInsert",cvo);
	}

	@Override
	public CustomerVO idInsert(CustomerVO cvo) {//�븘�씠�뵒李얘린
		// TODO Auto-generated method stub
		return sqlSession.selectOne("idInsert",cvo);
	}

	@Override
	public CustomerVO pwInsert(CustomerVO cvo) {//鍮꾨�踰덊샇 李얘린
		// TODO Auto-generated method stub
		return sqlSession.selectOne("pwInsert",cvo);
	}

	@Override
	public int pwUpdate(CustomerVO cvo) {//鍮꾨�踰덊샇 �옱�꽕�젙
		// TODO Auto-generated method stub
		return sqlSession.selectOne("pwUpdate",cvo);
	}

	/*@Override
	public int loginCheck(CustomerVO cvo) {//�솗�씤
		// TODO Auto-generated method stub
		return sqlSession.selectOne("loginCheck",cvo);
	}*/

	

}
