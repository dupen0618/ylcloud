package com.ykcloud.soa.erp.api.prd.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

import javax.validation.constraints.NotNull;

/**
 * Created by yiako on 2018/3/10
 */
public class ProductByItemNumIdGetRequst extends AbstractRequest {

    @NotNull(message = "条码不能为空! ")
    private  String barcode;

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }
}
