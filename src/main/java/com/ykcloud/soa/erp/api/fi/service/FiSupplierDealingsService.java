package com.ykcloud.soa.erp.api.fi.service;

import com.ykcloud.soa.erp.api.fi.request.DealingDetailsGenerateRequest;
import com.ykcloud.soa.erp.api.fi.request.DealingsOutWorkRequest;
import com.ykcloud.soa.erp.api.fi.response.DealingDetailsGenerateResponse;
import com.ykcloud.soa.erp.api.fi.response.DealingsOutWorkResponse;

/**
 * 
 * @Description:供应商往来
 * @author: Andy 
 * @date:2018年5月14日
 */
public interface FiSupplierDealingsService {
	
	/**
	 * 库存金额调整后生成供应商往来明细
	 * @author tz.x
	 * @date 2018年5月17日下午2:15:53
	 */
	public DealingDetailsGenerateResponse generateDealingDetail(DealingDetailsGenerateRequest request);

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
