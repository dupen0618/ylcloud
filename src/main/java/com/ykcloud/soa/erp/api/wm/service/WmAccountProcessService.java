package com.ykcloud.soa.erp.api.wm.service;

import com.ykcloud.soa.erp.api.wm.request.WmProcessAccountRequest;
import com.ykcloud.soa.erp.api.wm.response.AffectRowsResponse;

public interface WmAccountProcessService {

    //单据入账
    AffectRowsResponse processAccount(WmProcessAccountRequest request);

}
