package com.ykcloud.soa.erp.api.fi.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * 根据结算单号和日期批量生成付款单号
 *
 * @author Sealin
 * @date 2018-07-16
 */
public class GenerateBatchPayBillRequest extends AbstractUserSessionRequest {
    private static final long serialVersionUID = -3652538093893241616L;
    @NotNull(message = "门店编号不能为空")
    private Long subUnitNumId;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @NotNull(message = "结算日期不能为空")
    private Date banalceDate;
    @NotNull(message = "结算单号不能为空")
    private String balanceNo;

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }

    public Date getBanalceDate() {
        return banalceDate;
    }

    public void setBanalceDate(Date banalceDate) {
        this.banalceDate = banalceDate;
    }

    public String getBalanceNo() {
        return balanceNo;
    }

    public void setBalanceNo(String balanceNo) {
        this.balanceNo = balanceNo;
    }
}
