package com.nss.customer.customerservice;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nss.customer.customerdao.CustomerDao;
import com.nss.customer.customervo.CustomerVO;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

	@Inject
	private CustomerDao cdao; 
	
	@Override
	public int customerInsert(CustomerVO cvo) {
		// TODO Auto-generated method stub
		return cdao.customerInsert(cvo);
	}

	@Override
	public int customerUpdate(CustomerVO cvo) {
		// TODO Auto-generated method stub
		return cdao.customerUpdate(cvo);
	}

}
