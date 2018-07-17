package com.ykcloud.soa.erp.api.wm.request;

import java.util.List;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.wm.model.ImportWmBlStocktakingTaskDtl;

public class WmBlStocktakingTaskDtlImportRequest extends AbstractUserSessionRequest {

	private static final long serialVersionUID = 1L;

	private List<ImportWmBlStocktakingTaskDtl> importWmBlStocktakingTaskDtl;

	private String reservedNo;

	private Long subUnitNumId;

	public List<ImportWmBlStocktakingTaskDtl> getImportWmBlStocktakingTaskDtl() {
		return importWmBlStocktakingTaskDtl;
	}

	public void setImportWmBlStocktakingTaskDtl(List<ImportWmBlStocktakingTaskDtl> importWmBlStocktakingTaskDtl) {
		this.importWmBlStocktakingTaskDtl = importWmBlStocktakingTaskDtl;
	}

	public String getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	}

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

}
