/**
 * 
 */
package com.ykcloud.soa.erp.api.fi.service;

import com.ykcloud.soa.erp.api.fi.request.FiCostMonthAccountGaRequest;
import com.ykcloud.soa.erp.api.fi.response.FiCostMonthAccountGaResponse;

/**
 * @author 殷剑
 *
 */
public interface FiCostMonthAccountGaService {
	
	//增加商品成本日进销存中的ADJUST_AMOUNT，减少FINAL_COST
	FiCostMonthAccountGaResponse updateAdjustAmount(FiCostMonthAccountGaRequest request);

}
