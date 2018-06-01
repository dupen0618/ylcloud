package com.ykcloud.soa.erp.api.scm.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.scm.model.ImportReturnApprovalDtlError;

/**
 * @Description:退货审批单Excel批量导入出参
 * @author Song
 * @Date 2018年5月31日 下午8:13:31
 */
public class ReturnApprovalDtlImportResponse extends MessagePack{

	private static final long serialVersionUID = 1L;

	private List<ImportReturnApprovalDtlError> importErrors;

	public List<ImportReturnApprovalDtlError> getImportErrors() {
		return importErrors;
	}

	public void setImportErrors(List<ImportReturnApprovalDtlError> importErrors) {
		this.importErrors = importErrors;
	}
	
	

}
