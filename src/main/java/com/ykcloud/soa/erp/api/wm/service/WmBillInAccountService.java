package com.ykcloud.soa.erp.api.wm.service;

import com.ykcloud.soa.erp.api.wm.request.WmBillInAccountRequest;
import com.ykcloud.soa.erp.api.wm.response.WmBillInAccountResponse;

/**
 * @Author Hewei
 * @Date 2018/3/26 18:51
 */
public interface WmBillInAccountService {
    //可用库存
    WmBillInAccountResponse setReceiptInAccountTSCService(WmBillInAccountRequest wmBillInAccountRequest);

    //物理仓
    WmBillInAccountResponse setReceiptInAccountPhysicalWBAService(WmBillInAccountRequest wmBillInAccountRequest);

}
