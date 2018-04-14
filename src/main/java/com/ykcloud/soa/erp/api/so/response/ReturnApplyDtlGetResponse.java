package com.ykcloud.soa.erp.api.so.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.so.model.MaterialIssueBackDtl;

import java.util.List;

/**
 * @Author: fred.zhao
 * @Description:
 * @Date: Created in 11:00:2018/3/30
 */
public class ReturnApplyDtlGetResponse extends MessagePack {
    private static final long serialVersionUID = -2483461422473599832L;

    private List<MaterialIssueBackDtl> materialIssueBackDtls;

    public List<MaterialIssueBackDtl> getMaterialIssueBackDtls() {
        return materialIssueBackDtls;
    }

    public void setMaterialIssueBackDtls(List<MaterialIssueBackDtl> materialIssueBackDtls) {
        this.materialIssueBackDtls = materialIssueBackDtls;
    }
}
