package com.ykcloud.soa.erp.api.scm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

/***
*
@author hank.zhu
@date 2018年3月7日 上午11:43:28 新建
*/

//获得直通门店供应商周期  响应参数类      
public class DirectWayReplenishweeklyDayFlagGetResponse extends MessagePack {
	private static final long serialVersionUID = 1L;
	private String replenish_weekly_day_flag;
	public String getReplenish_weekly_day_flag() {
		return replenish_weekly_day_flag;
	}
	public void setReplenish_weekly_day_flag(String replenish_weekly_day_flag) {
		this.replenish_weekly_day_flag = replenish_weekly_day_flag;
	}
	
}
