package com.ykcloud.soa.erp.api.wm.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @Description: 折扣率
 * @Author: ALi
 * @Date: 2018/4/18 15:30
 */
public class BackOffRateRequest extends AbstractRequest {
    private static final long serialVersionUID = 1L;
    @NotNull(message = "供应商信息不能为空！")
    private Long supplyUnitNumId;
    @NotNull(message = "商品编号不能为空！")
    private Long itemNumId;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @NotNull(message = "业务日期不能为空！")
    private Date operatDate;
    @NotNull(message = "采购协议单号不能为空！")
    private String reservedNo;
    @NotNull(message = "原价格不能为空！")
    private Double retailPrice;
    @NotNull(message = "结算价格不能为空！")
    private Double tradePrice;
    @NotNull(message = "总价格不能为空！")
    private Double totalAmount;
    @NotNull(message = "门店不能为空！")
    private Long subUnitNumId;

    public Long getSupplyUnitNumId() {
        return supplyUnitNumId;
    }

    public void setSupplyUnitNumId(Long supplyUnitNumId) {
        this.supplyUnitNumId = supplyUnitNumId;
    }

    public Long getItemNumId() {
        return itemNumId;
    }

    public void setItemNumId(Long itemNumId) {
        this.itemNumId = itemNumId;
    }

    public Date getOperatDate() {
        return operatDate;
    }

    public void setOperatDate(Date operatDate) {
        this.operatDate = operatDate;
    }

    public String getReservedNo() {
        return reservedNo;
    }

    public void setReservedNo(String reservedNo) {
        this.reservedNo = reservedNo;
    }

    public Double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(Double retailPrice) {
        this.retailPrice = retailPrice;
    }

    public Double getTradePrice() {
        return tradePrice;
    }

    public void setTradePrice(Double tradePrice) {
        this.tradePrice = tradePrice;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }
}
