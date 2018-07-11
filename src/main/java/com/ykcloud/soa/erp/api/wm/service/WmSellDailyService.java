package com.ykcloud.soa.erp.api.wm.service;


import com.ykcloud.soa.erp.api.wm.request.*;
import com.ykcloud.soa.erp.api.wm.response.BusinessAmountForGenKxCountResponse;
import com.ykcloud.soa.erp.api.wm.response.DataFromTmlGenerateResponse;
import com.ykcloud.soa.erp.api.wm.response.NegativeStockBatchAdjustmentResponse;
import com.ykcloud.soa.erp.api.wm.response.PoorInvertedExtrusionShipSellDailyCreateResponse;
import com.ykcloud.soa.erp.api.wm.response.PoorInvertedExtrusionShipSellDailyHdrCreateResponse;
import com.ykcloud.soa.erp.api.wm.response.SellDailyCollectResponse;
import com.ykcloud.soa.erp.api.wm.response.SuccessLogChangeResponse;
import com.ykcloud.soa.erp.api.wm.response.WmBatchForDailyAccountAdjustResponse;
import com.ykcloud.soa.erp.api.wm.response.WmSellDailyBatchForFinanceGetResponse;

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

	/**
	 * 统计销售收入
	 * @author henry.wang
	 *
	 * @param request
	 * @return
	 */
	BusinessAmountForGenKxCountResponse countSalesIncome(BusinessAmountForGenKxCountRequest request);

	/**
	 * 统计销售成本
	 * @author henry.wang
	 *
	 * @param request
	 * @return
	 */
	BusinessAmountForGenKxCountResponse countSalesCost(BusinessAmountForGenKxCountRequest request);

	/**
	 * 统计直送销售收入
	 * @author henry.wang
	 *
	 * @param request
	 * @return
	 */
	BusinessAmountForGenKxCountResponse countSalesIncomeDirectSend(BusinessAmountForGenKxCountRequest request);

	/**
	 * 统计直送销售成本
	 * @author henry.wang
	 *
	 * @param request
	 * @return
	 */
	BusinessAmountForGenKxCountResponse countSalesCostDirectSend(BusinessAmountForGenKxCountRequest request);

	/**
	 * 统计直通和配送销售收入
	 * @author henry.wang
	 *
	 * @param request
	 * @return
	 */
	BusinessAmountForGenKxCountResponse countSalesIncomeDirectWayAndDistribution(BusinessAmountForGenKxCountRequest request);

	/**
	 * 统计直通和配送销售成本
	 * @author henry.wang
	 *
	 * @param request
	 * @return
	 */
	BusinessAmountForGenKxCountResponse countSalesCostDirectWayAndDistribution(BusinessAmountForGenKxCountRequest request);


    /**
     * 生成倒挤差类型的出库日报
     */
    PoorInvertedExtrusionShipSellDailyCreateResponse createPoorInvertedExtrusionShipSellDaily(PoorInvertedExtrusionShipSellDailyCreateRequest request);
    
    /**
     * 倒挤差类型的出库单头汇总
     */
    PoorInvertedExtrusionShipSellDailyHdrCreateResponse createPoorInvertedExtrusionShipSellDailyHdr(PoorInvertedExtrusionShipSellDailyHdrCreateRequest request);
    
    /**
     * 查询出库日报批次扣减财务账
     */
    WmSellDailyBatchForFinanceGetResponse getWmSellDailyBatchForFinance(WmSellDailyBatchForFinanceGetRequest request);
    
    /**
     * 为出库日报调整物流批次(顺序消息接口)
     */
    WmBatchForDailyAccountAdjustResponse adjustWmBatchForDailyAccount(WmBatchForDailyAccountAdjustRequest request);
    
    /**
     * 修改成功日志表的状态
     */
    SuccessLogChangeResponse changeSuccessLog(SuccessLogChangeRequest request);
}
