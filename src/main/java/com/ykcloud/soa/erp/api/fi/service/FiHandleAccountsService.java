package com.ykcloud.soa.erp.api.fi.service;

import com.ykcloud.soa.erp.api.fi.request.PoorInvertedExtrusionHandleRequest;
import com.ykcloud.soa.erp.api.fi.request.SalesOfSupplementaryGenerateRequest;
import com.ykcloud.soa.erp.api.fi.response.PoorInvertedExtrusionHandleResponse;
import com.ykcloud.soa.erp.api.fi.response.SalesOfSupplementaryGenerateResponse;

public interface FiHandleAccountsService {
	
	//处理倒挤差
	PoorInvertedExtrusionHandleResponse handlePoorInvertedExtrusion(PoorInvertedExtrusionHandleRequest request);
	
	//销售补差
	SalesOfSupplementaryGenerateResponse generateSalesOfSupplementary(SalesOfSupplementaryGenerateRequest request);
}
