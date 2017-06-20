package com.nss.customer.menrunningservice;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nss.customer.menrunningdao.MenRunningDao;
import com.nss.customer.menrunningvo.MenRunningVO;

@Service
@Transactional
public class MenRunningServiceImpl implements MenRunningService {

	Logger logger = Logger.getLogger(MenRunningService.class);
	
	@Autowired
	private MenRunningDao menRunningDao;
	
	@Override
	public List<MenRunningVO> runningList(MenRunningVO mrvo) {
			List<MenRunningVO> runList = null;
			runList = menRunningDao.runningList(mrvo);
		return runList;
	}

	

}
