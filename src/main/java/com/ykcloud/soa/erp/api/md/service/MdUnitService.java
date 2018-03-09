package com.ykcloud.soa.erp.api.md.service;

import com.ykcloud.soa.erp.api.md.request.SupplyStatusNumIdGetRequest;
import com.ykcloud.soa.erp.api.md.response.SupplyStatusNumIdGetResponse;
//业务单元相关服务类
public interface MdUnitService {
	public SupplyStatusNumIdGetResponse getSupplyStatusNumId(SupplyStatusNumIdGetRequest Request);
}
