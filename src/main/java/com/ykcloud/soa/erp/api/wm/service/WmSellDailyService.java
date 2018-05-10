package com.ykcloud.soa.erp.api.wm.service;


import com.ykcloud.soa.erp.api.wm.request.*;
import com.ykcloud.soa.erp.api.wm.response.DataFromTmlGenerateResponse;
import com.ykcloud.soa.erp.api.wm.response.NegativeStockBatchAdjustmentResponse;
import com.ykcloud.soa.erp.api.wm.response.SellDailyCollectResponse;
import com.ykcloud.soa.erp.api.wm.response.SellDailyGetResponse;
import com.ykcloud.soa.erp.api.wm.response.SellDailySeriesUpdateResponse;

/**
 * @Description:零售销售出库日报明细
 * @author ALi
 * @Date 2018年4月2日 下午4:33:39
 */
public interface WmSellDailyService {
	//根据结算方式，查询在指定日期内未结算的销售日报
	public SellDailyGetResponse getSubBlanceDtlInfoBySellDaily(SellDailyGetRequest request);

	//查询指定销售日报
	public SellDailyGetResponse getSubBlanceDtlInfoBySeries(SellDailyBySeriesGetRequest request);

	//查询指定销售日报的行号
	public SellDailyGetResponse getSellDailyInfo(SeriesBySellDailyGetRequest request);

	//修改销售日报结算状态
	public SellDailySeriesUpdateResponse updateStatusNumId(SellDailyUpdateRequest request);

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
