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
	public CustomerVO loginInsert(CustomerVO cvo) {//濡쒓렇�씤
		// TODO Auto-generated method stub
		return ldao.loginInsert(cvo);
	}

	@Override
	public CustomerVO idInsert(CustomerVO cvo) {//�븘�씠�뵒 李얘린
		// TODO Auto-generated method stub
		return ldao.idInsert(cvo);
	}

	@Override
	public CustomerVO pwInsert(CustomerVO cvo) {//鍮꾨�踰덊샇 李얘린(議고쉶)
		// TODO Auto-generated method stub
		return ldao.pwInsert(cvo);
	}

	@Override
	public int pwUpdate(CustomerVO cvo) {//鍮꾨�踰덊샇 �옱�꽕�젙
		// TODO Auto-generated method stub
		return ldao.pwUpdate(cvo);
	}


	/*@Override
	public int loginCheck(CustomerVO cvo) {
		// TODO Auto-generated method stub
		return ldao.loginCheck(cvo);
	}*/

	
	
	

}
