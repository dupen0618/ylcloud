package com.ykcloud.soa.erp.api.scm.service;

import com.ykcloud.soa.erp.api.scm.request.*;
import com.ykcloud.soa.erp.api.scm.response.*;

/**
 * @author alfred
 * @date 2018/5/14 21:29
 * @description
 */
public interface ScmBlChangeCostService {

	/**
	 * 进价调整审核
	 * @author tz.x
	 * @date 2018年6月26日上午11:25:58
	 */
	public ChangeCostAuditResponse auditChangeCost(ChangeCostAuditRequest request);

     /**
      * @author alfred
      * @date 2018/5/22 12:08
      * @description 日结调用
      */
     public DailySettlementAdjustWmInventoryCostResponse adjustWmInventoryCostForDailyCarry (DailySettlementAdjustWmInventoryCostRequest request);
     
     /**
      * 获取价格调整数据
      * @Description:   
      * @author zhaokang 
      * @date 2018年6月22日
      */
     public PmCostGetResponse getPmCost(PmCostGetRequest request);
	/**
	 * @author alfred
	 * @date 2018/5/14 21:30
	 * @description 调整库存成本金额
	 */
	public ScmBlChangeCostResponse adjustWmInventoryCost(ScmBlChangeCostRequest request);

	 /**
     * 进价调整生成至销售成本调整
     * @Description:   
     * @author zhaokang 
     * @date 2018年6月26日
     */
    public SalesCostAdjustedResponse adjustSalesCost(SalesCostAdjustedRequest request);


    DMAuditResponse auditDm(DMAuditRequest request);
}
