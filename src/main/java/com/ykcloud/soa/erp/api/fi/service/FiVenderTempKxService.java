package com.ykcloud.soa.erp.api.fi.service;

import com.ykcloud.soa.erp.api.fi.request.FiVenderTempKxAuditRequest;
import com.ykcloud.soa.erp.api.fi.response.FiVenderTempKxAuditResponse;

/**
 * 
 * @author Dan
 * @date 2018年5月22日
 * @description 供应商临时扣项服务
 */
public interface FiVenderTempKxService {

	public FiVenderTempKxAuditResponse auditFiVenderTempKx(FiVenderTempKxAuditRequest request);
}
