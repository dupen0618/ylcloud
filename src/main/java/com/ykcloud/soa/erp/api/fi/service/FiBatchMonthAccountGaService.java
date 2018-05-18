/**
 * 
 */
package com.ykcloud.soa.erp.api.fi.service;

import java.util.List;

import com.ykcloud.soa.erp.api.fi.model.AdjustPriceForApi;
import com.ykcloud.soa.erp.api.fi.request.FiBatchAccountGaRequest;
import com.ykcloud.soa.erp.api.fi.response.FiBatchMonthAccountGaResponse;

/**
 * @author 殷剑
 * @Date 2018/4/10 11:30
 * @Description: FI_BATCH_MONTH_Account_GA(批次月进销存)操作接口
 */
public interface FiBatchMonthAccountGaService {
	
	//列出ADJUST_QTY和batch_series
		public List<AdjustPriceForApi> listAdjustQty(FiBatchAccountGaRequest request);
	//更新批次日进销存中的ADJUST_AMOUNT
	FiBatchMonthAccountGaResponse updateAdjustAmount(FiBatchAccountGaRequest request);
}
