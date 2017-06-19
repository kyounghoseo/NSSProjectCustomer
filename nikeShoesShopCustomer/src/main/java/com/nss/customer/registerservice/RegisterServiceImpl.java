package com.nss.customer.registerservice;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nss.customer.registerdao.RegisterDao;
import com.nss.customer.registervo.RegisterVO;

@Service
@Transactional
public class RegisterServiceImpl implements RegisterService {

	@Inject
	private RegisterDao cdao; 
	
	@Override
	public int customerInsert(RegisterVO cvo) {
		// TODO Auto-generated method stub
		return cdao.customerInsert(cvo);
	}

	@Override
	public int customerUpdate(RegisterVO cvo) {
		// TODO Auto-generated method stub
		return cdao.customerUpdate(cvo);
	}

}
