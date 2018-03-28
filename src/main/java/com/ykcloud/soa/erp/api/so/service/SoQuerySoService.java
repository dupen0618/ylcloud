package com.ykcloud.soa.erp.api.so.service;

import com.ykcloud.soa.erp.api.so.request.SoByWlbcNumIdAndItemNumIdGetRequest;
import com.ykcloud.soa.erp.api.so.response.SoByWlbcNumIdAndItemNumIdGetResponse;

public interface SoQuerySoService {

	//通过波次号与商品号，查询订单信息
	public SoByWlbcNumIdAndItemNumIdGetResponse getSoDtlByWlbcAndItemNumId(SoByWlbcNumIdAndItemNumIdGetRequest request);
}
