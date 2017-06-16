package com.nss.customer.loginservice;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nss.customer.customervo.CustomerVO;
import com.nss.customer.logindao.LoginDao;

@Service
@Transactional
public class LoginServiceImpl implements LoginService {

	@Inject
	private LoginDao ldao;
	
	@Override
	public CustomerVO loginInsert(CustomerVO cvo) {//로그인
		// TODO Auto-generated method stub
		return ldao.loginInsert(cvo);
	}

	@Override
	public CustomerVO idInsert(CustomerVO cvo) {//아이디 찾기
		// TODO Auto-generated method stub
		return ldao.idInsert(cvo);
	}

	@Override
	public CustomerVO pwInsert(CustomerVO cvo) {//비밀번호 찾기(조회)
		// TODO Auto-generated method stub
		return ldao.pwInsert(cvo);
	}

	@Override
	public CustomerVO pwUpdate(CustomerVO cvo) {//비밀번호 재설정
		// TODO Auto-generated method stub
		return ldao.pwUpdate(cvo);
	}


	/*@Override
	public int loginCheck(CustomerVO cvo) {
		// TODO Auto-generated method stub
		return ldao.loginCheck(cvo);
	}*/

	
	
	

}
