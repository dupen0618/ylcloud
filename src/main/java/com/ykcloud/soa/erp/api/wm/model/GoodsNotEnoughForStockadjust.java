package com.ykcloud.soa.erp.api.wm.model;

import java.io.Serializable;

public class GoodsNotEnoughForStockadjust implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long itemNumId;// 商品主键
    private String itemName;// 商品名称
    private String itemid;// 商家编码
    private String barcode;// 商品条码
    private Double finalQty;// 物理仓库存数量
    private Double stockLossQty;// 盘亏数量

    public Long getItemNumId() {
        return itemNumId;
    }

    public void setItemNumId(Long itemNumId) {
        this.itemNumId = itemNumId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
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

    public Double getFinalQty() {
        return finalQty;
    }

    public void setFinalQty(Double finalQty) {
        this.finalQty = finalQty;
    }

    public Double getStockLossQty() {
        return stockLossQty;
    }

    public void setStockLossQty(Double stockLossQty) {
        this.stockLossQty = stockLossQty;
    }
}
