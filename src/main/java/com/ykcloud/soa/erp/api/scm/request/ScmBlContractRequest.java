package com.ykcloud.soa.erp.api.scm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;
import com.ykcloud.soa.erp.api.scm.model.ImportSupplyContract;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @Author Hewei
 * @Date 2018/6/22 13:48
 */
public class ScmBlContractRequest extends AbstractRequest {

    private static final long serialVersionUID = 4532031481794036021L;
    @NotNull(message = "合同数据不能为空!")
    private List<ImportSupplyContract> importSupplyContractList;

    private Integer skipExistSign;
    private Integer checkSign;

    public Integer getSkipExistSign() {
        return skipExistSign;
    }

    public void setSkipExistSign(Integer skipExistSign) {
        this.skipExistSign = skipExistSign;
    }

    public List<ImportSupplyContract> getImportSupplyContractList() {
        return importSupplyContractList;
    }

    public void setImportSupplyContractList(List<ImportSupplyContract> importSupplyContractList) {
        this.importSupplyContractList = importSupplyContractList;
    }

    public Integer getCheckSign() {
        return checkSign;
    }

    public void setCheckSign(Integer checkSign) {
        this.checkSign = checkSign;
    }
}
