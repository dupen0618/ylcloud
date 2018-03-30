package com.ykcloud.soa.erp.api.so.service;

import com.ykcloud.soa.erp.api.so.request.SoByApplyCreateRequest;
import com.ykcloud.soa.erp.api.so.response.SoByApplyCreateResponse;

/**
 * 
 * @author fakir.jiang
 * 2018年3月29日
 */
public interface SoCreateSerivice {
	//根据申请单生产订单
	public SoByApplyCreateResponse createSoByApply(SoByApplyCreateRequest request);
}
