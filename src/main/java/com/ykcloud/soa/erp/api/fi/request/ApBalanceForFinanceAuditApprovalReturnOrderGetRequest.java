package com.ykcloud.soa.erp.api.fi.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @Author: fred.zhao
 * @Description:
 * @Date: Created in 15:34:2018/4/7
 */
public class ApBalanceForFinanceAuditApprovalReturnOrderGetRequest extends AbstractRequest {
    private static final long serialVersionUID = -128211566686653796L;

    @NotNull(message="门店编号不能为空！")
    private Long subUnitNumId;

    @NotNull(message="供应商编号不能为空！")
    private Long supplyUnitNumId;

    @NotNull(message="科目列表不能为空！")
    private List<Long> subjectNumIds;

    @NotNull(message="查询标识不能为空！")
    private Long supplyCortSign;


    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }

    public Long getSupplyUnitNumId() {
        return supplyUnitNumId;
    }

    public void setSupplyUnitNumId(Long supplyUnitNumId) {
        this.supplyUnitNumId = supplyUnitNumId;
    }

    public List<Long> getSubjectNumIds() {
        return subjectNumIds;
    }

    public void setSubjectNumIds(List<Long> subjectNumIds) {
        this.subjectNumIds = subjectNumIds;
    }

    public Long getSupplyCortSign() {
        return supplyCortSign;
    }

    public void setSupplyCortSign(Long supplyCortSign) {
        this.supplyCortSign = supplyCortSign;
    }
}
