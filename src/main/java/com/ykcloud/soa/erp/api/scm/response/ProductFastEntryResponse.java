package com.ykcloud.soa.erp.api.scm.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.scm.model.FastEntryError;

public class ProductFastEntryResponse extends MessagePack {

	/**
	 * 快速录入出参
	 */
	private static final long serialVersionUID = 1L;
	
	private List<FastEntryError> errors;

	public List<FastEntryError> getErrors() {
		return errors;
	}

	public void setErrors(List<FastEntryError> errors) {
		this.errors = errors;
	}
	
	

}
