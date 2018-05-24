package com.ykcloud.soa.erp.api.wm.service;

import com.ykcloud.soa.erp.api.wm.request.WmadjustCostRequest;
import com.ykcloud.soa.erp.api.wm.response.WmadjustCostResponse;

/**
 * 库存金额调整
 * @author tz.x
 * @date 2018年5月15日下午1:27:48
 */
public interface WmCostAdjustServiceBak {
	
	/**
	 * 库存金额调整路由接口
	 * @author tz.x
	 * @date 2018年5月22日下午5:31:15
	 */
	public WmadjustCostResponse adjustWmCost(WmadjustCostRequest request);

}
