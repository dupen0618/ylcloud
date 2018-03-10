package com.ykcloud.soa.erp.api.md.service;

import com.ykcloud.soa.erp.api.md.request.ConfigValueGetRequest;
import com.ykcloud.soa.erp.api.md.response.ConfigValueGetResponse;

/***
 * 
 * @author hank.zhu
 *@date 2018-03-02 创建
 *
 */


public interface MdTenantService {

	public ConfigValueGetResponse getConfigValue(ConfigValueGetRequest request);
}
