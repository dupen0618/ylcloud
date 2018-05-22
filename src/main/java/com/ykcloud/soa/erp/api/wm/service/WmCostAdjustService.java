package com.ykcloud.soa.erp.api.wm.service;

import com.ykcloud.soa.erp.api.wm.request.WmBlBatchDtlQuest;
import com.ykcloud.soa.erp.api.wm.request.WmCostByAdjustPriceAdjustRequest;
import com.ykcloud.soa.erp.api.wm.request.WmCostByScmChangeCostRequest;
import com.ykcloud.soa.erp.api.wm.response.WmBLBatchDTLAllotResponse;
import com.ykcloud.soa.erp.api.wm.response.WmCostByAdjustPriceAdjustResponse;
import com.ykcloud.soa.erp.api.wm.response.WmCostByScmChangeCostResponse;
import com.ykcloud.soa.erp.api.wm.request.WmCostByCostPriceAdjustRequest;
import com.ykcloud.soa.erp.api.wm.response.WmCostByCostPriceAdjustResponse;

/**
 * 库存金额调整
 * @author tz.x
 * @date 2018年5月15日下午1:27:48
 */

public interface WmCostAdjustService {
	
	/**
	 * 调价(不指定批次，不管批次明细中现有价格)【全部调整成新进价】
	 * @author tz.x
	 * @date 2018年5月15日下午1:49:01
	 */
	public WmCostByAdjustPriceAdjustResponse adjustWmCostByAdjustPrice(WmCostByAdjustPriceAdjustRequest request);

	 /**
	  * @author alfred  
	  * @date 2018/5/16 10:35
	  * @description 在scm中的ScmChangeCost审核时候调用此方法
	  */
	public WmCostByScmChangeCostResponse adjustWmCostByScmChangeCost(WmCostByScmChangeCostRequest request);


	
	
	/**
	 * @Description:固定价格调价(批次明细中价格等于CostPrice都需要调整)调整批次明细中指定价格的库存金额
	 * @author Song
	 * @Date 2018年5月16日 上午11:29:16
	 */
	public WmCostByCostPriceAdjustResponse adjustWmCostByCostPrice(WmCostByCostPriceAdjustRequest request);
	
	/**
	 * @Description:根据进价调整标的要求调整Price字段中的价格
	 * @author 殷剑
	 * @Date 2018/5/22
	 */
    WmBLBatchDTLAllotResponse updateBatchPrice(WmBlBatchDtlQuest request);
    
    /**
     * @Description:只调低价格(不指定批次，只调整批次明细中价格比AdjustPrice高的)，【调低不调高】
	 * @author 殷剑
	 * @Date 2018/5/22
     */
    WmBLBatchDTLAllotResponse updateLowPrice(WmBlBatchDtlQuest request);
}
