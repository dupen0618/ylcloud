package com.ykcloud.soa.erp.api.scm.service;

import com.ykcloud.soa.erp.api.scm.request.SupplyBalanceBySubUnitNumIdGetRequest;
import com.ykcloud.soa.erp.api.scm.response.SupplyBalanceBySubUnitNumIdGetResponse;

/**
 * @Description:供应商结算相关业务
 * @author Song
 * @Date 2018年4月4日 上午11:47:03
 */
public interface ScmSettleService {

	//根据门店选择当前可结算的供应商
	public SupplyBalanceBySubUnitNumIdGetResponse getSupplyBalanceBySubUnitNumId(SupplyBalanceBySubUnitNumIdGetRequest request);
}
