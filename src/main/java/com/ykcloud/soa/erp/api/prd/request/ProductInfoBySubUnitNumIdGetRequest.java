package com.ykcloud.soa.erp.api.prd.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

import javax.validation.constraints.NotNull;

/**
 * Created by yiako on 2018/3/10
 */
public class ProductInfoBySubUnitNumIdGetRequest extends AbstractRequest{
    @NotNull(message = "门店编号不能为空!")
    private Long subUnitNumId;

    @NotNull(message = "商品编号不能为空!")
    private Long itemNumId;

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }

    public Long getItemNumId() {
        return itemNumId;
    }

    public void setItemNumId(Long itemNumId) {
        this.itemNumId = itemNumId;
    }
}
