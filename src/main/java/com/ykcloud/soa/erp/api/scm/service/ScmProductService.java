package com.ykcloud.soa.erp.api.scm.service;

import com.ykcloud.soa.erp.api.scm.request.GiftQtyByGiftRelationGetRequest;
import com.ykcloud.soa.erp.api.scm.response.GiftQtyByGiftRelationGetResponse;

public interface ScmProductService {

	//获取供应商品赠品数量
	public GiftQtyByGiftRelationGetResponse getGiftQtyByGiftRelation(GiftQtyByGiftRelationGetRequest request);

}
