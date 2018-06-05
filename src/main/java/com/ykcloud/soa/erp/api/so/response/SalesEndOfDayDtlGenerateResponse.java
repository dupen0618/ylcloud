package com.ykcloud.soa.erp.api.so.response;

import java.util.Date;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

/**
 * 生成销售日期
 * @author tz.x
 * @date 2018年6月5日上午11:46:45
 */
public class SalesEndOfDayDtlGenerateResponse extends MessagePack {

	private static final long serialVersionUID = 2193165461252583536L;
	
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
