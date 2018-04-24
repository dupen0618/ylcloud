package com.ykcloud.soa.erp.api.scm.service;
import com.ykcloud.soa.erp.api.scm.request.SupplyPayTypeIdGetRequest;
import com.ykcloud.soa.erp.api.scm.response.SupplyPayTypeIdGetResponse;

/**
 * @Author:ALi
 * @Description: 结算周期
 * @Date:
 */
public interface SupplyPayTypeIdGetService {
   //获得结算周期
    public SupplyPayTypeIdGetResponse getSupplyPayTypeId(SupplyPayTypeIdGetRequest Request);

}
