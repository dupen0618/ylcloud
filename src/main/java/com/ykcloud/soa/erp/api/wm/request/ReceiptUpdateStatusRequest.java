package com.ykcloud.soa.erp.api.wm.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class ReceiptUpdateStatusRequest extends AbstractRequest  {

	private static final long serialVersionUID = -5195355820358295113L;

	@NotNull(message = "行号不能为空！")
	private Long series;
	
	@NotNull(message = "单号不能为空！")
	private Long reservedNo;
	
	@NotNull(message = "修改人不能为空！")
	private Long userNumId;
	
	@NotNull(message = "修改时间能为空！")
	private Date createDate;

	public Long getSeries() {
		return series;
	}

	public void setSeries(Long series) {
		this.series = series;
	}

	public Long getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(Long reservedNo) {
		this.reservedNo = reservedNo;
	}

	public Long getUserNumId() {
		return userNumId;
	}

	public void setUserNumId(Long userNumId) {
		this.userNumId = userNumId;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	
	

}
