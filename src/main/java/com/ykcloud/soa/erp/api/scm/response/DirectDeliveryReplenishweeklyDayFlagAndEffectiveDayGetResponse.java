package com.ykcloud.soa.erp.api.scm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

/**
 * 直送门店的供应商订货周期、有效天数的出参类
 * @author 14540
 *
 */

public class DirectDeliveryReplenishweeklyDayFlagAndEffectiveDayGetResponse extends MessagePack {
    private String replenishWeeklyDayFlag; // '1234567'供应商商品可补货日周一至周日,'1004000'表示周一和周四补货)
   
    private Long effectiveDay;             //有效天数

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
