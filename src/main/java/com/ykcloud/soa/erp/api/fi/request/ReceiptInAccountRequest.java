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
	private static final long serialVersionUID = 1L;

    @NotNull(message = "单据类型不能为空！")
    String typeNumId;
    @NotNull(message = "业务类型编号不能为空！")
    private String billTypeNumId;
    @NotEmpty(message = "待入账批次流水不能为空！")
    List<FiPhysicalBatchAccountWba> fiPhysicalBatchAccountWbaList;

	Long balaFuncId;

    public String getTypeNumId() {
        return typeNumId;
    }

    public void setTypeNumId(String typeNumId) {
        this.typeNumId = typeNumId;
    }

    public List<FiPhysicalBatchAccountWba> getFiPhysicalBatchAccountWbaList() {
        return fiPhysicalBatchAccountWbaList;
    }

    public void setFiPhysicalBatchAccountWbaList(List<FiPhysicalBatchAccountWba> fiPhysicalBatchAccountWbaList) {
        this.fiPhysicalBatchAccountWbaList = fiPhysicalBatchAccountWbaList;
    }

    public Long getBalaFuncId() {
        return balaFuncId;
    }

    public void setBalaFuncId(Long balaFuncId) {
        this.balaFuncId = balaFuncId;
    }

    public String getBillTypeNumId() {
        return billTypeNumId;
    }

    public void setBillTypeNumId(String billTypeNumId) {
        this.billTypeNumId = billTypeNumId;
    }
}
