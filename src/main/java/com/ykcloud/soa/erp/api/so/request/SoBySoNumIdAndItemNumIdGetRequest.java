package com.ykcloud.soa.erp.api.so.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class SoBySoNumIdAndItemNumIdGetRequest extends AbstractRequest {

	private static final long serialVersionUID = -8819181948393245910L;

	@NotNull(message = "订单编号不能为空!")
	private String soNumId;

	@NotNull(message = "商品编号不能为空!")
	private Long itemNumId;

	@NotNull(message = "门店编号不能为空!")
	private Long subUnitNumId;

	@NotNull(message = "订单日期不能为空!")
	private Date orderDate;

	private Long plmSign;

	public String getSoNumId() {
		return soNumId;
	}

	public void setSoNumId(String soNumId) {
		this.soNumId = soNumId;
	}

	public Long getItemNumId() {
		return itemNumId;
	}

	public void setItemNumId(Long itemNumId) {
		this.itemNumId = itemNumId;
	}

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Long getPlmSign() {
		return plmSign;
	}

	public void setPlmSign(Long plmSign) {
		this.plmSign = plmSign;
	}

}
