package com.ykcloud.soa.erp.api.wm.service;

import com.ykcloud.soa.erp.api.wm.request.WmAccountRequest;
import com.ykcloud.soa.erp.api.wm.request.WmPhysicalDailyAccountGaRequest;
import com.ykcloud.soa.erp.api.wm.response.InventoryBillInAccountResponse;
import com.ykcloud.soa.erp.api.wm.response.WmPhysicalDailyAccountGaReponse;

public interface WmReceiptInAccountTSCService {

    InventoryBillInAccountResponse setReceiptInAccountPhysicalWBAService(WmAccountRequest request);
    
    /**
     * 
    * @Title: createWmPhysicalDailyAccountGaCarryDown  
    * @Description: 物理仓库日进销存结转
    * @param @param request
    * @param @return    参数  
    * @return WmPhysicalDailyAccountGaReponse    返回类型  
    * @throws
     */
    WmPhysicalDailyAccountGaReponse createWmPhysicalDailyAccountGaCarryDown(WmPhysicalDailyAccountGaRequest request);
}
