package com.ykcloud.soa.erp.api.wm.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class WmDataByBarcodeGetRequest extends AbstractRequest {

	private static final long serialVersionUID = 3393272083567570905L;

	@NotNull(message = "条码值不能为空! ")
	private String barcode;

	@NotNull(message = "波次号不能为空! ")
	private String wlbc;

	@NotNull(message = "门店ID不能为空! ")
	private Long subUnitNumId;

	//订单种号
	private Long sowNumId;

	//分库标识符
	private Date orderDate;

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getWlbc() {
		return wlbc;
	}

	public void setWlbc(String wlbc) {
		this.wlbc = wlbc;
	}

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public Long getSowNumId() {
		return sowNumId;
	}

	public void setSowNumId(Long sowNumId) {
		this.sowNumId = sowNumId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

}
