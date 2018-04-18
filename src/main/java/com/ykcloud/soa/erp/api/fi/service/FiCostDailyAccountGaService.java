package com.ykcloud.soa.erp.api.fi.service;

import com.ykcloud.soa.erp.api.fi.request.LossAmount1AndFinalCostUpdateRequest;
import com.ykcloud.soa.erp.api.fi.response.LossAmount1AndFinalCostUpdaterResponse;
import com.ykcloud.soa.erp.api.wm.request.AccountForStockCheckByClassifyNumIdProcessRequest;
import com.ykcloud.soa.erp.api.wm.response.AccountForStockCheckByClassifyNumIdProcessResponse;

/**
 * 
  * @ClassName: FiCostDailyAccountGaService  
  * @Description: 商品日进销存
  * @author Andy  
  * @date 2018-04-18 11:28
  *
 */
public interface FiCostDailyAccountGaService {

	//更新损耗金额和期末成本
	public LossAmount1AndFinalCostUpdaterResponse updateLossAmount1AndFinalCost(LossAmount1AndFinalCostUpdateRequest request);

	/**
	 * 按归集码商品处理盘点财务账
	 *
	 * @param request
	 * @return
	 */
	AccountForStockCheckByClassifyNumIdProcessResponse processAccountForStockCheckByClassifyNumId(
		AccountForStockCheckByClassifyNumIdProcessRequest request);
}
