package com.ykcloud.soa.erp.api.wm.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.wm.model.MaterialIssueBackDtl;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

/**
 * @Author: fred.zhao
 * @Description:
 * @Date: Created in 18:47:2018/4/12
 */
public class ShipForMaterialIssueBackGenerateRequest extends AbstractUserSessionRequest {
    private static final long serialVersionUID = -2565804606566389459L;

    @NotNull(message = "门店编号不能为空！")
    private Long subUnitNumId;

    @NotNull(message = "申请单号不能为空！")
    private String applyNumId;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @NotNull(message = "申请单审核日期不能为空！")
    private Date auditDate;

    @NotNull(message = "原出库单编号不能为空！")
    private String originReservedNo;//原出库单编号

    @NotNull(message = "原单出库申请日期不能为空！")
    private Date originShipDate;//原单出库日期


    @NotNull(message = "申请单数据不能为空！")
    private List<MaterialIssueBackDtl> materialIssueBackDtlList;

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }

    public String getApplyNumId() {
        return applyNumId;
    }

    public void setApplyNumId(String applyNumId) {
        this.applyNumId = applyNumId;
    }

    public Date getAuditDate() {
        return auditDate;
    }

    public void setAuditDate(Date auditDate) {
        this.auditDate = auditDate;
    }

    public String getOriginReservedNo() {
        return originReservedNo;
    }

    public void setOriginReservedNo(String originReservedNo) {
        this.originReservedNo = originReservedNo;
    }

    public Date getOriginShipDate() {
        return originShipDate;
    }

    public void setOriginShipDate(Date originShipDate) {
        this.originShipDate = originShipDate;
    }

    public List<MaterialIssueBackDtl> getMaterialIssueBackDtlList() {
        return materialIssueBackDtlList;
    }

    public void setMaterialIssueBackDtlList(List<MaterialIssueBackDtl> materialIssueBackDtlList) {
        this.materialIssueBackDtlList = materialIssueBackDtlList;
    }
}
