package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

import javax.validation.constraints.NotNull;


public class ProductChangeRequest extends AbstractRequest {

    private static final long serialVersionUID = 1L;

    @NotNull(message = "门店编号不能为空")
    private Long subUnitNumId;
    
    @NotNull(message = "商品编号不能为空")
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
