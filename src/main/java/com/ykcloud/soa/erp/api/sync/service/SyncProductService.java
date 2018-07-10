package com.ykcloud.soa.erp.api.sync.service;

import com.ykcloud.soa.erp.api.sync.request.ProtocolSyncRequest;
import com.ykcloud.soa.erp.api.sync.response.ProtocolSyncResponse;

public interface SyncProductService {

	// 同步采购协议
	public ProtocolSyncResponse syncProtocol(ProtocolSyncRequest request);
}
