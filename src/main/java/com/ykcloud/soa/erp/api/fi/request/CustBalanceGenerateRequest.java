package com.ykcloud.soa.erp.api.fi.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author Sealin
 * Created on 2018-06-01
 */
public class CustBalanceGenerateRequest extends AbstractUserSessionRequest {
    private static final long serialVersionUID = 1783076551127999999L;
    @NotNull(message = "门店必填")
    private Long subUnitNumId;
    @NotNull(message = "供应商编号必填")
    private Long unitNumId;
    @NotNull(message = "结算单号必填")
    private String balanceNo;
    @NotNull(message = "结算日期必填")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date balanceDate;
    /**
     * 跨子公司标识
     */
    @NotNull(message = "跨子公司标识必填")
    private Long crossSubCompanySign;

    public Long getUnitNumId() {
        return unitNumId;
    }

    public void setUnitNumId(Long unitNumId) {
        this.unitNumId = unitNumId;
    }

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }

    public String getBalanceNo() {
        return balanceNo;
    }

    public void setBalanceNo(String balanceNo) {
        this.balanceNo = balanceNo;
    }

    public Date getBalanceDate() {
        return balanceDate;
    }

    public void setBalanceDate(Date balanceDate) {
        this.balanceDate = balanceDate;
    }

    public Long getCrossSubCompanySign() {
        return crossSubCompanySign;
    }

    public void setCrossSubCompanySign(Long crossSubCompanySign) {
        this.crossSubCompanySign = crossSubCompanySign;
    }
}
