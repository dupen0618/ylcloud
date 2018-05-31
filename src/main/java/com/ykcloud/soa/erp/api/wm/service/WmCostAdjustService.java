package com.ykcloud.soa.erp.api.wm.service;

import com.ykcloud.soa.erp.api.wm.request.WmCostByScmChangeCostRequest;
import com.ykcloud.soa.erp.api.wm.request.WmAdjustCostRequest;
import com.ykcloud.soa.erp.api.wm.response.AdjustCostByScmChangeCostResponse;
import com.ykcloud.soa.erp.api.wm.response.WmAdjustCostResponse;

/**
 * 库存金额调整
 * @author tz.x
 * @date 2018年5月15日下午1:27:48
 */

public interface WmCostAdjustService {
	
	/**
	 * 库存金额调整路由接口
	 * @author tz.x
	 * @date 2018年5月22日下午5:31:15
	 */
	public WmAdjustCostResponse adjustWmCost(WmAdjustCostRequest request);
	
	 /**
	  * @author alfred  
	  * @date 2018/5/16 10:35
	  * @description 在scm中的ScmChangeCost审核时候调用此方法
	  */
	public AdjustCostByScmChangeCostResponse adjustWmCostByScmChangeCost(WmCostByScmChangeCostRequest request);
	
}
