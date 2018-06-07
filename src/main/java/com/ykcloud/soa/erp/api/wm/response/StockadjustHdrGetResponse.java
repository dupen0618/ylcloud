package com.ykcloud.soa.erp.api.wm.response;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

public class StockadjustHdrGetResponse extends MessagePack {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long typeNumId;// 业务类型
	private Long ifCostadjust;// 是否产生供应商金额调整单 1:需要产生 0:不需要产生
	private String reservedNo;
	private Date recDate;
	private Long physicalNumId;

	public Long getTypeNumId() {
		return typeNumId;
	}

	public void setTypeNumId(Long typeNumId) {
		this.typeNumId = typeNumId;
	}

	public Long getIfCostadjust() {
		return ifCostadjust;
	}

	public void setIfCostadjust(Long ifCostadjust) {
		this.ifCostadjust = ifCostadjust;
	}

	public String getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	}

	public Date getRecDate() {
		return recDate;
	}

	public void setRecDate(Date recDate) {
		this.recDate = recDate;
	}

	public Long getPhysicalNumId() {
		return physicalNumId;
	}

	public void setPhysicalNumId(Long physicalNumId) {
		this.physicalNumId = physicalNumId;
	}
}
