package com.ykcloud.soa.erp.api.prd.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

/**
 * Created by yiako on 2018/3/10
 */
public class ProductInfoBySubUnitNumIdGetRespone extends MessagePack {
    private  Long supplyUnitNumId;//默认供应商
    private  String supplyUnitName;//默认供应商名称
    private  String seasonMonthFlag;//商品适用季节'123456789abc',表示全年销售,1200000000bc 标识 11至次年2月销售

    public Long getSupplyUnitNumId() {
        return supplyUnitNumId;
    }

    public void setSupplyUnitNumId(Long supplyUnitNumId) {
        this.supplyUnitNumId = supplyUnitNumId;
    }

    public String getSupplyUnitName() {
        return supplyUnitName;
    }

    public void setSupplyUnitName(String supplyUnitName) {
        this.supplyUnitName = supplyUnitName;
    }

    public String getSeasonMonthFlag() {
        return seasonMonthFlag;
    }

    public void setSeasonMonthFlag(String seasonMonthFlag) {
        this.seasonMonthFlag = seasonMonthFlag;
    }
}
