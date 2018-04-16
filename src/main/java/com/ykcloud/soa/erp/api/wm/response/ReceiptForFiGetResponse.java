package com.ykcloud.soa.erp.api.wm.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.wm.model.ReceiptForFi;

public class ReceiptForFiGetResponse extends MessagePack {

	private static final long serialVersionUID = 2999054411107103895L;
	
	private List<ReceiptForFi> receiptForFi;

	public List<ReceiptForFi> getReceiptForFi() {
		return receiptForFi;
	}

	public void setReceiptForFi(List<ReceiptForFi> receiptForFi) {
		this.receiptForFi = receiptForFi;
	}
	
}
