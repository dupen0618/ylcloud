package com.ykcloud.soa.erp.api.so.model;

import java.io.Serializable;

/**
 * @Author: fred.zhao
 * @Description: 退货申请单分组类
 * @Date: Created in 16:29:2018/3/28
 */
public class ReturnApplyGroup implements Serializable{
    private static final long serialVersionUID = -6175340748081900507L;

    private Long settlementType;//结算方式

    private Long supplyUnitNumId;//供应商编号

    private Long storeType;//存储方式

    private Long logisticsType;//送货方式

    public Long getSettlementType() {
        return settlementType;
    }

    public void setSettlementType(Long settlementType) {
        this.settlementType = settlementType;
    }

    public Long getSupplyUnitNumId() {
        return supplyUnitNumId;
    }

    public void setSupplyUnitNumId(Long supplyUnitNumId) {
        this.supplyUnitNumId = supplyUnitNumId;
    }

    public Long getStoreType() {
        return storeType;
    }

    public void setStoreType(Long storeType) {
        this.storeType = storeType;
    }

    public Long getLogisticsType() {
        return logisticsType;
    }

    public void setLogisticsType(Long logisticsType) {
        this.logisticsType = logisticsType;
    }
}
