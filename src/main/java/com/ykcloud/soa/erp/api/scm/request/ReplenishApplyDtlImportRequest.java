package com.ykcloud.soa.erp.api.scm.request;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.scm.model.ImportReplenishApplyDtl;
//补货申请单excel表格批量导入,入参
public class ReplenishApplyDtlImportRequest extends AbstractUserSessionRequest {
		private static final long serialVersionUID = 1L;
	
		@NotNull(message="门店编号不能为空")
		private Long subUnitNumId;   //门店编号
		
		@NotNull(message="日期不能为空")
		private Date orderDate;
		
		@NotNull(message="申请单号不能为空")
		private String applyNumId;
		
		@NotNull(message="导入明细不能为空")
		private List<ImportReplenishApplyDtl> importReplenishApplyApprovalDtls;

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

		public String getApplyNumId() {
			return applyNumId;
		}

		public void setApplyNumId(String applyNumId) {
			this.applyNumId = applyNumId;
		}

		public List<ImportReplenishApplyDtl> getImportReplenishApplyApprovalDtls() {
			return importReplenishApplyApprovalDtls;
		}

		public void setImportReplenishApplyApprovalDtls(List<ImportReplenishApplyDtl> importReplenishApplyApprovalDtls) {
			this.importReplenishApplyApprovalDtls = importReplenishApplyApprovalDtls;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		
		

}
