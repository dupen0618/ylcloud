package com.ykcloud.soa.erp.api.so.response;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.response.MessagePack;

/**
 * @author linming.xie
 * @date 2017年12月15日 上午11:18:37
 */
public class LastSalesDateGetResponse extends MessagePack {

	private static final long serialVersionUID = 5304969504492084935L;

	// 最后日结日期+1天
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date lastSalesDate;

	public Date getLastSalesDate() {
		return lastSalesDate;
	}

	public void setLastSalesDate(Date lastSalesDate) {
		this.lastSalesDate = lastSalesDate;
	}

}
