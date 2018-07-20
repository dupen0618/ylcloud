package com.ykcloud.soa.erp.api.scm.request;

import java.util.List;

import org.hibernate.validator.constraints.NotEmpty;

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
public class ProductShopImportRequest extends AbstractUserSessionRequest {
	private static final long serialVersionUID = -4720941859255876894L;
	
	@NotEmpty(message = "门店商品销售属性导入数据不能为空!")
	List<ProductShop> productShops;
	
	// 导入模式：1、严格模式 2、宽松模式
	private Integer mode;

	public List<ProductShop> getProductShop() {
		return productShops;
	}

	public void setProductShop(List<ProductShop> productShop) {
		this.productShops = productShop;
	}

	public Integer getMode() {
		return mode;
	}

	public void setMode(Integer mode) {
		this.mode = mode;
	}
	
	
	


}
