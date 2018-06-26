package com.ykcloud.soa.erp.api.scm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.scm.model.ScmBlContract;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @Author Hewei
 * @Date 2018/6/22 13:48
 */
public class ScmBlContractRequest extends AbstractUserSessionRequest {

    @NotNull(message = "合同数据不能为空!")
    private List<ScmBlContract> scmBlContractList;

    public List<ScmBlContract> getScmBlContractList() {
        return scmBlContractList;
    }

    public void setScmBlContractList(List<ScmBlContract> scmBlContractList) {
        this.scmBlContractList = scmBlContractList;
    }
}
