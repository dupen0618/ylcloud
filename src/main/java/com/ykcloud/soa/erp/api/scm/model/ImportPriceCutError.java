package com.ykcloud.soa.erp.api.scm.model;

import java.io.Serializable;

/**
 * 削价导入错误明细
 * @author pengh
 */
public class ImportPriceCutError implements Serializable {
	
	private static final long serialVersionUID = 4088430661582883734L;
	
	private String errorMsg;

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
	
}
