package com.ykcloud.soa.erp.api.scm.service;

import com.ykcloud.soa.erp.api.scm.request.ProductShopRequest;
import com.ykcloud.soa.erp.api.scm.response.ProductShopResponse;

/**
 * 
 * @author gaoyun.shen
 *
 * @date 2018年6月26日 下午3:46:45
 * 
 * @Description 门店商品销售属性excel导入，其中调价单号需要在scm系统中查询，将导入入口移到scm系统中
 */
public interface PrdExcelImportFromScmService {
	/**
	 * 
	 * @description
	 * @author gaoyun.shen
	 * @date: 2018年6月22日 下午4:27:34
	 * @param 
	 * @return  门店商品销售属性 excel导入
	 */
	public ProductShopResponse importProductShop(ProductShopRequest request);
	
}
