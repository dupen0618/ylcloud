package com.ykcloud.soa.erp.api.so.request;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.so.model.ImportSoApplyDtl;
//店内调拨、行政领料、委外拆解领料商品EXCEL导入的入参
public class SoApplyDtlImportRequest extends AbstractUserSessionRequest {
	private static final long serialVersionUID = 1L;
	
	@NotNull(message="门店编号不能为空")
	private Long subUnitNumId;   //门店编号
	
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	@NotNull(message="日期不能为空")
	private Date orderDate;
	
	@NotNull(message="补货申请单不能为空")
	private String applyNumId;    //补货申请单编号
	
	@NotNull(message="导入明细不能为空")
	private List<ImportSoApplyDtl> importSoApplyDtls; //导入明细

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

	public List<ImportSoApplyDtl> getImportSoApplyDtls() {
		return importSoApplyDtls;
	}

	public void setImportSoApplyDtls(List<ImportSoApplyDtl> importSoApplyDtls) {
		this.importSoApplyDtls = importSoApplyDtls;
	}
	
	

}
