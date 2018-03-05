package com.ykcloud.soa.erp.api.md.service;
/***
 * 
 * @author hank.zhu
 *@date 2018-03-02 创建
 *
 */

import com.ykcloud.soa.erp.api.md.request.ItemStatusPermitActionGetRequest;
import com.ykcloud.soa.erp.api.md.response.ItemStatusPermitActionCheckResponse;

public interface MdTenantService {
	public ItemStatusPermitActionCheckResponse checkItemStatusPermitAction(ItemStatusPermitActionGetRequest Request);

}
