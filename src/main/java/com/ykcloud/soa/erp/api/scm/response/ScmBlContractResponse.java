package com.ykcloud.soa.erp.api.scm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.scm.model.ScmBlContractError;

import java.util.List;

/**
 * @Author Hewei
 * @Date 2018/6/20 17:43
 */
public class ScmBlContractResponse extends MessagePack {
    private List<ScmBlContractError> importErrors;

    public List<ScmBlContractError> getImportErrors() {
        return importErrors;
    }

    public void setImportErrors(List<ScmBlContractError> importErrors) {
        this.importErrors = importErrors;
    }
}
