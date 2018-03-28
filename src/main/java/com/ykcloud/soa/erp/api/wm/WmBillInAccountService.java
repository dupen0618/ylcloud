package com.ykcloud.soa.erp.api.wm;

import com.ykcloud.soa.erp.api.wm.request.WmBillInAccountRequest;
import com.ykcloud.soa.erp.api.wm.response.WmBillInAccountResponse;

/**
 * @Author Hewei
 * @Date 2018/3/26 18:51
 */
public interface WmBillInAccountService {
    WmBillInAccountResponse ReceiptInAccountTSCService(WmBillInAccountRequest wmBillInAccountRequest);
    WmBillInAccountResponse ReceiptInAccountSTKService(WmBillInAccountRequest wmBillInAccountRequest);
}
