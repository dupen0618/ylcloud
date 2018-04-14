package com.ykcloud.soa.erp.api.so.request;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;
//仓库配送数的   配送方式如入参类
public class DistributionOpenDistDeliveryQtyGetRequest extends AbstractRequest {
	
	private static final long serialVersionUID = 1L;

	@NotNull(message="门店编号不能为空!")
	private  Long subUnitNumId;   //门店编号
	
	@NotNull(message="商品编号不能为空!")
	private  Long itemNumId;     //商品编号
	
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
