package com.ykcloud.soa.erp.api.so.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.scm.model.LackInventoryProduct;

/**
 * 店间调拨收货门店确认出参
 * @author tz.x
 *
 * @date 2018年4月17日下午1:45:06
 */
public class ShopTransferByReceiverConfirmResponse extends MessagePack {

	private static final long serialVersionUID = 7494409614036480518L;
	
	/**
	 * 缺货商品列表
	 */
	private List<LackInventoryProduct> lackInventoryProducts;

	public List<LackInventoryProduct> getLackInventoryProducts() {
		return lackInventoryProducts;
	}

	public void setLackInventoryProducts(List<LackInventoryProduct> lackInventoryProducts) {
		this.lackInventoryProducts = lackInventoryProducts;
	}

}
