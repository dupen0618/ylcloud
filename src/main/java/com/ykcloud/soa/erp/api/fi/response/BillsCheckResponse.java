package com.ykcloud.soa.erp.api.fi.response;

import java.util.List;
import java.util.Map;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

public class BillsCheckResponse extends MessagePack {
	private static final long serialVersionUID = 1L;

	private Map<String, List<Long>> reservedNoMap;

	public Map<String, List<Long>> getReservedNoMap() {
		return reservedNoMap;
	}

	public void setReservedNoMap(Map<String, List<Long>> reservedNoMap) {
		this.reservedNoMap = reservedNoMap;
	}
	
}
