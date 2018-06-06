package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

import java.util.Date;

import javax.validation.constraints.NotNull;

public class StockadjustDtlGetRequest extends AbstractRequest {

	private static final long serialVersionUID = -2565804606566389460L;
	/**
	 * 门店编号
	 */
	@NotNull(message = "门店编号不能为空！")
	private Long subUnitNumId;

	/**
	 * 盘亏单号
	 */
	@NotNull(message = "盘亏单号不能为空！")
	private String reservedNo;

	/**
	 * 盈亏日期
	 */
	@NotNull(message = "盈亏日期不能为空！")
	private Date justDate;

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public String getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	}

	public Date getJustDate() {
		return justDate;
	}

	public void setJustDate(Date justDate) {
		this.justDate = justDate;
	}

}
