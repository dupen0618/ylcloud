package com.ykcloud.soa.erp.api.wm.service;

import com.ykcloud.soa.erp.api.wm.request.WmPhysicalCarryDownRequest;
import com.ykcloud.soa.erp.api.wm.response.EffectRowsResponse;
import com.ykcloud.soa.erp.api.wm.response.WmPhysicalCarryDownResponse;
import com.ykcloud.soa.erp.api.wm.response.WmPhysicalDailyAccountGaInterRequest;

public interface WmPhysicalDailyAccountGaService {

    EffectRowsResponse interWmPhysicalDailyAccountGa(WmPhysicalDailyAccountGaInterRequest request);

    /**
     * 物理仓库月进销存结转
     * @param request
     * @return
     */
     WmPhysicalCarryDownResponse carryDwonWmPhysical(WmPhysicalCarryDownRequest request);


}
