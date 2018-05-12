package com.ykcloud.soa.erp.api.wm.request;



import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class ProductInfoAndStockGetRequest extends AbstractRequest {

	private static final long serialVersionUID = 1L;


	@NotNull(message="商品编号不能为空")
	private Long itemNumId;

	@NotNull(message = "逻辑仓不能为空")
	private Long storageNumId;//逻辑仓号
	@NotNull(message = "门店编号不能为空")
	private Long subUnitNumId;

	public Long getItemNumId() {
		return itemNumId;
	}

	public void setItemNumId(Long itemNumId) {
		this.itemNumId = itemNumId;
	}

	public Long getStorageNumId() {
		return storageNumId;
	}

	public void setStorageNumId(Long storageNumId) {
		this.storageNumId = storageNumId;
	}

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}
}
