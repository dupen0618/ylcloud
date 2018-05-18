package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

import java.util.List;

public class SupplyUnitNumIdForSellOffGetResponse extends MessagePack{

	private static final long serialVersionUID = 1754628776443434936L;

	private List<Long> supplyUnitNumIdList;

    public List<Long> getSupplyUnitNumIdList() {
        return supplyUnitNumIdList;
    }

    public void setSupplyUnitNumIdList(List<Long> supplyUnitNumIdList) {
        this.supplyUnitNumIdList = supplyUnitNumIdList;
    }
}
