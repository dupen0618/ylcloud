package com.ykcloud.soa.erp.api.wm.service;

import com.ykcloud.soa.erp.api.wm.request.WmBillInAccountRequest;
import com.ykcloud.soa.erp.api.wm.request.WmReceiptInAccountRequest;
import com.ykcloud.soa.erp.api.wm.response.WmBillInAccountResponse;
import com.ykcloud.soa.erp.api.wm.response.WmReceiptInAccountResponse;

/**
 * @Author Hewei
 * @Date 2018/3/26 18:51
 */
public interface WmBillInAccountService {
    //可用库存
    WmBillInAccountResponse setReceiptInAccountTSCService(WmBillInAccountRequest wmBillInAccountRequest);

    //物理仓
    WmBillInAccountResponse setReceiptInAccountPhysicalWBAService(WmBillInAccountRequest wmBillInAccountRequest);

    //财务库存处理-(批次库存日月进销存+商品成本)
    //验收入库单
    WmReceiptInAccountResponse setReceiptInAccountService(WmReceiptInAccountRequest request);
}
