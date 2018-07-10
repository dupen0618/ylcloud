package com.ykcloud.soa.erp.api.scm.model;

import java.io.Serializable;

/**
 * 进价调整单导入错误明细
 * @author tz.x
 * @date 2018年7月9日下午1:34:51
 */
public class ChangeCostImportErrors implements Serializable {

	private static final long serialVersionUID = 1L;
	
	/**
	 * 调价单号
	 */
	private String reservedNo;
	
	/**
	 * 调整类型
	 */
	private Long typeNumId;
	
	/**
	 * 门店编码
	 */
	private Long subUnitId;
	
	/**
	 * 错误明细
	 */
	private String errorMsg;

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	}

	public Long getTypeNumId() {
		return typeNumId;
	}

	public void setTypeNumId(Long typeNumId) {
		this.typeNumId = typeNumId;
	}

	public Long getSubUnitId() {
		return subUnitId;
	}

	public void setSubUnitId(Long subUnitId) {
		this.subUnitId = subUnitId;
	}


}
