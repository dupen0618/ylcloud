package com.ykcloud.soa.erp.api.scm.model;

import java.io.Serializable;

public class ApprovalStorageForGenerateDistributionSo implements Serializable {

	private static final long serialVersionUID = 277797115130619689L;
	
	/**
	 * 行号 用于回写so_num_id
	 */
	private String series;

	private Long typeNumId;// 3：配送到店，4：配送分拨到仓，5：配送分拨到店

	private Long custSubUnitNumId;

	private Long recStorageNumId;// 收货仓库编号

	private Long storageNumId;// 发货仓

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public Long getTypeNumId() {
		return typeNumId;
	}

	public void setTypeNumId(Long typeNumId) {
		this.typeNumId = typeNumId;
	}

	public Long getCustSubUnitNumId() {
		return custSubUnitNumId;
	}

	public void setCustSubUnitNumId(Long custSubUnitNumId) {
		this.custSubUnitNumId = custSubUnitNumId;
	}

	public Long getRecStorageNumId() {
		return recStorageNumId;
	}

	public void setRecStorageNumId(Long recStorageNumId) {
		this.recStorageNumId = recStorageNumId;
	}

	public Long getStorageNumId() {
		return storageNumId;
	}

	public void setStorageNumId(Long storageNumId) {
		this.storageNumId = storageNumId;
	}

}
