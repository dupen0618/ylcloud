package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractSessionRequest;

/**
 * 根据商品id和物理仓获取商品信息
 *
 * @author Sealin
 * @date 2018-07-03
 */
public class WmBatchDtlByItemRequest extends AbstractSessionRequest {
    private static final long serialVersionUID = -2263779894782108459L;
    private Long subUnitNumId;
    private Long itemNumId;
    private Long supplyUnitNumId;
    /**
     * 物理仓编号
     */
    private Long physical;

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }

    public Long getItemNumId() {
        return itemNumId;
    }

    public void setItemNumId(Long itemNumId) {
        this.itemNumId = itemNumId;
    }

    public Long getSupplyUnitNumId() {
        return supplyUnitNumId;
    }

    public void setSupplyUnitNumId(Long supplyUnitNumId) {
        this.supplyUnitNumId = supplyUnitNumId;
    }

    public Long getPhysical() {
        return physical;
    }

    public void setPhysical(Long physical) {
        this.physical = physical;
    }
}
