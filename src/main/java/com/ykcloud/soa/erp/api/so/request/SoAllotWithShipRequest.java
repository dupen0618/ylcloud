package com.ykcloud.soa.erp.api.so.request;

import java.util.Date;
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
	
	private String reservedNo;
	
	private String receiptLine;
	
	private Long cust_sub_unit_num_id;

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

	public String getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	}

	public Long getCust_sub_unit_num_id() {
		return cust_sub_unit_num_id;
	}

	public void setCust_sub_unit_num_id(Long cust_sub_unit_num_id) {
		this.cust_sub_unit_num_id = cust_sub_unit_num_id;
	}

	public String getReceiptLine() {
		return receiptLine;
	}

	public void setReceiptLine(String receiptLine) {
		this.receiptLine = receiptLine;
	}

	

}
