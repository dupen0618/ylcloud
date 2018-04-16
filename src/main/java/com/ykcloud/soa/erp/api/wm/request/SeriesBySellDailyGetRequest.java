package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

import java.util.List;

/**
 * @Description:生成日报查询的入参
 * @Author: ALi
 * @Date: 2018/4/13 20:28
 */
public class SeriesBySellDailyGetRequest extends AbstractUserSessionRequest {
    private static final long serialVersionUID = -2565804606566389459L;
    private Long subUnitNumId;
    private  Long batchSeries;
    private  Long itemUumId;
    private String reservedNo;

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }

    public Long getBatchSeries() {
        return batchSeries;
    }

    public void setBatchSeries(Long batchSeries) {
        this.batchSeries = batchSeries;
    }

    public Long getItemUumId() {
        return itemUumId;
    }

    public void setItemUumId(Long itemUumId) {
        this.itemUumId = itemUumId;
    }

    public String getReservedNo() {
        return reservedNo;
    }

    public void setReservedNo(String reservedNo) {
        this.reservedNo = reservedNo;
    }
}
