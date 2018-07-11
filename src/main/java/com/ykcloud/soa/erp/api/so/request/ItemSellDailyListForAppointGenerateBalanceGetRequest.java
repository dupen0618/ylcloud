package com.ykcloud.soa.erp.api.so.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

import javax.validation.constraints.NotNull;

public class ItemSellDailyListForAppointGenerateBalanceGetRequest extends AbstractRequest {
    private static final long serialVersionUID = -1455476110754112096L;

    @NotNull(message = "门店编号不能为空！")
    private Long subUnitNumId;

    @NotNull(message = "供应商编号不能为空！")
    private Long supplyUnitNumId;

    @NotNull(message = "单据号不能为空！")
    private String reservedNo;

    @NotNull(message = "税率不能为空！")
    private Double taxRate;

    @NotNull(message = "经营方式不能为空！")
    private Long settlementType;

    @NotNull(message = "到扣率不能为空!")
    private Double backoffRate;

    private String balanceFlag;

    public String getBalanceFlag() {
        return balanceFlag;
    }

    public void setBalanceFlag(String balanceFlag) {
        this.balanceFlag = balanceFlag;
    }

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }

    public Long getSupplyUnitNumId() {
        return supplyUnitNumId;
    }

    public void setSupplyUnitNumId(Long supplyUnitNumId) {
        this.supplyUnitNumId = supplyUnitNumId;
    }

    public String getReservedNo() {
        return reservedNo;
    }

    public void setReservedNo(String reservedNo) {
        this.reservedNo = reservedNo;
    }

    public Double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
    }

    public Long getSettlementType() {
        return settlementType;
    }

    public void setSettlementType(Long settlementType) {
        this.settlementType = settlementType;
    }

    public Double getBackoffRate() {
        return backoffRate;
    }

    public void setBackoffRate(Double backoffRate) {
        this.backoffRate = backoffRate;
    }
}
