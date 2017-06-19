package com.nss.customer.mensoccerservice;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nss.customer.mensoccerdao.MenSoccerDao;
import com.nss.customer.mensoccervo.MenSoccerVO;

@Service
@Transactional
public class MenSoccerServiceImpl implements MenSoccerService{
	Logger logger = Logger.getLogger(MenSoccerService.class);
	
	@Autowired
	private MenSoccerDao	mensoccerDao;
	
	
	//남성 축구화 리스트
	@Override
	public List<MenSoccerVO> soccerList(MenSoccerVO msvo) {
		List<MenSoccerVO> soccerList = null;
		soccerList = mensoccerDao.soccerList(msvo);

		return soccerList;
	}

}
