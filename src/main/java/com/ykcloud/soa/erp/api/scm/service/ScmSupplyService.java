
package com.ykcloud.soa.erp.api.scm.service;
import com.ykcloud.soa.erp.api.scm.request.DirectDeliveryReplenishweeklyDayFlagAndEffectiveDayGetRequest;
import com.ykcloud.soa.erp.api.scm.request.DirectWayReplenishweeklyDayFlagGetRequest;
import com.ykcloud.soa.erp.api.scm.response.DirectDeliveryReplenishweeklyDayFlagAndEffectiveDayGetResponse;
import com.ykcloud.soa.erp.api.scm.response.DirectWayReplenishweeklyDayFlagGetResponse;
/***
*供应商服务类
@author hank.zhu
@date 2018年3月7日 上午11:21:01 新建
*/
public interface ScmSupplyService {
	


	//待实现
	//获得直通门店供货商订货周期
	//public DirectWayReplenishweeklyDayFlagGetResponse getDirectWayReplenishweeklyDayFlag(DirectWayReplenishweeklyDayFlagGetRequest Request);

	//查询直送门店的供应商订货周期、有效天数
	public DirectDeliveryReplenishweeklyDayFlagAndEffectiveDayGetResponse  getDirectDeliveryReplenishweeklyDayFlagAndEffectiveDay(
			DirectDeliveryReplenishweeklyDayFlagAndEffectiveDayGetRequest request);

	

	
}




  




