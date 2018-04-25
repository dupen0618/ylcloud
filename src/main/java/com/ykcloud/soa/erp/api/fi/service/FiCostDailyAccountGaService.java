package com.ykcloud.soa.erp.api.fi.service;

import com.ykcloud.soa.erp.api.fi.request.LossAmount1AndFinalCostUpdateRequest;
import com.ykcloud.soa.erp.api.fi.response.LossAmount1AndFinalCostUpdaterResponse;
import com.ykcloud.soa.erp.api.fi.request.AccountForSellDetermineInventoryByClassifyNumIdProcessRequest;
import com.ykcloud.soa.erp.api.fi.request.AccountForStockCheckByClassifyNumIdProcessRequest;
import com.ykcloud.soa.erp.api.wm.request.CarryDownDailyFiRequest;
import com.ykcloud.soa.erp.api.fi.response.AccountForSellDetermineInventoryByClassifyNumIdProcessResponse;
import com.ykcloud.soa.erp.api.fi.response.AccountForStockCheckByClassifyNumIdProcessResponse;
import com.ykcloud.soa.erp.api.wm.response.CarryDownDailyFiResponse;

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
	 * 生产盘点财务成本处理（归集码拨入）
	 *
	 * @param request
	 * @return
	 */
	AccountForStockCheckByClassifyNumIdProcessResponse processAccountForStockCheckByClassifyNumId(
		AccountForStockCheckByClassifyNumIdProcessRequest request);

	/**
	 * 
	* @Title: fiDailyCarryDown  
	* @Description: 加权平均日进销存结转
	* @param @param request
	* @param @return    参数  
	* @return CarryDownDailyFiResponse    返回类型  
	* @throws
	 */
	CarryDownDailyFiResponse fiDailyCarryDown(CarryDownDailyFiRequest request);

	/**
	 * 以销定入商品日结财务成本处理（归集码拨出）
	 *
	 * @param request
	 * @return
	 */
	AccountForSellDetermineInventoryByClassifyNumIdProcessResponse processAccountForSellDetermineInventoryByClassifyNumId(
		AccountForSellDetermineInventoryByClassifyNumIdProcessRequest request);
}
