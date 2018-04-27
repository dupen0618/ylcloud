package com.ykcloud.soa.erp.api.so.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

public class SeriesByItemNumIdAndReservedNoGetResponse extends MessagePack {
	private static final long serialVersionUID = 1L;
	
	
	private String series;  //行号


	public String getSeries() {
		return series;
	}


	public void setSeries(String series) {
		this.series = series;
	}
	
	
	
	

}
