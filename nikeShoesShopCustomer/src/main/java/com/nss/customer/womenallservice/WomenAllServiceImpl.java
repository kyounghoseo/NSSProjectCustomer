package com.nss.customer.womenallservice;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nss.customer.womenalldao.WomenAllDao;
import com.nss.customer.womenallvo.WomenAllVO;

@Service
@Transactional
public class WomenAllServiceImpl implements WomenAllService{
	Logger logger = Logger.getLogger(WomenAllService.class);
	
	@Autowired
	private WomenAllDao womenallDao;
	
	
	//여성 전체 상품 리스트
	@Override
	public List<WomenAllVO> wmallList(WomenAllVO wavo) {
		List<WomenAllVO> wmallList = null;
		wmallList = womenallDao.wmallList(wavo);
		return wmallList;
	}

}
