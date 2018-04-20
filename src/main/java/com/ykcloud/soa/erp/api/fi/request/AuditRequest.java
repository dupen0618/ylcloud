package com.ykcloud.soa.erp.api.fi.request;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

import javax.validation.constraints.NotNull;

/**
 * @Description: 审核
 * @Author: ALi
 * @Date: 2018/4/20 18:02
 */
public class AuditRequest extends AbstractUserSessionRequest {
    private static final long serialVersionUID = -1766553622327456524L;
    @NotNull(message = "业务类型不能为空！")
    private  Long typeNumId;
    @NotNull(message = "结算单号不能为空！")
    private  String balanceNo;

    public Long getTypeNumId() {
        return typeNumId;
    }

    public void setTypeNumId(Long typeNumId) {
        this.typeNumId = typeNumId;
    }

    public String getBalanceNo() {
        return balanceNo;
    }

    public void setBalanceNo(String balanceNo) {
        this.balanceNo = balanceNo;
    }
}
