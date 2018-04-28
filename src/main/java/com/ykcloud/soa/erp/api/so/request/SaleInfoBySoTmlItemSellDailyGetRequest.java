package com.ykcloud.soa.erp.api.so.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class SaleInfoBySoTmlItemSellDailyGetRequest extends AbstractRequest {
	
		private static final long serialVersionUID = 1L;
		@NotNull(message="门店编号不能为空")
		private Long subUnitNumId;  //门店编号
		
		@NotNull(message="供应商编号不能为空")
		private Long supplyUnitNumId; //供应 商编号
		
		@NotNull(message="结算方式不能为空")
		private Long settlementType;  //结算方式
		
		@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
		@NotNull(message = "开始日期不能为空！")
		private Date startDate;    //起始时间
		
		@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
		@NotNull(message = "截止日期不能为空！")
		private Date endDate;      //截止时间

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

		public Long getSettlementType() {
			return settlementType;
		}

		public void setSettlementType(Long settlementType) {
			this.settlementType = settlementType;
		}

		public Date getStartDate() {
			return startDate;
		}

		public void setStartDate(Date startDate) {
			this.startDate = startDate;
		}

		public Date getEndDate() {
			return endDate;
		}

		public void setEndDate(Date endDate) {
			this.endDate = endDate;
		}
		
		

}
