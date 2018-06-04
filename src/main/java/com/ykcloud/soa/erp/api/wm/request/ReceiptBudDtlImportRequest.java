
package com.ykcloud.soa.erp.api.wm.request;

import java.util.List;

/**
 * @author 殷剑
 *
 */

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.fi.model.BillDtlForWriteBackStatus;
import com.ykcloud.soa.erp.api.wm.model.ImportWmBlReceiptDtl;

public class ReceiptBudDtlImportRequest extends AbstractUserSessionRequest {

	/**
	 * 殷剑
	 */
	private static final long serialVersionUID = 6471780752714094363L;

	@NotNull(message = "门店编号不能为空!")
	private Long subUnitNumId;
	
	@NotNull(message = "出库单号不能为空!")
	private String reservedNo;
	
	private Long itemNumId;
	
	List<ImportWmBlReceiptDtl> importWmBlReceiptDtls;

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public String getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
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
	
}

