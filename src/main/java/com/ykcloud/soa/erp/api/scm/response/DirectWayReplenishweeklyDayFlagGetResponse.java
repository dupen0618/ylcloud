package com.ykcloud.soa.erp.api.scm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

/**
 * 
* @ClassName: DirectWayReplenishweeklyDayFlagGetResponse.java
* @Description: 获得直通门店供应商周期  response
* @version: v1.0.0
* @author: fred.zhao
* @date: 2018年3月14日 下午3:34:02
 */
public class DirectWayReplenishweeklyDayFlagGetResponse extends MessagePack {
	private static final long serialVersionUID = 1L;
	
	private String replenishWeeklyDayFlag;
	
	public String getReplenishWeeklyDayFlag() {
		return replenishWeeklyDayFlag;
	}
	public void setReplenishWeeklyDayFlag(String replenishWeeklyDayFlag) {
		this.replenishWeeklyDayFlag = replenishWeeklyDayFlag;
	}
	
	
}
