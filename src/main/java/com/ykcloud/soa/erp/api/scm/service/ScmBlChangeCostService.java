package com.ykcloud.soa.erp.api.scm.service;

import com.ykcloud.soa.erp.api.scm.request.ChangePriceAuditRequest;
import com.ykcloud.soa.erp.api.scm.request.ChangeVipPriceAuditRequest;
import com.ykcloud.soa.erp.api.scm.request.DMAuditRequest;
import com.ykcloud.soa.erp.api.scm.request.ChangeCostAuditRequest;
import com.ykcloud.soa.erp.api.scm.request.DailySettlementAdjustWmInventoryCostRequest;
import com.ykcloud.soa.erp.api.scm.request.PmCostGetRequest;
import com.ykcloud.soa.erp.api.scm.request.PriceCatAuditRequest;
import com.ykcloud.soa.erp.api.scm.request.SalesCostAdjustedRequest;
import com.ykcloud.soa.erp.api.scm.request.LatelyCostForDayCarryRefreshRequest;
import com.ykcloud.soa.erp.api.scm.request.ScmBlChangeCostRequest;
import com.ykcloud.soa.erp.api.scm.response.ChangePriceAuditResponse;
import com.ykcloud.soa.erp.api.scm.response.ChangeVipPriceAuditResponse;
import com.ykcloud.soa.erp.api.scm.response.DMAuditResponse;
import com.ykcloud.soa.erp.api.scm.response.ChangeCostAuditResponse;
import com.ykcloud.soa.erp.api.scm.response.DailySettlementAdjustWmInventoryCostResponse;
import com.ykcloud.soa.erp.api.scm.response.PmCostGetResponse;
import com.ykcloud.soa.erp.api.scm.response.PriceCatAuditResponse;
import com.ykcloud.soa.erp.api.scm.response.SalesCostAdjustedResponse;
import com.ykcloud.soa.erp.api.scm.response.LatelyCostForDayCarryRefreshResponse;
import com.ykcloud.soa.erp.api.scm.response.ScmBlChangeCostResponse;

/**
 * @author alfred
 * @date 2018/5/14 21:29
 * @description
 */
public interface ScmBlChangeCostService {
	
	/**
	 * 日结刷新进价
	 * @author tz.x
	 * @date 2018年6月27日上午8:51:20
	 */
	public LatelyCostForDayCarryRefreshResponse refreshLatelyCostForDayCarry(LatelyCostForDayCarryRefreshRequest request);

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
      * 售价（临时/永久）调整审核
      * @author penghui
      * @return
      */
     public ChangePriceAuditResponse auditChangePrice(ChangePriceAuditRequest request);
     
     /**
      * 会员售价调整审核
      * @param request
      * @return
      */
     public ChangeVipPriceAuditResponse auditChangeVipPrice(ChangeVipPriceAuditRequest request);
     
     

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
    
    /**
     * 削价单审核
     * @author penghui
     * @return
     */
    public PriceCatAuditResponse auditPriceCut(PriceCatAuditRequest request);
}
