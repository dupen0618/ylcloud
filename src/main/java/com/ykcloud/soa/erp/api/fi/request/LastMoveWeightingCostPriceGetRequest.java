package com.ykcloud.soa.erp.api.fi.request;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

/**
* @ClassName: LastMoveWeightingCostPriceGetRequest.java
* @Description: 取最新移动加权成本request
* @version: v1.0.0
* @author: fred.zhao
* @date: 2018年3月20日 上午9:58:35 
*/
public class LastMoveWeightingCostPriceGetRequest extends AbstractRequest{
	
	private static final long serialVersionUID = 4627685577873375711L;
	
	@NotNull(message="门店编号不能为空！")
	private Long subUnitNumId;
	@NotNull(message="商品编号不能为空！")
	private Long itemNumId;

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public Long getItemNumId() {
		return itemNumId;
	}

	public void setItemNumId(Long itemNumId) {
		this.itemNumId = itemNumId;
	}
	
	
	
}
