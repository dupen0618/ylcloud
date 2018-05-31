package com.ykcloud.soa.erp.api.so.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.so.model.ImportSoApplyDtlError;
////店内调拨、行政领料、委外拆解领料商品EXCEL导入的出参
public class SoApplyDtlImportResponse extends MessagePack {
	private static final long serialVersionUID = 1L;
	
	private List<ImportSoApplyDtlError> importErrors; //出错列表

	public List<ImportSoApplyDtlError> getImportErrors() {
		return importErrors;
	}

	public void setImportErrors(List<ImportSoApplyDtlError> importErrors) {
		this.importErrors = importErrors;
	}

	
	

	
	
	
	
	
	
	

}
