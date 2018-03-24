package com.ykcloud.soa.erp.api.scm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by yiako on 2018/3/14
 */
public class HandReplenishGetProductRequest extends AbstractRequest {
    private static final long serialVersionUID = 1L;
    @NotNull(message = "门店编号不能为空")
    private Long subUnitNumId;
    private Long supplyUnitNumId;
    private Long settlementType;
    private Long logisticsType;
    private Long itemNumId;
    private String barcode;
    @NotNull(message = "日期不能为空")
    private Date orderDate;
    @NotNull(message = "检查合同不能为空")
    private Long supplyContractCheckSign;

    public static long getSerialVersionUID() {
        return serialVersionUID;
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

    public Long getSettlementType() {
        return settlementType;
    }

    public void setSettlementType(Long settlementType) {
        this.settlementType = settlementType;
    }

    public Long getLogisticsType() {
        return logisticsType;
    }

    public void setLogisticsType(Long logisticsType) {
        this.logisticsType = logisticsType;
    }

    public Long getItemNumId() {
        return itemNumId;
    }

    public void setItemNumId(Long itemNumId) {
        this.itemNumId = itemNumId;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Long getSupplyContractCheckSign() {
        return supplyContractCheckSign;
    }

    public void setSupplyContractCheckSign(Long supplyContractCheckSign) {
        this.supplyContractCheckSign = supplyContractCheckSign;
    }
}
