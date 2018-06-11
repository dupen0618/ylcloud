package com.ykcloud.soa.erp.api.wm.response;

import java.util.Date;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

/**
 * 获取入账日期
 * @author tz.x
 * @date 2018年6月11日下午7:15:52
 */
public class BillInAccountDateGetResponse extends MessagePack {

	private static final long serialVersionUID = 4842910818594770537L;
	
	/**
	 * 销售日期
	 */
	private Date salesDate;

	public Date getSalesDate() {
		return salesDate;
	}

	public void setSalesDate(Date salesDate) {
		this.salesDate = salesDate;
	}

}
