package com.ykcloud.soa.erp.api.wm.service;

import com.ykcloud.soa.erp.api.wm.response.EffectRowsResponse;
import com.ykcloud.soa.erp.api.wm.response.WmPhysicalDailyAccountGaInterRequest;

public interface WmPhysicalDailyAccountGaService {

    EffectRowsResponse interWmPhysicalDailyAccountGa(WmPhysicalDailyAccountGaInterRequest request);

}
