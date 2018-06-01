package com.ykcloud.soa.erp.api.scm.request;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.scm.model.ImportReturnApprovalDtl;

/**
 * @Description:退货审批单Excel批量导入入参
 * @author Song
 * @Date 2018年5月31日 下午8:03:09
 */
public class ReturnApprovalDtlImportRequest extends AbstractUserSessionRequest{

	private static final long serialVersionUID = 1L;
	
	@NotNull(message="门店编号不能为空")
	private Long subUnitNumId;   //门店编号
	
	@NotNull(message="日期不能为空")
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date orderDate;
	
	@NotNull(message="退货单号不能为空")
	private String approvalNumId;
	
	@NotNull(message="导入明细不能为空")
	private List<ImportReturnApprovalDtl> importReturnApprovalDtls;

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

	public String getApprovalNumId() {
		return approvalNumId;
	}

	public void setApprovalNumId(String approvalNumId) {
		this.approvalNumId = approvalNumId;
	}

	public List<ImportReturnApprovalDtl> getImportReturnApprovalDtls() {
		return importReturnApprovalDtls;
	}

	public void setImportReturnApprovalDtls(List<ImportReturnApprovalDtl> importReturnApprovalDtls) {
		this.importReturnApprovalDtls = importReturnApprovalDtls;
	}

	
	


}
