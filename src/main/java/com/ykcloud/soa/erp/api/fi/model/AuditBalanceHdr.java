package com.ykcloud.soa.erp.api.fi.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @Author:ALi
 * @Description: TODO
 * @Date:
 */
public class AuditBalanceHdr  implements Serializable {
    private static final long serialVersionUID = 1L;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @NotNull(message = "结算日期不能为空！")
    private Date balanceDate;
    @NotNull(message = "结算单号不能为空！")
    private String balanceNo;

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
}
