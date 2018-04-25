package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class ShipBatchDtlSeriesSelectRequest extends AbstractRequest{

		private static final long serialVersionUID = -1893588372132036098L;
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
