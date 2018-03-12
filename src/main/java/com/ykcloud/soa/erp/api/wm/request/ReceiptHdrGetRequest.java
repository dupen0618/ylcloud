package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

/**
*
@author hank.zhu
@date 2018年3月12日 下午8:19:28 新建
**/
public class ReceiptHdrGetRequest extends AbstractRequest {

	private static final long serialVersionUID = 1L;
	private String reservedNo;
	/**
	 * @return the reservedNo
	 */
	public String getReservedNo() {
		return reservedNo;
	}
	/**
	 * @param reservedNo the reservedNo to set
	 */
	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	}
}
