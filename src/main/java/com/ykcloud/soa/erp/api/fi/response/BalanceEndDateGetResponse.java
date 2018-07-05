package com.ykcloud.soa.erp.api.fi.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

import java.util.Date;

/**
 * @Description:取结算数据
 * @author
 * @Date 2018年4月4日 下午1:47:39
 */
public class BalanceEndDateGetResponse extends MessagePack {

	private static final long serialVersionUID = 3725506062937780824L;

	private Date endDate;

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
}
