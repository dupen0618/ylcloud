package com.ykcloud.soa.erp.api.fi.model;

import java.io.Serializable;

/**
 * 供应商发出商品记录
 *
 * @author Sealin
 * @date 2018-06-27
 */
public class FiAccEmitGaForSupplyGenerate implements Serializable {
    private static final long serialVersionUID = 6011778196382284751L;
    private String series;
    private Double emitAmount;
    private Double emitTaxAmount;
    private Double finalAmount;
    private Double finalTaxAmount;
    private Double returnAmount;
    private Double returnTaxAmount;

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public Double getEmitAmount() {
        return emitAmount;
    }

    public void setEmitAmount(Double emitAmount) {
        this.emitAmount = emitAmount;
    }

    public Double getEmitTaxAmount() {
        return emitTaxAmount;
    }

    public void setEmitTaxAmount(Double emitTaxAmount) {
        this.emitTaxAmount = emitTaxAmount;
    }

    public Double getFinalAmount() {
        return finalAmount;
    }

    public void setFinalAmount(Double finalAmount) {
        this.finalAmount = finalAmount;
    }

    public Double getFinalTaxAmount() {
        return finalTaxAmount;
    }

    public void setFinalTaxAmount(Double finalTaxAmount) {
        this.finalTaxAmount = finalTaxAmount;
    }

    public Double getReturnAmount() {
        return returnAmount;
    }

    public void setReturnAmount(Double returnAmount) {
        this.returnAmount = returnAmount;
    }

    public Double getReturnTaxAmount() {
        return returnTaxAmount;
    }

    public void setReturnTaxAmount(Double returnTaxAmount) {
        this.returnTaxAmount = returnTaxAmount;
    }
}
