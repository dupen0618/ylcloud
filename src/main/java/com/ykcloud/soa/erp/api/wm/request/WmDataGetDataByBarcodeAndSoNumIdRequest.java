package com.ykcloud.soa.erp.api.wm.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class WmDataGetDataByBarcodeAndSoNumIdRequest extends AbstractRequest {
	private static final long serialVersionUID = 7181578000407228571L;

	@NotNull(message = "门店号不能为空! ")
	private Long subUnitNumId;

	@NotNull(message = "订单id不能为空! ")
	private String soNumId;

	@NotNull(message = "托盘号不能为空! ")
	private String containerSerlno;

	@NotNull(message = "条码不能为空! ")
	private String barcode;
	

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

	public String getContainerSerlno() {
		return containerSerlno;
	}

	public void setContainerSerlno(String containerSerlno) {
		this.containerSerlno = containerSerlno;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}


}
