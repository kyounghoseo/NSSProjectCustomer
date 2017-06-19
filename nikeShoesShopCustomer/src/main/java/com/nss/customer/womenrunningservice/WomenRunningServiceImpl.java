package com.nss.customer.womenrunningservice;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nss.customer.womenrunningdao.WomenRunningDao;
import com.nss.customer.womenrunningvo.WomenRunningVO;


@Service
@Transactional
public class WomenRunningServiceImpl implements WomenRunningService{
	Logger logger = Logger.getLogger(WomenRunningService.class);
	
	@Autowired
	private WomenRunningDao womenrunningDao;

	//여성 런닝화 리스트
	@Override
	public List<WomenRunningVO> wmrunningList(WomenRunningVO wrvo) {
	 List<WomenRunningVO> runningList = null;
	 runningList = womenrunningDao.wmrunningList(wrvo);
		return runningList;
	}

}
