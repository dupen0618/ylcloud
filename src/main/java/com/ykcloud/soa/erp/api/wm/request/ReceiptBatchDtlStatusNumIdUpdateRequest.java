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
    @NotNull(message = "结算版本不能为空,为0时到明细,为1时到汇总")
    private Long balanceVersion = 0L;

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

    /**
     * 获取 balanceVersion
     *
     * @author Sealin
     */
    public Long getBalanceVersion() {
        return balanceVersion;
    }

    /**
     * 设置 balanceVersion
     *
     * @author Sealin
     * @param balanceVersion
     */
    public void setBalanceVersion(Long balanceVersion) {
        this.balanceVersion = balanceVersion;
    }
}
