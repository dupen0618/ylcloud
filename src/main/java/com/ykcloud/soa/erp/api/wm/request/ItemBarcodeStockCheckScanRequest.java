package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.annotation.ApiField;

/**
 * @Description: 扫码商品条码盘点的入参
 * @author: henry.wang
 * @date: 2018/4/4 10:06
 **/
public class ItemBarcodeStockCheckScanRequest extends StockCheckRequest {

    private static final long serialVersionUID = 1L;

    @ApiField(description = "商品数量")
    private Double inQty;

    public Double getInQty() {
        return inQty;
    }
}
