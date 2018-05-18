package com.ykcloud.soa.erp.api.fi.service;

import com.ykcloud.soa.erp.api.fi.request.BillVoucherGenerateRequest;
import com.ykcloud.soa.erp.api.fi.response.BillVoucherGenerateResponse;

/**
 * 生成凭证单
 * @author
 *
 */
public interface FiVoucherService {
	
	//凭证单生成
	public BillVoucherGenerateResponse generateBillVoucher(BillVoucherGenerateRequest request);

}
