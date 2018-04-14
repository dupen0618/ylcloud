package com.ykcloud.soa.erp.api.so.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @Author: fred.zhao
 * @Description:
 * @Date: Created in 10:59:2018/3/30
 */
public class ReturnApplyDtlGetRequest extends AbstractRequest {
    private static final long serialVersionUID = -1477818002549854960L;

    @NotNull(message = "门店编号不能为空!")
    private Long subUnitNumId;

    @NotNull(message = "订货日期不能为空!")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date orderDate;// 日期，格式：yyyy-mm-dd

    @NotNull(message = "退货申请单号不能为空！")
    private String applyNumId;

    @NotNull(message = "结算方式不能为空！")
    private Long settlementType;

    @NotNull(message = "供应商编号不能为空！")
    private Long supplyUnitNumId;

    @NotNull(message = "供应商编号不能为空！")
    private Long logisticsType;

    @NotNull(message = "存储方式不能为空！")
    private Long storeType;

    @NotNull(message = "采购方式不能为空！")
    private Long purchaseTypeNumId;

    public Long getStoreType() {
        return storeType;
    }

    public void setStoreType(Long storeType) {
        this.storeType = storeType;
    }

    public Long getSettlementType() {
        return settlementType;
    }

    public void setSettlementType(Long settlementType) {
        this.settlementType = settlementType;
    }

    public Long getSupplyUnitNumId() {
        return supplyUnitNumId;
    }

    public void setSupplyUnitNumId(Long supplyUnitNumId) {
        this.supplyUnitNumId = supplyUnitNumId;
    }

    public Long getLogisticsType() {
        return logisticsType;
    }

    public void setLogisticsType(Long logisticsType) {
        this.logisticsType = logisticsType;
    }

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getApplyNumId() {
        return applyNumId;
    }

    public void setApplyNumId(String applyNumId) {
        this.applyNumId = applyNumId;
    }

    public Long getPurchaseTypeNumId() {
        return purchaseTypeNumId;
    }

    public void setPurchaseTypeNumId(Long purchaseTypeNumId) {
        this.purchaseTypeNumId = purchaseTypeNumId;
    }
}
