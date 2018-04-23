package com.ykcloud.soa.erp.api.so.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

/**
 * 店间调拨商品查询出参
 * @author tz.x
 *
 * @date 2018年4月11日下午6:36:53
 */
public class ProductInfoForSoApplyTransferBetweenShopGetResponse extends MessagePack {

	private static final long serialVersionUID = 1203191662066470581L;
	
	private List<ProductForShopTransfer> products;

	public List<ProductForShopTransfer> getProducts() {
		return products;
	}

	public void setProducts(List<ProductForShopTransfer> products) {
		this.products = products;
	}
	

}
