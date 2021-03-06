package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

public class WmQuerySoAndContainerResponse extends MessagePack {
	
	private static final long serialVersionUID = 1L;

	private String soNumId;
	
	private String custSubUnitName;
	
	private Long sowNumId;

	private String containerSerlno;
	
	private String containerLabserlno;
	
	private Double containerPackingQty;
	
	private Double soLockQty;
	
	private Double soPackingQty;


	public String getSoNumId() {
		return soNumId;
	}

	public void setSoNumId(String soNumId) {
		this.soNumId = soNumId;
	}

	public String getCustSubUnitName() {
		return custSubUnitName;
	}

	public void setCustSubUnitName(String custSubUnitName) {
		this.custSubUnitName = custSubUnitName;
	}

	public Long getSowNumId() {
		return sowNumId;
	}

	public void setSowNumId(Long sowNumId) {
		this.sowNumId = sowNumId;
	}

	public String getContainerSerlno() {
		return containerSerlno;
	}

	public void setContainerSerlno(String containerSerlno) {
		this.containerSerlno = containerSerlno;
	}

	public String getContainerLabserlno() {
		return containerLabserlno;
	}

	public void setContainerLabserlno(String containerLabserlno) {
		this.containerLabserlno = containerLabserlno;
	}

	public Double getContainerPackingQty() {
		return containerPackingQty;
	}

	public void setContainerPackingQty(Double containerPackingQty) {
		this.containerPackingQty = containerPackingQty;
	}

	public Double getSoLockQty() {
		return soLockQty;
	}

	public void setSoLockQty(Double soLockQty) {
		this.soLockQty = soLockQty;
	}

	public Double getSoPackingQty() {
		return soPackingQty;
	}

	public void setSoPackingQty(Double soPackingQty) {
		this.soPackingQty = soPackingQty;
	}
	
	
}
