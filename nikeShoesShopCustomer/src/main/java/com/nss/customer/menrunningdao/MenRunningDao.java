package com.nss.customer.menrunningdao;

import java.util.List;

import com.nss.customer.menrunningvo.MenRunningVO;

public interface MenRunningDao {
	public List<MenRunningVO> runningList(MenRunningVO mrvo);
}
