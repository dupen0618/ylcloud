package com.ykcloud.soa.erp.api.fi.service;

import com.ykcloud.soa.erp.api.fi.request.DealingsOutWorkRequest;
import com.ykcloud.soa.erp.api.fi.response.DealingsOutWorkResponse;

/**
 * 
 * @Description:供应商往来
 * @author: Andy 
 * @date:2018年5月14日
 */
public interface FiSupplierDealingsService {

	/**
	 * 
	 * @Description:外协加工单往来单
	 * @param request
	 * @return
	 * @author: Andy
	 * @time: 2018年5月14日
	 */
	public DealingsOutWorkResponse outWorkDealings(DealingsOutWorkRequest request);
	
}
