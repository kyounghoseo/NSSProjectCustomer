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
	public CustomerVO loginInsert(CustomerVO cvo) {//로그인 등록
		// TODO Auto-generated method stub
		return sqlSession.selectOne("logInsert",cvo);
	}

	@Override
	public CustomerVO idInsert(CustomerVO cvo) {//아이디찾기
		// TODO Auto-generated method stub
		return sqlSession.selectOne("idInsert",cvo);
	}

	@Override
	public CustomerVO pwInsert(CustomerVO cvo) {//비밀번호 찾기
		// TODO Auto-generated method stub
		return sqlSession.selectOne("pwInsert",cvo);
	}

	@Override
	public CustomerVO pwUpdate(CustomerVO cvo) {//비밀번호 재설정
		// TODO Auto-generated method stub
		return sqlSession.selectOne("pwUpdate",cvo);
	}

	/*@Override
	public int loginCheck(CustomerVO cvo) {//확인
		// TODO Auto-generated method stub
		return sqlSession.selectOne("loginCheck",cvo);
	}*/

	

}
