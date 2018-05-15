package com.ykcloud.soa.erp.api.so.request;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.so.model.ImportReturnApplyDtl;

public class ReturnApplyDtlImportRequest extends AbstractUserSessionRequest {

	private static final long serialVersionUID = 1L;
	@NotNull(message="门店编号")
	private Long subUnitNumId;     //门店编号
	
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	@NotNull(message="日期不能为空")
	private Date orderDate;      //日期
	
	@NotNull(message="申请单号不能为空")
	private String applyNumId;  //申请单号
	
	@NotNull(message="商品明细不能为空")
	private List<ImportReturnApplyDtl> importReturnApplyDtls; //明细表

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

	public List<ImportReturnApplyDtl> getImportReturnApplyDtls() {
		return importReturnApplyDtls;
	}

	public void setImportReturnApplyDtls(List<ImportReturnApplyDtl> importReturnApplyDtls) {
		this.importReturnApplyDtls = importReturnApplyDtls;
	}
	
	
	
	
	


}
