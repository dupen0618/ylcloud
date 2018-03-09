package com.ykcloud.soa.erp.api.prd.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

/**
 * Created by yiako on 2018/3/9
 */
public class ProductInfoBySubUnitNumIdAndSupplyUnitNumIdGetResponse extends MessagePack {
    private Long settlementType;//结算方式1：购销，2：代销，3：联销
    private String  settlementTypeName;//结算方式名称
    private Long logisticsType;//物流方式
    private String logisticsTypeName;//物流方式名称
    private Long productOriginNumId;//原产地
    private String productOriginName;//原产地名称
    private Long itemStatusId;//商品状态

    public Long getSettlementType() {
        return settlementType;
    }

    public void setSettlementType(Long settlementType) {
        this.settlementType = settlementType;
    }

    public String getSettlementTypeName() {
        return settlementTypeName;
    }

    public void setSettlementTypeName(String settlementTypeName) {
        this.settlementTypeName = settlementTypeName;
    }

    public Long getLogisticsType() {
        return logisticsType;
    }

    public void setLogisticsType(Long logisticsType) {
        this.logisticsType = logisticsType;
    }

    public String getLogisticsTypeName() {
        return logisticsTypeName;
    }

    public void setLogisticsTypeName(String logisticsTypeName) {
        this.logisticsTypeName = logisticsTypeName;
    }

    public Long getProductOriginNumId() {
        return productOriginNumId;
    }

    public void setProductOriginNumId(Long productOriginNumId) {
        this.productOriginNumId = productOriginNumId;
    }

    public String getProductOriginName() {
        return productOriginName;
    }

    public void setProductOriginName(String productOriginName) {
        this.productOriginName = productOriginName;
    }

    public Long getItemStatusId() {
        return itemStatusId;
    }

    public void setItemStatusId(Long itemStatusId) {
        this.itemStatusId = itemStatusId;
    }
}
