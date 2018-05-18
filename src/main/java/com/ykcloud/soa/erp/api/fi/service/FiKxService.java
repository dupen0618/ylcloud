package com.ykcloud.soa.erp.api.fi.service;

import com.ykcloud.soa.erp.api.fi.request.KxGenRequest;
import com.ykcloud.soa.erp.api.fi.request.KxNameGetRequest;
import com.ykcloud.soa.erp.api.fi.response.KxGenResponse;
import com.ykcloud.soa.erp.api.fi.response.KxNameGetResponse;

/**
 * @Description:查找扣项名称
 * @author Song
 * @Date 2018年5月8日 上午11:38:46
 */
public interface FiKxService {

	//根据扣项类型type，查找扣项名称
	public KxNameGetResponse getKxName(KxNameGetRequest request);

	/**
	 * 自动生成扣项入口方法
	 *
	 * @param request
	 * @return
	 */
	KxGenResponse genKx(KxGenRequest request);
}
