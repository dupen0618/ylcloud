
package com.ykcloud.soa.erp.api.scm.service;
import com.ykcloud.soa.erp.api.scm.request.DirectDeliveryReplenishweeklyDayFlagAndEffectiveDayGetRequest;
import com.ykcloud.soa.erp.api.scm.response.DirectDeliveryReplenishweeklyDayFlagAndEffectiveDayGetResponse;
/***
*供应商服务类
@author hank.zhu
@date 2018年3月7日 上午11:21:01 新建
*/
public interface ScmSupplyService {
	
	//获得直送门店供货商订货周期，和有效天数
	public DirectDeliveryReplenishweeklyDayFlagAndEffectiveDayGetResponse getDirectDeliveryReplenishweeklyDayFlagAndEffectiveDay(DirectDeliveryReplenishweeklyDayFlagAndEffectiveDayGetRequest request);
	
}




  




