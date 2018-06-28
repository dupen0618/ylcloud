package com.ykcloud.soa.erp.api.scm.request;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.scm.model.ProductShop;
/**
 * 
 * @author gaoyun.shen
 *
 * @date 2018年6月22日 下午4:26:01
 * 
 * @Description 门店商品销售属性 excel导入  入参
 */
public class ProductShopRequest extends AbstractUserSessionRequest {
	private static final long serialVersionUID = -4720941859255876894L;
	
	@NotNull(message = "门店商品销售属性导入数据不能为空!")
	List<ProductShop> productShops;

	public List<ProductShop> getProductShop() {
		return productShops;
	}

	public void setProductShop(List<ProductShop> productShop) {
		this.productShops = productShop;
	}
	
	


}
