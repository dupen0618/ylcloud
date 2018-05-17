package com.ykcloud.soa.erp.api.wm.service;


import com.ykcloud.soa.erp.api.wm.request.*;
import com.ykcloud.soa.erp.api.wm.response.DataFromTmlGenerateResponse;
import com.ykcloud.soa.erp.api.wm.response.NegativeStockBatchAdjustmentResponse;
import com.ykcloud.soa.erp.api.wm.response.SellDailyCollectResponse;

/**
 * @Description:零售销售出库日报明细
 * @author ALi
 * @Date 2018年4月2日 下午4:33:39
 */
public interface WmSellDailyService {

	public DataFromTmlGenerateResponse generateDataFromTml(DataFromTmlGenerateRequest request);

	/**
	 * 根据销售日期获取出库日报明细汇总信息
	 * @author	shenq
	 * @param request
	 * @return
	 */
	public SellDailyCollectResponse collectSellDailyDtl(SellDailyCollectRequest request);


	//public SellDailyPurchaseSellResponse getSellDailyPsCostAmount(SellDailyPurchaseSellRequest request);
	
	public NegativeStockBatchAdjustmentResponse adjustmentNegativeStockBatch(NegativeStockBatchAdjustmentRequest request);

}
