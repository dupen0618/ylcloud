package com.ykcloud.soa.erp.api.so.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class SoNumIdOneRequest extends AbstractRequest {

	private static final long serialVersionUID = -7870514749928476218L;

	@NotNull(message = "波次号不能为空!")
	private String wlbc;

	@NotNull(message = "商品ID不能为空!")
	private Long itemNumId;

	@NotNull(message = "门店ID不能为空!")
	private Long subUnitNumId;

	private Long sowNumId;

	public String getWlbc() {
		return wlbc;
	}

	public void setWlbc(String wlbc) {
		this.wlbc = wlbc;
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


	public Long getSowNumId() {
		return sowNumId;
	}

	public void setSowNumId(Long sowNumId) {
		this.sowNumId = sowNumId;
	}

}
