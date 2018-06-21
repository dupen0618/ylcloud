package com.ykcloud.soa.erp.api.fi.request;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.fi.model.ReceiptAdjustOnLoadAccountForAdjust;

import java.util.List;

/**
 * 更新供货方财务在途金额和税金
 * @author tz.x
 * @date 2018年5月18日下午2:45:11
 */
public class ReceiptOnLoadInBatchMonthAccountAdjustRequest extends AbstractUserSessionRequest {

	private static final long serialVersionUID = -3746160038603174845L;
	
	/**
	 * 验收入库单调整批次月进销存在途明细
	 */
	private List<ReceiptAdjustOnLoadAccountForAdjust> receiptOnloadAdjustDetails;

	public List<ReceiptAdjustOnLoadAccountForAdjust> getReceiptOnloadAdjustDetails() {
		return receiptOnloadAdjustDetails;
	}

	public void setReceiptOnloadAdjustDetails(List<ReceiptAdjustOnLoadAccountForAdjust> receiptOnloadAdjustDetails) {
		this.receiptOnloadAdjustDetails = receiptOnloadAdjustDetails;
	}

}
