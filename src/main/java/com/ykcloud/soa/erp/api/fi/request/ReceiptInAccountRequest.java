package com.ykcloud.soa.erp.api.fi.request;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.fi.model.FiPhysicalBatchAccountWba;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @Author Hewei
 * @Date 2018/4/10 11:31
 */
public class ReceiptInAccountRequest extends AbstractUserSessionRequest {
    @NotNull(message = "单据类型不能为空！")
    String typeNum;
    @NotEmpty(message = "待入账批次流水不能为空！")
    List<FiPhysicalBatchAccountWba> fiPhysicalBatchAccountWbaList;

    String balaFuncId;

    public String getTypeNum() {
        return typeNum;
    }

    public void setTypeNum(String typeNum) {
        this.typeNum = typeNum;
    }

    public List<FiPhysicalBatchAccountWba> getFiPhysicalBatchAccountWbaList() {
        return fiPhysicalBatchAccountWbaList;
    }

    public void setFiPhysicalBatchAccountWbaList(List<FiPhysicalBatchAccountWba> fiPhysicalBatchAccountWbaList) {
        this.fiPhysicalBatchAccountWbaList = fiPhysicalBatchAccountWbaList;
    }

    public String getBalaFuncId() {
        return balaFuncId;
    }

    public void setBalaFuncId(String balaFuncId) {
        this.balaFuncId = balaFuncId;
    }
}
