package com.ykcloud.soa.erp.api.fi.service;

import com.ykcloud.soa.erp.api.fi.request.*;
import com.ykcloud.soa.erp.api.fi.response.*;
import com.ykcloud.soa.erp.api.wm.request.CostDailyAccountRequest;
import com.ykcloud.soa.erp.api.wm.response.CostDailyAccountResponse;

/**
 * 
  * @ClassName: FiCostDailyAccountGaService  
  * @Description: 商品日进销存
  * @author Andy
  * @date 2018-04-18 11:28
  *
 */
public interface FiCostDailyAccountGaService {
	
	/**
	 * 更新供货方财务在途金额和税金
	 * @author tz.x
	 * @date 2018年5月18日下午2:53:08
	 */
	public ReceiptOnLoadInBatchMonthAccountAdjustResponse adjustReceiptOnLoadInBatchMonthAccount(ReceiptOnLoadInBatchMonthAccountAdjustRequest request);
	
	/**
	 * 调整商品成本日月进销存
	 * @author tz.x
	 * @date 2018年5月16日上午11:24:39
	 */
	public CostAmountAndTaxAmountAdjustResponse adjustCostAmountAndTaxAmount(CostAmountAndTaxAmountAdjustRequest request);
	
	/**
	 * 调整加权平均价格
	 * @author tz.x
	 * @date 2018年5月16日下午5:02:48
	 */
	public AdjustWeightedAveragePriceResponse adjustWeightedAveragePriceResponse(AdjustWeightedAveragePriceRequest request);
	
	/**
	 * 调整批次日进销存 调整金额，调整税金
	 * @author tz.x
	 * @date 2018年5月16日上午11:24:39
	 */
	public BatchAmountAndTaxAmountAdjustResponse adjustBatchAmountAndTaxAmount(BatchAmountAndTaxAmountAdjustRequest request);

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
	CostDailyAccountResponse carryCostDailyAccount(CostDailyAccountRequest request);

	/**
	 * 以销定入商品日结财务成本处理（归集码拨出）
	 *
	 * @param request
	 * @return
	 */
	AccountForSellDetermineInventoryByClassifyNumIdProcessResponse processAccountForSellDetermineInventoryByClassifyNumId(
		AccountForSellDetermineInventoryByClassifyNumIdProcessRequest request);


	/**
	 * 计算销售毛利
	 * @param reuqest
	 * @return
	 */
	CalcSaleGrossProfitResponse calcSaleGrossProfit(CalcSaleGrossProfitRequest reuqest);
	/**
	 * 调整日月进销存数量
	 * @param request
	 * @return
	 */
	DailyAndMonthCostAdjustResponse adjustDailyAndMonthCost(DailyAndMonthCostAdjustRequest request);
    
	/** 
	* @Description: 新增日月进销存
	* @Author: fred.zhao
	* @Date: 2018/5/11 
	*/ 
    VirtualDailyAndMonthCostGenerateResponse addVirtualDailyAndMonthCost(VirtualDailyAndMonthCostGenerateRequest request);
	
    /**
     * 商品移动加权权重表 结转
     * @param request
     * @return
     */
    GoodsMoveWeightingCarryOverResponse carryOverGoodsMoveWeighting(GoodsMoveWeightingCarryOverRequest request);

     /**
      * @author alfred.liu
      * @date 2018/6/20 16:36
      * @description 客户结算毛利(代销)
      */
	 CustomerGrossProfitSettlementResponse settlementCustomerGrossProfit(CustomerGrossProfitSettlementRequest request);
}
