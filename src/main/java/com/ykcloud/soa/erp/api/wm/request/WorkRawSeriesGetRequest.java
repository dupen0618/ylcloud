package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class WorkRawSeriesGetRequest extends AbstractRequest {

	private static final long serialVersionUID = -7777920135123732638L;

	 private  String batchSeries;
	    private  Long itemUumId;
	    private String workNumId;
	  
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

		public String getWorkNumId() {
			return workNumId;
		}

		public void setWorkNumId(String workNumId) {
			this.workNumId = workNumId;
		}

	

}
