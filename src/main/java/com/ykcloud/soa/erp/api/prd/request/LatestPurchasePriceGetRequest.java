package com.ykcloud.soa.erp.api.prd.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class LatestPurchasePriceGetRequest extends AbstractRequest {

	private static final long serialVersionUID = 3522180178823819370L;

	@JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    @NotNull(message = "时间不能为空！")
    private Date orderDat;

    @NotNull(message = "供应商编码不能为空！")
    private Long supplyUnitNumId;

    @NotNull(message = "门店编码不能为空！")
    private Long subUnitUnmId;

    @NotNull(message = "商品主键不能为空！")
    private Long ItemNumId;

    public Date getOrderDat() {
        return orderDat;
    }

    public void setOrderDat(Date orderDat) {
        this.orderDat = orderDat;
    }

    public Long getSupplyUnitNumId() {
        return supplyUnitNumId;
    }

    public void setSupplyUnitNumId(Long supplyUnitNumId) {
        this.supplyUnitNumId = supplyUnitNumId;
    }

    public Long getSubUnitUnmId() {
        return subUnitUnmId;
    }

    public void setSubUnitUnmId(Long subUnitUnmId) {
        this.subUnitUnmId = subUnitUnmId;
    }

    public Long getItemNumId() {
        return ItemNumId;
    }

    public void setItemNumId(Long itemNumId) {
        ItemNumId = itemNumId;
    }
}
