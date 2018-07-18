package com.ykcloud.soa.erp.api.wm.model;

import java.io.Serializable;

public class ImportWmBlStocktakingDtlError implements Serializable {
	private static final long serialVersionUID = 1L;

	private String trayLabserlno;

	private String barcodeOrItemNumId;

	private Double inQty;

	private String failReason;

	public String getTrayLabserlno() {
		return trayLabserlno;
	}

	public void setTrayLabserlno(String trayLabserlno) {
		this.trayLabserlno = trayLabserlno;
	}

	public String getBarcodeOrItemNumId() {
		return barcodeOrItemNumId;
	}

	public void setBarcodeOrItemNumId(String barcodeOrItemNumId) {
		this.barcodeOrItemNumId = barcodeOrItemNumId;
	}

	public Double getInQty() {
		return inQty;
	}

	public void setInQty(Double inQty) {
		this.inQty = inQty;
	}

	public String getFailReason() {
		return failReason;
	}

	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}

}
