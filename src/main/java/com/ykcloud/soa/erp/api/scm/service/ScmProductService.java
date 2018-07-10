package com.ykcloud.soa.erp.api.scm.service;

import com.ykcloud.soa.erp.api.scm.request.*;

import com.ykcloud.soa.erp.api.scm.response.*;


public interface ScmProductService {
	
	/**
	 * 
	 * @description
	 * @author gaoyun.shen
	 * @date: 2018年6月22日 下午4:27:34
	 * @param 
	 * @return  门店商品销售属性 excel导入
	 */
	public ProductShopResponse importProductShop(ProductShopRequest request);

	//获取供应商品赠品数量
	public GiftQtyByGiftRelationGetResponse getGiftQtyByGiftRelation(GiftQtyByGiftRelationGetRequest request);


	//商品可补货合法性验证
	public ProductForReplenishCheckResponse checkProductForReplenish(ProductForReplenishCheckRequest Request);
	
	//获得商品生鲜类型
	public ProductFdcSignBySupplyNumIdAndPty3NumIdGetResponse getProductFdcSignBySupplyNumIdAndPty3NumId(ProductFdcSignBySupplyNumIdAndPty3NumIdGetRequest request);

	//获取商品采购价
	public ProductPurchasePriceGetResponse getProductPurchasePrice(ProductPurchasePriceGetRequest request);
	
	//采购单号审核
    public ProtocolAuditResponse auditProtocol(ProtocolAuditRequest request);

    //导入
    public  ProtocolImportResponse importProtocol(ProtocolImportRequest request);

    //copy采购协议
	public ProtocolShopCopyResponse copyProtocolShop(ProtocolShopCopyRequest request);
	
	//会员售价excel导入
	public VipPriceImportResponse importVipPrice(VipPriceImportRequest request);
	
	//临时、久永售价excel导入
	public ChangePriceImportResponse importChangePrice(ChangePriceImportRequest request);
}
