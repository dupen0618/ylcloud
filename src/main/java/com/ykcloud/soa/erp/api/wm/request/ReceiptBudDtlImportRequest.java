package com.ykcloud.soa.erp.api.wm.request;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.scm.model.ImportApprovalDtl;
import com.ykcloud.soa.erp.api.wm.model.ImportWmBlReceiptDtl;

/**
 * 批量导入配送审批单excel
 * @author 殷剑
 * @date 2018年5月14日上午9:28:41
 */
public class ReceiptBudDtlImportRequest extends AbstractUserSessionRequest {

	private static final long serialVersionUID = -2363671608354223816L;

	@NotNull(message = "订货门店编号不能为空！")
	private Long subUnitNumId;

	@NotNull(message = "订单日期不能为空！")
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date orderDate;

	@NotNull(message = "审批单号不能为空！")
	private String approvalNumId;
	
	@NotNull(message = "审批单号不能为空！")
	private Long itemNumId;
	
	private String reservedNo;

	private Long itemid;
	
	@NotEmpty(message = "导入明细不能为空！")
	private List<ImportWmBlReceiptDtl> importWmBlReceiptDtls;

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

	public List<ImportWmBlReceiptDtl> getImportWmBlReceiptDtls() {
		return importWmBlReceiptDtls;
	}

	public void setImportWmBlReceiptDtls(List<ImportWmBlReceiptDtl> importWmBlReceiptDtls) {
		this.importWmBlReceiptDtls = importWmBlReceiptDtls;
	}

	public Long getItemNumId() {
		return itemNumId;
	}

	public void setItemNumId(Long itemNumId) {
		this.itemNumId = itemNumId;
	}

	public Long getItemid() {
		return itemid;
	}

	public void setItemid(Long itemid) {
		this.itemid = itemid;
	}

	public String getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	}
	
}

