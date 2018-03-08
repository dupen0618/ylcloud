package com.ykcloud.soa.erp.api.scm.service;

import com.ykcloud.soa.erp.api.scm.request.DirectWayReplenishweeklyDayFlagGetRequest;
import com.ykcloud.soa.erp.api.scm.response.DirectWayReplenishweeklyDayFlagGetResponse;

/***
*
@author hank.zhu
@date 2018年3月7日 上午11:21:01 新建
*/
public interface ScmSupplyService {
   public DirectWayReplenishweeklyDayFlagGetResponse getDirectWayReplenishweeklyDayFlag(DirectWayReplenishweeklyDayFlagGetRequest Request);
}
