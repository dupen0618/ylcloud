package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

import javax.validation.constraints.NotNull;

/**
 * Created by yiako on 2018/3/28
 */
public class MaterialProcessingFromGetByWorkNumIdRequest extends AbstractRequest {

    @NotNull(message = "加工单号")
    private Long workNumId;//加工单号

    @NotNull(message = "业务单号")
    private String billTypeNumId;//业务类型编号

    @NotNull(message = "单据类型")
    private Long typeNumId;//单据类型

    @NotNull(message = "入账类型不能为空！")
    String accountName;

    public Long getWorkNumId() {
        return workNumId;
    }

    public void setWorkNumId(Long workNumId) {
        this.workNumId = workNumId;
    }

    public String getBillTypeNumId() {
        return billTypeNumId;
    }

    public void setBillTypeNumId(String billTypeNumId) {
        this.billTypeNumId = billTypeNumId;
    }

    public Long getTypeNumId() {
        return typeNumId;
    }

    public void setTypeNumId(Long typeNumId) {
        this.typeNumId = typeNumId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
}
