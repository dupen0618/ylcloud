package com.ykcloud.soa.erp.api.scm.request;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

import javax.validation.constraints.NotNull;
import java.util.Date;


public class AuditApprovalOrderByBuyerGetRequest extends AbstractRequest{

    private static final long serialVersionUID = -1L;

    @NotNull(message = "门店编号不能为空！")
    private Long subUnitNumId;

    @NotNull(message = "订单日期不能为空！")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date orderDate;

    @NotNull(message = "审批单号不能为空")
    private String approvalNumId;

    @NotNull(message = "物流方式不能为空！")
    private Long  logisticsType;

    @NotNull(message = "审核标识不能为空！")
    private Long autoAuditSign;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getApprovalNumId() {
        return approvalNumId;
    }

    public void setApprovalNumId(String approvalNumId) {
        this.approvalNumId = approvalNumId;
    }

    public Long getLogisticsType() {
        return logisticsType;
    }

    public void setLogisticsType(Long logisticsType) {
        this.logisticsType = logisticsType;
    }

    public Long getAutoAuditSign() {
        return autoAuditSign;
    }

    public void setAutoAuditSign(Long autoAuditSign) {
        this.autoAuditSign = autoAuditSign;
    }
}
