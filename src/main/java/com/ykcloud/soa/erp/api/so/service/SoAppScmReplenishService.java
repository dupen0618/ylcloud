package com.ykcloud.soa.erp.api.so.service;

import com.ykcloud.soa.erp.api.so.request.ReturnApplyAuditRequest;
import com.ykcloud.soa.erp.api.so.response.ReturnApplyAuditResponse;

/**
 * @Author: fred.zhao
 * @Description: 退货申请主管审核
 * @Date: Created in 11:17:2018/4/7
 */
public interface SoAppScmReplenishService  {
    public ReturnApplyAuditResponse auditReturnApply(ReturnApplyAuditRequest request);
}
