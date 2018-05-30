package com.ykcloud.soa.erp.api.fi.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

public class BillVoucherGenerateRequest extends AbstractUserSessionRequest {
		private static final long serialVersionUID = 1L;
		
		@NotNull(message="门店编号不能为空")
		private Long subUnitNumId;   //门店
		
		@NotNull(message="单据日期不能为空")
		@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
		private Date orderDate;      //订单日期
		
		@NotNull(message="单据编号不能为空")
		private String reservedNo;  //  单据编号
		
		@NotNull(message="单据类型不能为空")
		private Long billType;     //单据类别
		
		@NotNull(message="结算方式不能为空")
		private Long settlementType;
		
		private Long typeNumId;    //类型
		
		private Long crossSubCompanySign;//是否跨子公司
		
		public Long getTypeNumId() {
			return typeNumId;
		}

		public void setTypeNumId(Long typeNumId) {
			this.typeNumId = typeNumId;
		}

		public Long getCrossSubCompanySign() {
			return crossSubCompanySign;
		}

		public void setCrossSubCompanySign(Long crossSubCompanySign) {
			this.crossSubCompanySign = crossSubCompanySign;
		}

		public Long getSettlementType() {
			return settlementType;
		}

		public void setSettlementType(Long settlementType) {
			this.settlementType = settlementType;
		}

		public Long getSubUnitNumId() {
			return subUnitNumId;
		}

		public void setSubUnitNumId(Long subUnitNumId) {
			this.subUnitNumId = subUnitNumId;
		}

		public Date getOrderDate() {
			return orderDate;
		}

		public void setOrderDate(Date orderDate) {
			this.orderDate = orderDate;
		}

		public String getReservedNo() {
			return reservedNo;
		}

		public void setReservedNo(String reservedNo) {
			this.reservedNo = reservedNo;
		}

		public Long getBillType() {
			return billType;
		}

		public void setBillType(Long billType) {
			this.billType = billType;
		}
		
		

}
