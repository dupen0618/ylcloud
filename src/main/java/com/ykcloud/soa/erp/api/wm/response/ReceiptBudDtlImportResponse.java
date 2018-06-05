/**
 * 
 */
package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

/**
 * @author 殷剑
 *
 */

public class ReceiptBudDtlImportResponse extends MessagePack {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8412759222053439936L;
	
	//验收单
	private String reservedNo;

	public String getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	}
	
	


	
}
