/**
 * @Description: 批次明细表操作接口
 * @Author: 殷剑
 * @Date: 2018/5/12 13:24
 */
package com.ykcloud.soa.erp.api.fi.service;

import com.ykcloud.soa.erp.api.fi.request.FiBatchAccountGaRequest;
import com.ykcloud.soa.erp.api.fi.response.FiBatchDailyAccountGaResponse;

public interface FiBatchDailyAccountGaService {
	
	//得到指定批次的ADJUST_QTY和batch_series
	public FiBatchDailyAccountGaResponse getAdjustPriceObj(FiBatchAccountGaRequest request);
	//列出ADJUST_QTY和batch_series
	public FiBatchDailyAccountGaResponse listAdjustQty(FiBatchAccountGaRequest request);
	
	//更新批次日进销存中的ADJUST_AMOUNT
	FiBatchDailyAccountGaResponse updateAdjustAmount(FiBatchAccountGaRequest request);
	
}
