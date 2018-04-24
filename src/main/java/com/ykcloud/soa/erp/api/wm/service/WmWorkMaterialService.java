package com.ykcloud.soa.erp.api.wm.service;

import com.ykcloud.soa.erp.api.wm.request.OutWorkMatConfirmRequest;
import com.ykcloud.soa.erp.api.wm.response.OutWorkMatConfirmResponse;

/**
 * fakir
 * 2018/4/23
 */
public interface WmWorkMaterialService {

    //生成领料单入账
    public OutWorkMatConfirmResponse confirmOutWorkMat(OutWorkMatConfirmRequest request);
}
