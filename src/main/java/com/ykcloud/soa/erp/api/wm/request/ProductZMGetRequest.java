package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

import javax.validation.constraints.NotNull;


public class ProductZMGetRequest extends AbstractRequest {

    private static final long serialVersionUID = 1L;

    @NotNull(message = "门店编号不能为空")
    private Long sunUnitNumId;
    @NotNull(message = "商品条码或编号不能为空")
    private String barcode;

    public Long getSunUnitNumId() {
        return sunUnitNumId;
    }

    public void setSunUnitNumId(Long sunUnitNumId) {
        this.sunUnitNumId = sunUnitNumId;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }
}
