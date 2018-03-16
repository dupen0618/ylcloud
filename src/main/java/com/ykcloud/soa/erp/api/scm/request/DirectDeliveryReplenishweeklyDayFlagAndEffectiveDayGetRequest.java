package com.ykcloud.soa.erp.api.scm.request;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

/**
 * 直送门店的供应商订货周期、有效天数的入参类
 * @author 14540
 *
 */
public class DirectDeliveryReplenishweeklyDayFlagAndEffectiveDayGetRequest extends AbstractRequest {
         @NotNull(message = "门店编号不能为空！")
	     private Long subUnitNumId;    //门店编号
         @NotNull(message = "供应商编号不能为空！")
         private Long supplyUnitNumId;  //供应商编号
		public Long getSubUnitNumId() {
			return subUnitNumId;
		}
		public void setSubUnitNumId(Long subUnitNumId) {
			this.subUnitNumId = subUnitNumId;
		}
		public Long getSupplyUnitNumId() {
			return supplyUnitNumId;
		}
		public void setSupplyUnitNumId(Long supplyUnitNumId) {
			this.supplyUnitNumId = supplyUnitNumId;
		}

		
         
}
