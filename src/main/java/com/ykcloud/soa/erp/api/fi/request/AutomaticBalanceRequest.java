package com.ykcloud.soa.erp.api.fi.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @Description: 自动生成
 * @Author: ALi
 * @Date: 2018/4/23 15:09
 */
public class AutomaticBalanceRequest extends AbstractUserSessionRequest {
    private static final long serialVersionUID = -1766553622327456524L;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @NotNull(message = "结算日期不能为空！")
    private Date balanceDate;
    @NotNull(message = "门店编号不能为空！")
    private Long subUnitNumId;

    public Date getBalanceDate() {
        return balanceDate;
    }

    public void setBalanceDate(Date balanceDate) {
        this.balanceDate = balanceDate;
    }

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }
}
