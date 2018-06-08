package com.ykcloud.soa.erp.api.wm.request;

import java.util.List;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.wm.model.ImportReceiptForBeginning;

/**
 * 期初库存导入
 * @author tz.x
 * @date 2018年6月7日下午4:17:15
 */
public class ReceiptForBeginningImportRequest extends AbstractUserSessionRequest {

	private static final long serialVersionUID = 1420210934585168505L;
	
	/**
	 * 期初导入明细
	 */
	private List<ImportReceiptForBeginning> receiptBeginningList;

	public List<ImportReceiptForBeginning> getReceiptBeginningList() {
		return receiptBeginningList;
	}

	public void setReceiptBeginningList(List<ImportReceiptForBeginning> receiptBeginningList) {
		this.receiptBeginningList = receiptBeginningList;
	}

}
