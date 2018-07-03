package com.ykcloud.soa.erp.api.wm.model;

import java.io.Serializable;

public class ImportMoveError implements Serializable{
    /**
     * 商品编号
     */
    private Long itemNumId;

    /**
     * 商品sku
     */
    private String itemid;

    /**
     * 商品条码
     */
    private String barcode;

    /**
     * 出错信息
     */
    private String importError;

    public Long getItemNumId() {
        return itemNumId;
    }

    public void setItemNumId(Long itemNumId) {
        this.itemNumId = itemNumId;
    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getImportError() {
        return importError;
    }

    public void setImportError(String importError) {
        this.importError = importError;
    }
}
