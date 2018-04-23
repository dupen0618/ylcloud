package com.ykcloud.soa.erp.api.so.request;

import java.util.Map;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

public class SoAllotWithShipRequest extends AbstractUserSessionRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8068390582876274060L;
	
	private Long subUnitNumId;
	
	private String soNumId;
	
	private Map<String, Double> qtyMap;
	
	private Long typeNumId;

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public String getSoNumId() {
		return soNumId;
	}

	public void setSoNumId(String soNumId) {
		this.soNumId = soNumId;
	}

	public Map<String, Double> getQtyMap() {
		return qtyMap;
	}

	public void setQtyMap(Map<String, Double> qtyMap) {
		this.qtyMap = qtyMap;
	}

	public Long getTypeNumId() {
		return typeNumId;
	}

	public void setTypeNumId(Long typeNumId) {
		this.typeNumId = typeNumId;
	}
	
	

}
