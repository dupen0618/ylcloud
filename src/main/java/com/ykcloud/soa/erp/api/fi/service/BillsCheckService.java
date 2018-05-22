package com.ykcloud.soa.erp.api.fi.service;

import com.ykcloud.soa.erp.api.fi.request.BillsCheckRequest;
import com.ykcloud.soa.erp.api.fi.response.BillsCheckResponse;

/**
 * 单据检查
 * @author Andy
 *
 */
public interface BillsCheckService {

	public BillsCheckResponse checkBillForDailyCarry(BillsCheckRequest request);
	
}
