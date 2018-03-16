package com.ykcloud.soa.erp.api.wm.response;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.response.MessagePack;

public class ShopProductLastReceiveDateGetResponse extends MessagePack {
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	private Date lastReceiveDate;     //最近收货日期

	public Date getLastReceiveDate() {
		return lastReceiveDate;
	}

	public void setLastReceiveDate(Date lastReceiveDate) {
		this.lastReceiveDate = lastReceiveDate;
	}
	
	

}
