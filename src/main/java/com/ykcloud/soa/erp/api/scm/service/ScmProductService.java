package com.ykcloud.soa.erp.api.scm.service;

import com.ykcloud.soa.erp.api.scm.request.GiftQtyByGiftRelationGetRequest;
import com.ykcloud.soa.erp.api.scm.response.HandRepmentProductCheckResponse;
import com.ykcloud.soa.erp.api.scm.response.GiftQtyByGiftRelationGetResponse;
import com.ykcloud.soa.erp.api.scm.request.HandRepmentProductCheckRequest;

public interface ScmProductService {

	//获取供应商品赠品数量
	public GiftQtyByGiftRelationGetResponse getGiftQtyByGiftRelation(GiftQtyByGiftRelationGetRequest request);

	public HandRepmentProductCheckResponse checkHandRepmentProduct(HandRepmentProductCheckRequest Request);

}
