package com.ykcloud.soa.erp.api.wm.request;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.wm.model.ImportWmBlStocktakingDtl;

public class WmBlStocktakingDtlImportRequest extends AbstractUserSessionRequest {

	private static final long serialVersionUID = 1L;

	private List<ImportWmBlStocktakingDtl> importWmBlStocktakingDtl;

	private Long subUnitNumId;

	private String reservedNo;

	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date inventoryDate;

	public List<ImportWmBlStocktakingDtl> getImportWmBlStocktakingDtl() {
		return importWmBlStocktakingDtl;
	}

	public void setImportWmBlStocktakingDtl(List<ImportWmBlStocktakingDtl> importWmBlStocktakingDtl) {
		this.importWmBlStocktakingDtl = importWmBlStocktakingDtl;
	}

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

	public Date getInventoryDate() {
		return inventoryDate;
	}

	public void setInventoryDate(Date inventoryDate) {
		this.inventoryDate = inventoryDate;
	}

}
