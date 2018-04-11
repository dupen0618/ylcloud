package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

import javax.validation.constraints.NotNull;


public class ProductZMGetRequest extends AbstractRequest {

    private static final long serialVersionUID = 1L;

    @NotNull(message = "门店编号不能为空")
    private Long subUnitNumId;
    @NotNull(message = "商品条码或编号不能为空")
    private String barcode;

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }
}
