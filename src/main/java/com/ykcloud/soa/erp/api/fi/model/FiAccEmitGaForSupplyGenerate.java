package com.ykcloud.soa.erp.api.fi.model;

import java.io.Serializable;

/**
 * 供应商发出商品记录
 *
 * @author Sealin
 * @date 2018-06-27
 */
public class FiAccEmitGaForSupplyGenerate implements Serializable {
    private static final long serialVersionUID = -79304606761490004L;
    private String series;
    private Double adjustAmount;
    private Double adjustTaxAmount;

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public Double getAdjustAmount() {
        return adjustAmount;
    }

    public void setAdjustAmount(Double adjustAmount) {
        this.adjustAmount = adjustAmount;
    }

    public Double getAdjustTaxAmount() {
        return adjustTaxAmount;
    }

    public void setAdjustTaxAmount(Double adjustTaxAmount) {
        this.adjustTaxAmount = adjustTaxAmount;
    }
}
