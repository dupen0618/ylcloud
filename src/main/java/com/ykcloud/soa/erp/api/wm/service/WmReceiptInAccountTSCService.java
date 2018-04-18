package com.ykcloud.soa.erp.api.wm.service;

import com.ykcloud.soa.erp.api.wm.request.WmAccountRequest;
import com.ykcloud.soa.erp.api.wm.response.InventoryBillInAccountResponse;

public interface WmReceiptInAccountTSCService {

    InventoryBillInAccountResponse setReceiptInAccountPhysicalWBAService(WmAccountRequest request);
}
