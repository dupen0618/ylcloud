package com.ykcloud.soa.erp.api.scm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

/**
 * Created by yiako on 2018/3/24
 */
public class SupplyUnitNameBySupplyUnitNumIdGetRequest extends AbstractRequest {
   private Long subUnitNumId;

   private Long itemNumId;

    private Long SupplyUnitNumId;

    public Long getItemNumId() {
        return itemNumId;
    }

    public void setItemNumId(Long itemNumId) {
        this.itemNumId = itemNumId;
    }

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }

    public Long getSupplyUnitNumId() {
        return SupplyUnitNumId;
    }

    public void setSupplyUnitNumId(Long supplyUnitNumId) {
        SupplyUnitNumId = supplyUnitNumId;
    }
}
