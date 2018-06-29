package com.ykcloud.soa.erp.api.scm.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.scm.model.ImportProtocalError;


public class ProtocolImportResponse extends MessagePack {
	
	/**
	 * 导入采购协议出参
	 */
	private static final long serialVersionUID = 1L;
	
	private List<ImportProtocalError> importProtocalErrors;

	public List<ImportProtocalError> getImportProtocalErrors() {
		return importProtocalErrors;
	}

	public void setImportProtocalErrors(List<ImportProtocalError> importProtocalErrors) {
		this.importProtocalErrors = importProtocalErrors;
	}
	

}
