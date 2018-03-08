package com.ykcloud.soa.erp.api.scm.service;


import com.ykcloud.soa.erp.api.scm.request.DirectWayReplenishweeklyDayFlagGetRequest;
import com.ykcloud.soa.erp.api.scm.response.DirectWayReplenishweeklyDayFlagGetResponse;
import com.ykcloud.soa.erp.api.scm.request.DirectWayEffectiveDayForMulitiShopGetRequest;
import com.ykcloud.soa.erp.api.scm.response.DirectWayEffectiveDayForMulitiShopGetReponse;
/***
*
@author hank.zhu
@date 2018年3月7日 上午11:21:01 新建
*/
public interface ScmSupplyService {
   public DirectWayReplenishweeklyDayFlagGetResponse getDirectWayReplenishweeklyDayFlag(DirectWayReplenishweeklyDayFlagGetRequest Request);	
   public DirectWayEffectiveDayForMulitiShopGetReponse getDirectWayEffectiveDayForMulitiShop(DirectWayEffectiveDayForMulitiShopGetRequest request);


}
