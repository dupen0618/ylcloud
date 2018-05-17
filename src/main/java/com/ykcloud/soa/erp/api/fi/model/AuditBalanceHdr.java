package com.ykcloud.soa.erp.api.fi.model;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

/**
 * @Author:ALi
 * @Description: TODO
 * @Date:
 */
public class AuditBalanceHdr  implements Serializable {
    private static final long serialVersionUID = 1L;
    @NotNull(message = "门店编号不能为空！")
    private Long subUnitNumId;
    @NotNull(message = "结算单号不能为空！")
    private String balanceNo;

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
}
