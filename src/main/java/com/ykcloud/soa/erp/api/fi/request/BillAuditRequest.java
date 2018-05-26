package com.ykcloud.soa.erp.api.fi.request;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

import java.util.Date;

public class BillAuditRequest extends AbstractUserSessionRequest  {
	private static final long serialVersionUID = 1180505494003852499L;
	@NotNull(message = "门店不能为空！")
	private Long subUnitNumId;
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	@NotNull(message = "发票日期不能为空！")
	private Date billDate;
	@NotNull(message = "发票单号不能为空！")
	private String billNumId;

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public Date getBillDate() {
		return billDate;
	}

	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}

	public String getBillNumId() {
		return billNumId;
	}

	public void setBillNumId(String billNumId) {
		this.billNumId = billNumId;
	}
}
