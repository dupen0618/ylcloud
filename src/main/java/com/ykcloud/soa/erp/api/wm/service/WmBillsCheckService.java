package com.ykcloud.soa.erp.api.wm.service;

import com.ykcloud.soa.erp.api.wm.request.WmBillsCheckRequest;
import com.ykcloud.soa.erp.api.wm.response.WmBillsCheckResponse;


/**
 * 单据检查
 * @author Andy
 *
 */
public interface WmBillsCheckService {

	public WmBillsCheckResponse checkBills(WmBillsCheckRequest request);
	
}
