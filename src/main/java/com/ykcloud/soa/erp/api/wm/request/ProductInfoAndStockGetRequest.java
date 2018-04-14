package com.ykcloud.soa.erp.api.wm.request;



import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class ProductInfoAndStockGetRequest extends AbstractRequest {

	private static final long serialVersionUID = 1L;
	
	@NotNull(message="商品条码不能为空")
	private String barcode;//条码

	@NotNull(message = "逻辑仓不能为空")
	private Long storageNumId;//逻辑仓号

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public Long getStorageNumId() {
		return storageNumId;
	}

	public void setStorageNumId(Long storageNumId) {
		this.storageNumId = storageNumId;
	}
}
