package com.ykcloud.soa.erp.api.wm.service;

import com.ykcloud.soa.erp.api.wm.request.ReceiptTrayHdrCreateRequest;
import com.ykcloud.soa.erp.api.wm.request.ReceiptTrayHdrFinishRequest;
import com.ykcloud.soa.erp.api.wm.response.ReceiptTrayHdrCreateResponse;
import com.ykcloud.soa.erp.api.wm.response.ReceiptTrayHdrFinishResponse;

public interface WmReceiptTrayService {
	
	//创建托盘
	public ReceiptTrayHdrCreateResponse createReceiptTrayHdr(ReceiptTrayHdrCreateRequest request);
	//托盘完成(封箱)
	public ReceiptTrayHdrFinishResponse finishReceiptTrayHdr(ReceiptTrayHdrFinishRequest request);
}
