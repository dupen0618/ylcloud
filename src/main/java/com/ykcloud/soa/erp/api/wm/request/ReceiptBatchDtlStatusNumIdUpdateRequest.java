package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.fi.model.BillDtlForWriteBackStatus;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @Author:ALi
 * @Description: 修改结算状态
 * @Date:
 */
public class ReceiptBatchDtlStatusNumIdUpdateRequest extends AbstractUserSessionRequest {
    private static final long serialVersionUID = -2685044443394375760L;
    private List<BillDtlForWriteBackStatus> billDtlForWriteBackStatusList;
    @NotNull(message = "结算状态不能为空! ")
    private Long statusNumId;

    public List<BillDtlForWriteBackStatus> getBillDtlForWriteBackStatusList() {
        return billDtlForWriteBackStatusList;
    }

    public void setBillDtlForWriteBackStatusList(List<BillDtlForWriteBackStatus> billDtlForWriteBackStatusList) {
        this.billDtlForWriteBackStatusList = billDtlForWriteBackStatusList;
    }

    public Long getStatusNumId() {
        return statusNumId;
    }

    public void setStatusNumId(Long statusNumId) {
        this.statusNumId = statusNumId;
    }

}
