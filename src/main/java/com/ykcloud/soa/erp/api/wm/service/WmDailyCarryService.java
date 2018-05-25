package com.ykcloud.soa.erp.api.wm.service;

import com.ykcloud.soa.erp.api.wm.request.DailyCarryForCheckBillsRequest;
import com.ykcloud.soa.erp.api.wm.request.WmPhysicalDailyAccountGaRequest;
import com.ykcloud.soa.erp.api.wm.response.DailyCarryForCheckBillsResponse;
import com.ykcloud.soa.erp.api.wm.response.WmPhysicalDailyAccountGaReponse;

public interface WmDailyCarryService {

	/**
     * 
    * @Title: createWmPhysicalDailyAccountGaCarryDown  
    * @Description: 物理仓库日进销存结转
    * @param @param request
    * @param @return    参数  
    * @return WmPhysicalDailyAccountGaReponse    返回类型  
    * @throws
     */
    public WmPhysicalDailyAccountGaReponse carryPhysicalDailyAccount(WmPhysicalDailyAccountGaRequest request);
	

    public DailyCarryForCheckBillsResponse checkBillsForDailyCarry(DailyCarryForCheckBillsRequest request);
}

