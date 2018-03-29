package com.ykcloud.soa.erp.api.wm.service;

import com.ykcloud.soa.erp.api.wm.request.WmBillInAccountRequest;
import com.ykcloud.soa.erp.api.wm.response.WmBillInAccountResponse;

/**
 * @Author Hewei
 * @Date 2018/3/26 18:51
 */
public interface WmBillInAccountService {
    //库存流水
    WmBillInAccountResponse ReceiptInAccountTSCService(WmBillInAccountRequest wmBillInAccountRequest);
    //库存总账
    WmBillInAccountResponse ReceiptInAccountSTKService(WmBillInAccountRequest wmBillInAccountRequest);
    //物理仓流水
    WmBillInAccountResponse ReceiptInAccountPhysicalWBAService(WmBillInAccountRequest wmBillInAccountRequest);
    //物理仓日进销存
    WmBillInAccountResponse ReceiptInAccountPhysicalDailyGAService(WmBillInAccountRequest wmBillInAccountRequest);
    //物理仓月进销存
    WmBillInAccountResponse ReceiptInAccountPhysicalMonthGAService(WmBillInAccountRequest wmBillInAccountRequest);
}
