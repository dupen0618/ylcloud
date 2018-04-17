package com.ykcloud.soa.erp.api.wm.model;

import java.io.Serializable;

/**
 * @Author: fred.zhao
 * @Description: 领料退回申请单数据
 * @Date: Created in 15:49:2018/4/16
 */
public class MaterialIssueBackDtl implements Serializable{


    private static final long serialVersionUID = -2305750048515780399L;

    private String series;//序号

    private Long itemNumId;//商品编号

    private Double conversionQty;//件装数

    private Long conversionUnitNumId;//件装单位

    private Double packageQty;//件数

    private Double qty;//数量

    private Double pmtQty;//赠品数量

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public Long getItemNumId() {
        return itemNumId;
    }

    public void setItemNumId(Long itemNumId) {
        this.itemNumId = itemNumId;
    }

    public Double getConversionQty() {
        return conversionQty;
    }

    public void setConversionQty(Double conversionQty) {
        this.conversionQty = conversionQty;
    }

    public Long getConversionUnitNumId() {
        return conversionUnitNumId;
    }

    public void setConversionUnitNumId(Long conversionUnitNumId) {
        this.conversionUnitNumId = conversionUnitNumId;
    }

    public Double getPackageQty() {
        return packageQty;
    }

    public void setPackageQty(Double packageQty) {
        this.packageQty = packageQty;
    }

    public Double getQty() {
        return qty;
    }

    public void setQty(Double qty) {
        this.qty = qty;
    }

    public Double getPmtQty() {
        return pmtQty;
    }

    public void setPmtQty(Double pmtQty) {
        this.pmtQty = pmtQty;
    }
}
