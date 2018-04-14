package com.ykcloud.soa.erp.api.wm.request;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

//取门店最新批次库存价格，用于配送补货
public class ShopLastBatchPriceGetRequest extends AbstractRequest {

	private static final long serialVersionUID = 1L;
	@NotNull(message = "门店编号不能为空")
	private Long subUnitNumId; // 门店编号不能为空

	@NotNull(message = "商品编号不能为空")
	private Long itemNumId; // 商品编号

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
