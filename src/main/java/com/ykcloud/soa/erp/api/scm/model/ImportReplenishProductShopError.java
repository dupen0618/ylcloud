package com.ykcloud.soa.erp.api.scm.model;

import java.io.Serializable;

public class ImportReplenishProductShopError implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String subUnitNumId;
	private String itemId;
	private String importError; // 错误信息

	public String getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(String subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getImportError() {
		return importError;
	}

	public void setImportError(String importError) {
		this.importError = importError;
	}

}
