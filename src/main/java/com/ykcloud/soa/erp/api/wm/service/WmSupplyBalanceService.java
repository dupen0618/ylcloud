package com.ykcloud.soa.erp.api.wm.service;

import com.ykcloud.soa.erp.api.wm.request.GoodsSupplyBalanceGetRequest;
import com.ykcloud.soa.erp.api.wm.response.GoodsSupplyBalanceGetResponse;

/**
 * @Description:供应商结算相关业务
 * @author Song
 * @Date 2018年4月2日 下午4:33:39
 */
public interface WmSupplyBalanceService {
	//根据验收单状态，查询在指定日期内未结算的供应商
	public GoodsSupplyBalanceGetResponse  getGoodsSupBalance(GoodsSupplyBalanceGetRequest request);
}
