package com.ykcloud.soa.erp.api.fi.model;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @Author:ALi
 * @Description: TODO
 * @Date:
 */
public class SupBalanceBillAppoint implements Serializable {
    private static final long serialVersionUID = 1L;
    @NotNull(message = "发生门店不能为空！")
    private Long balanceSubUnitNumId;
    @NotNull(message = "税率不能为空！")
    private Double taxRate;
    @NotNull(message = "供应商不能为空！")
    private Long supplyUnitNumId;
    @NotNull(message = "结算方式不能为空！")
    private Long settlementType;
    @NotNull(message = "单据编号不能为空！")
    private String reservedNo;
    @NotNull(message = "单据类型不能为空！")
    private  Long  reservedTypeNumId;
    @NotNull(message = "到扣率不能为空！")
    private  Double backoffRate;

    public Long getBalanceSubUnitNumId() {
        return balanceSubUnitNumId;
    }

    public void setBalanceSubUnitNumId(Long balanceSubUnitNumId) {
        this.balanceSubUnitNumId = balanceSubUnitNumId;
    }

    public Double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
    }

    public Long getSupplyUnitNumId() {
        return supplyUnitNumId;
    }

    public void setSupplyUnitNumId(Long supplyUnitNumId) {
        this.supplyUnitNumId = supplyUnitNumId;
    }

    public Long getSettlementType() {
        return settlementType;
    }

    public void setSettlementType(Long settlementType) {
        this.settlementType = settlementType;
    }

    public String getReservedNo() {
        return reservedNo;
    }

    public void setReservedNo(String reservedNo) {
        this.reservedNo = reservedNo;
    }

    public Long getReservedTypeNumId() {
        return reservedTypeNumId;
    }

    public void setReservedTypeNumId(Long reservedTypeNumId) {
        this.reservedTypeNumId = reservedTypeNumId;
    }

    public Double getBackoffRate() {
        return backoffRate;
    }

    public void setBackoffRate(Double backoffRate) {
        this.backoffRate = backoffRate;
    }
}
