package com.ykcloud.soa.erp.api.so.request;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

/**
 * 获取当前店铺的上次日结日期入参
 * 
 * @author linming.xie
 * @date 2017年12月15日 上午11:14:31
 */
public class LastSalesDateGetRequest extends AbstractRequest {

	private static final long serialVersionUID = -696209513865218524L;

	@NotNull(message = "门店编号不能为空!")
	private Long subUnitNumId;

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

}
