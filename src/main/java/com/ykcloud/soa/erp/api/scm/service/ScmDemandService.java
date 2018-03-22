package com.ykcloud.soa.erp.api.scm.service;


import com.ykcloud.soa.erp.api.scm.request.ProductDemandQtyGetRequest;
import com.ykcloud.soa.erp.api.scm.request.ShopProductDemandQtyGenerateRequest;
import com.ykcloud.soa.erp.api.scm.response.ProductDemandQtyGetResponse;
import com.ykcloud.soa.erp.api.scm.response.ShopProductDemandQtyGenerateResponse;

/***
*补货参考服务类
@author hank.zhu
@date 2018年3月11日 上午3:26:42 新建
*/
public interface ScmDemandService {
	
	//日结后产生门店、商品类别补货参考数量，插入门店日商品补货参考数量表
public ShopProductDemandQtyGenerateResponse generateShopProductDemandQty(ShopProductDemandQtyGenerateRequest request);
    //获取商品补货参考数量
public ProductDemandQtyGetResponse getProductDemandQty(ProductDemandQtyGetRequest request);
}
