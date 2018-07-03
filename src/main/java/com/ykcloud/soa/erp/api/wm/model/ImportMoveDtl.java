package com.ykcloud.soa.erp.api.wm.model;

import java.io.Serializable;

public class ImportMoveDtl implements Serializable {
    private static final long serialVersionUID = 1L;

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
     * 数量
     */
    private Double qty;

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

    public Double getQty() {
        return qty;
    }

    public void setQty(Double qty) {
        this.qty = qty;
    }
}
