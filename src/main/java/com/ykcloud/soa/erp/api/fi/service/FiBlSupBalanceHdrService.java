package com.ykcloud.soa.erp.api.fi.service;

import com.ykcloud.soa.erp.api.fi.model.FiBlSupBalanceHdr;
import com.ykcloud.soa.erp.api.fi.request.SupplyHdrSeriesGetRequest;
import com.ykcloud.soa.erp.api.fi.request.SupplyHdrStatusUpdateRequest;
import com.ykcloud.soa.erp.api.fi.response.SupplyHdrSeriesGetResponse;
import com.ykcloud.soa.erp.api.fi.response.SupplyHdrStatusUpdateResponse;

/**
 * @Description:供应商表头结算修改状态
 * @author Song
 * @Date 2018年4月24日 下午2:30:26
 */
public interface FiBlSupBalanceHdrService {

	
	//获得供应商表头行号
	public SupplyHdrSeriesGetResponse getSupplyHdrSeries(SupplyHdrSeriesGetRequest request);
	
	//根据行号修改供应商状态
	public SupplyHdrStatusUpdateResponse UpdateSupplyHdrStatus(SupplyHdrStatusUpdateRequest request);

	//获取单头
	FiBlSupBalanceHdr fetchOne(Long tenantNumId, Long dataSign, Long subUnitNumId, Long balaFuncId);
}
