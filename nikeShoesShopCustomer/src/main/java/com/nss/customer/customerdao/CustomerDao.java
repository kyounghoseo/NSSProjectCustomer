package com.nss.customer.customerdao;

import com.nss.customer.customervo.CustomerVO;

public interface CustomerDao {

	public int customerInsert(CustomerVO cvo);
	
	public int customerUpdate(CustomerVO cvo);
	
	
}
