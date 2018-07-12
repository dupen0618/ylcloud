package com.ykcloud.soa.erp.api.scm.model;

import java.io.Serializable;

/**
 * @Author Hewei
 * @Date 2018/6/21 10:58
 */
public class ScmBlContractError implements Serializable {
    private static final long serialVersionUID = 2023404012728172946L;

    private Long keyID;
    private String errorMsg;

    public Long getKeyID() {
        return keyID;
    }

    public void setKeyID(Long keyID) {
        this.keyID = keyID;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Override
    public String toString() {
        return "{" +
                "keyID=" + keyID +
                ", errorMsg='" + errorMsg + '\'' +
                '}';
    }
}
