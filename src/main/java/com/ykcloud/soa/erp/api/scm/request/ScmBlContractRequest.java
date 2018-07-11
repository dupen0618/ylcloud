package com.ykcloud.soa.erp.api.scm.request;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.scm.model.ScmBlContract;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author Hewei
 * @Date 2018/6/22 13:48
 */
public class ScmBlContractRequest extends AbstractUserSessionRequest {

    private static final long serialVersionUID = 4532031481794036021L;
    @NotNull(message = "合同数据不能为空!")
    private List<ScmBlContract> scmBlContractList;

    private Integer skipExistSign;
    private Integer checkSign;

    public Integer getSkipExistSign() {
        return skipExistSign;
    }

    public void setSkipExistSign(Integer skipExistSign) {
        this.skipExistSign = skipExistSign;
    }

    public List<ScmBlContract> getScmBlContractList() {
        return scmBlContractList;
    }

    public void setScmBlContractList(List<ScmBlContract> scmBlContractList) {
        this.scmBlContractList = scmBlContractList;
    }

    public Integer getCheckSign() {
        return checkSign;
    }

    public void setCheckSign(Integer checkSign) {
        this.checkSign = checkSign;
    }
}
