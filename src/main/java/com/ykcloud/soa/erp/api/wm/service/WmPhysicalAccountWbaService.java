package com.ykcloud.soa.erp.api.wm.service;

import com.ykcloud.soa.erp.api.wm.request.WmPhysicalAccountWbaGteByDateRequest;
import com.ykcloud.soa.erp.api.wm.response.WmPhysicalAccountWbaGteByDateResponse;

import java.util.List;

/**
 * Created by yiako on 2018/4/2
 */
public interface WmPhysicalAccountWbaService {

    List<WmPhysicalAccountWbaGteByDateResponse> wmPhysicalAccountWbaGteByDate(WmPhysicalAccountWbaGteByDateRequest request);

}
