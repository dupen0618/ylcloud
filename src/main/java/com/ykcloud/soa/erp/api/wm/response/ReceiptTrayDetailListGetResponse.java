package com.ykcloud.soa.erp.api.wm.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.wm.model.ReceiptTrayInfo;

public class ReceiptTrayDetailListGetResponse extends MessagePack {

    private static final long serialVersionUID = -8716207623324225827L;
    
    private List<ReceiptTrayInfo> list;

	public List<ReceiptTrayInfo> getList() {
		return list;
	}

	public void setList(List<ReceiptTrayInfo> list) {
		this.list = list;
	}
    
}
