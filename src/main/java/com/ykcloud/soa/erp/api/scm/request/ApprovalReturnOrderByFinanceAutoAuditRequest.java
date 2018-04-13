package com.ykcloud.soa.erp.api.scm.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;
import com.gb.soa.omp.ccommon.api.request.AbstractSessionRequest;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @Author: fred.zhao
 * @Description: 退供应商财务自动审核
 * @Date: Created in 17:16:2018/4/3
 */
public class ApprovalReturnOrderByFinanceAutoAuditRequest extends AbstractUserSessionRequest {
    private static final long serialVersionUID = -345206227061616109L;
    @NotNull(message = "订货门店编号不能为空！")
    private Long subUnitNumId;

    @NotNull(message = "订单日期不能为空！")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date orderDate;

    @NotNull(message = "退货审批单号不能为空")
    private String approvalNumId;

    @NotNull(message = "审核标识不能为空！")
    private Long autoAuditSign;

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

    public Long getAutoAuditSign() {
        return autoAuditSign;
    }

    public void setAutoAuditSign(Long autoAuditSign) {
        this.autoAuditSign = autoAuditSign;
    }
}
