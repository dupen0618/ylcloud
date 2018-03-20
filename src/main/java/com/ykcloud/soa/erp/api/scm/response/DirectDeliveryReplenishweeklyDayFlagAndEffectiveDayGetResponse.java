package com.ykcloud.soa.erp.api.scm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

/**
* 
* @ClassName: DirectDeliveryReplenishweeklyDayFlagAndEffectiveDayGetResponse.java
* @Description: 直送门店、供应商订货周期、有效天数response
* @version: v1.0.0
* @author: fred.zhao
* @date: 2018年3月14日 下午3:31:06 
*/
public class DirectDeliveryReplenishweeklyDayFlagAndEffectiveDayGetResponse extends MessagePack{

	private static final long serialVersionUID = -5619807700176014562L;
	
	//'1234567',供应商商品可补货日(周一至周日,'1004000'表示周一和周四补货)
	private String replenishWeeklyDayFlag;
	
	//有效天数
	private Long effectiveDay;

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
