package com.ykcloud.soa.erp.api.wm.request;

import java.util.List;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class StockadJustSelectRequest extends AbstractRequest {

	private static final long serialVersionUID = -5007034439516790169L;

	 private List<String> servies;

	    public List<String> getServies() {
	        return servies;
	    }

	    public void setServies(List<String> servies) {
	        this.servies = servies;
	    }

	
}
