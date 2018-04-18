package com.ykcloud.soa.erp.api.so.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.so.model.LackInventoryProduct;


/**
 * 店间调拨制单确认出参
 * @author tz.x
 *
 * @date 2018年4月13日下午1:06:39
 */
public class ShopTransferByAuthorConfirmResponse extends MessagePack {

	private static final long serialVersionUID = 4827959613533209256L;
	
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
