package com.ykcloud.soa.erp.api.prd.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

import javax.validation.constraints.NotNull;

/**
 * Created by yiako on 2018/3/9
 */
public class ProductInfoBySubUnitNumIdAndSupplyUnitNumIdGetRequest extends AbstractRequest {
    @NotNull(message = "门店编码不能为空！")
    private Long subUnitNumId;
    @NotNull(message = "供应商编码不能为空！")
    private Long supplyUnitNumId;
    @NotNull(message = "商品编号不能为空！")
    private Long itemNumId;

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

    public Long getItemNumId() {
        return itemNumId;
    }

    public void setItemNumId(Long itemNumId) {
        this.itemNumId = itemNumId;
    }
}
