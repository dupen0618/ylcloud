package com.ykcloud.soa.erp.api.fi.request;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

import java.util.Date;

/**
 * @ClassName: DailyAndMonthCostAdjustRequest.java
 * @Description:
 * @version: v1.0.0
 * @author: fred.zhao
 * @date: 2018年5月11日 下午3:04:56
 */
public class DailyAndMonthCostAdjustRequest extends AbstractRequest {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @NotNull(message = "门店编号不能为空!")
    private Long subUnitNumId;
    @NotNull(message = "销售数量不能为空!")
    private Double sellQty;//销售数量
    @NotNull(message = "销售金额不能为空!")
    private Double tradePrice;//销售价格
    @NotNull(message = "销售税率不能为空!")
    private Double taxRate;//销售税率
    @NotNull(message = "结算方式不能为空！")
    private Long settlementType;//结算方式
    @NotNull(message = "商品编号不能为空！")
    private Long itemNumId;//商品编号
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @NotNull(message = "开始日期不能为空！")
    private Date orderDate;
    @NotNull(message = "库存批次序号不能为空！")
    private String series;


    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Long getItemNumId() {
        return itemNumId;
    }

    public void setItemNumId(Long itemNumId) {
        this.itemNumId = itemNumId;
    }

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }

    public Double getSellQty() {
        return sellQty;
    }

    public Long getSettlementType() {
        return settlementType;
    }

    public void setSettlementType(Long settlementType) {
        this.settlementType = settlementType;
    }

    public void setSellQty(Double sellQty) {
        this.sellQty = sellQty;
    }

    public Double getTradePrice() {
        return tradePrice;
    }

    public void setTradePrice(Double tradePrice) {
        this.tradePrice = tradePrice;
    }

    public Double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
    }


}
