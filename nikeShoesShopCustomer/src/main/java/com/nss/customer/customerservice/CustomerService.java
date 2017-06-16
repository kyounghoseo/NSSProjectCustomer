package com.nss.customer.customerservice;

import com.nss.customer.customervo.CustomerVO;

public interface CustomerService {

	public int customerInsert(CustomerVO cvo);

	public int customerUpdate(CustomerVO cvo);
	
	
}
