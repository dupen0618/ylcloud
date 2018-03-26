package com.ykcloud.soa.erp.api.scm.service;

import com.ykcloud.soa.erp.api.scm.request.DirectDeliveryReplenishweeklyDayFlagAndEffectiveDayGetRequest;
import com.ykcloud.soa.erp.api.scm.request.DirectWayReplenishweeklyDayFlagGetRequest;
import com.ykcloud.soa.erp.api.scm.response.DirectDeliveryReplenishweeklyDayFlagAndEffectiveDayGetResponse;
import com.ykcloud.soa.erp.api.scm.response.DirectWayReplenishweeklyDayFlagGetResponse;

public interface ScmSupplyService {
  
	//获得直通门店供货商订货周期
  	public DirectWayReplenishweeklyDayFlagGetResponse getDirectWayReplenishweeklyDayFlag(DirectWayReplenishweeklyDayFlagGetRequest Request);

  	//查询直送门店的供应商订货周期、有效天数
  	public DirectDeliveryReplenishweeklyDayFlagAndEffectiveDayGetResponse  getDirectDeliveryReplenishweeklyDayFlagAndEffectiveDay(
  			DirectDeliveryReplenishweeklyDayFlagAndEffectiveDayGetRequest request);

  	
}
