/**
 * 
 */
package com.ykcloud.soa.erp.api.fi.service;

import com.ykcloud.soa.erp.api.fi.request.FiBatchAccountGaRequest;
import com.ykcloud.soa.erp.api.fi.response.FiBatchMonthAccountGaResponse;

/**
 * @author 殷剑
 * @Date 2018/4/10 11:30
 * @Description: FI_BATCH_MONTH_Account_GA(批次月进销存)操作接口
 */
public interface FiBatchMonthAccountGaService {
	
	//得到指定批次的ADJUST_QTY和batch_series
	public FiBatchMonthAccountGaResponse getAdjustPriceObj(FiBatchAccountGaRequest request);
		
	//列出ADJUST_QTY和batch_series
	public FiBatchMonthAccountGaResponse listAdjustQty(FiBatchAccountGaRequest request);
	//更新批次日进销存中的ADJUST_AMOUNT
	FiBatchMonthAccountGaResponse updateAdjustAmount(FiBatchAccountGaRequest request);
}
