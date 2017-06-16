package com.nss.customer.menlifestyleservice;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nss.customer.menlifestyledao.MenLifeStyleDao;
import com.nss.customer.menlifestylevo.MenLifeStyleVO;

@Service
@Transactional
public class MenLifeStyleServiceImpl implements MenLifeStyleService {

	Logger logger = Logger.getLogger(MenLifeStyleService.class);
	
	@Autowired
	private MenLifeStyleDao menlifestyleDao;
	
	@Override
	public List<MenLifeStyleVO> lifestyleList(MenLifeStyleVO mlsvo) {
          List<MenLifeStyleVO> lifeList = null;
          lifeList = menlifestyleDao.lifestyleList(mlsvo);
		return lifeList;
	}

}
