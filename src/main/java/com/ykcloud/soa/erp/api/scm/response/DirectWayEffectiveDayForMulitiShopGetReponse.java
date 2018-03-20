package com.ykcloud.soa.erp.api.scm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
/**
 * 直通多门店供应商有效天数的出参类
 * @author 14540
 *
 */
public class DirectWayEffectiveDayForMulitiShopGetReponse extends MessagePack {
	
	private String replenishWeeklyDayFlag;   //供应商商品可补货日
	
	private Long effectiveDay;               //有限天数

	public String getReplenishWeeklyDayFlag() {
		return replenishWeeklyDayFlag;
	}

	public void setReplenishWeeklyDayFlag(String replenishWeeklyDayFlag) {
		this.replenishWeeklyDayFlag = replenishWeeklyDayFlag;
	}

	public Long getEffectiveDay() {
		return effectiveDay;
	}

	public void setEffectiveDay(Long effectiveDay) {
		this.effectiveDay = effectiveDay;
	}
	
	

}
