package com.ykcloud.soa.erp.api.so.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.so.model.LackInventoryProduct;


/**
 * 店间调拨营运中心确认出参
 * @author tz.x
 *
 * @date 2018年4月16日上午9:01:43
 */
public class ShopTransferByOperationCenterAuditResponse extends MessagePack {

	private static final long serialVersionUID = -6690747633252806745L;
	
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
