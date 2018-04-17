package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

/**
 * @Description:生成日报查询的入参
 * @Author: ALi
 * @Date: 2018/4/13 20:28
 */
public class SeriesBySellDailyGetRequest extends AbstractRequest {
    private static final long serialVersionUID = -2565804606566389459L;
    private  String batchSeries;
    private  Long itemUumId;
    private String reservedNo;
  
    public String getBatchSeries() {
		return batchSeries;
	}

	public void setBatchSeries(String batchSeries) {
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
