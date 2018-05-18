package com.ykcloud.soa.erp.api.wm.service;

import com.ykcloud.soa.erp.api.wm.request.WmCostAdjustRequest;
import com.ykcloud.soa.erp.api.wm.request.WmCostByAdjustPriceAdjustRequest;
import com.ykcloud.soa.erp.api.wm.request.WmCostByScmChangeCostRequest;
import com.ykcloud.soa.erp.api.wm.response.WmCostAdjustResponse;
import com.ykcloud.soa.erp.api.wm.response.WmCostByAdjustPriceAdjustResponse;
import com.ykcloud.soa.erp.api.wm.response.WmCostByScmChangeCostResponse;

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


	
}
