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

    /**
     * 获取 series
     *
     * @author Sealin
     */
    public String getSeries() {
        return series;
    }

    /**
     * 设置 series
     *
     * @author Sealin
     */
    public void setSeries(String series) {
        this.series = series;
    }

    /**
     * 获取 emitAmount
     *
     * @author Sealin
     */
    public Double getEmitAmount() {
        return emitAmount;
    }

    /**
     * 设置 emitAmount
     *
     * @author Sealin
     */
    public void setEmitAmount(Double emitAmount) {
        this.emitAmount = emitAmount;
    }

    /**
     * 获取 emitTaxAmount
     *
     * @author Sealin
     */
    public Double getEmitTaxAmount() {
        return emitTaxAmount;
    }

    /**
     * 设置 emitTaxAmount
     *
     * @author Sealin
     */
    public void setEmitTaxAmount(Double emitTaxAmount) {
        this.emitTaxAmount = emitTaxAmount;
    }

    /**
     * 获取 finalAmount
     *
     * @author Sealin
     */
    public Double getFinalAmount() {
        return finalAmount;
    }

    /**
     * 设置 finalAmount
     *
     * @author Sealin
     */
    public void setFinalAmount(Double finalAmount) {
        this.finalAmount = finalAmount;
    }

    /**
     * 获取 finalTaxAmount
     *
     * @author Sealin
     */
    public Double getFinalTaxAmount() {
        return finalTaxAmount;
    }

    /**
     * 设置 finalTaxAmount
     *
     * @author Sealin
     */
    public void setFinalTaxAmount(Double finalTaxAmount) {
        this.finalTaxAmount = finalTaxAmount;
    }
}
