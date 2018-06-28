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
public class BatchDtlStatusNumIdForSellOffUpdateRequest extends AbstractUserSessionRequest {
    private static final long serialVersionUID = -3101956261800131597L;
    List<BillDtlForWriteBackStatus> billDtlForWriteBackStatusList;
    Long statusNumId;
    Long headStatusNumId;
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

    public Long getBalanceVersion() {
        return balanceVersion;
    }

    public void setBalanceVersion(Long balanceVersion) {
        this.balanceVersion = balanceVersion;
    }

    public Long getHeadStatusNumId() {
        return headStatusNumId;
    }

    public void setHeadStatusNumId(Long headStatusNumId) {
        this.headStatusNumId = headStatusNumId;
    }
}
