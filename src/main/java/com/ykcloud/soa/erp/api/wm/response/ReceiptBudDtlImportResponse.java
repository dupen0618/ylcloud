/**
 * 
 */

package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

public class ReceiptBudDtlImportResponse extends MessagePack {

	/**
	 * by 殷剑
	 */
	
	private static final long serialVersionUID = 1799650669290502105L;
	
	//验收单
	private String reservedNo;

	public String getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	}
	
	


	
}

