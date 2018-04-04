package com.ykcloud.soa.erp.api.scm.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractSessionRequest;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @Author: fred.zhao
 * @Description: 财务人工审核request
 * @Date: Created in 12:00:2018/4/4
 */
public class ApprovalReturnOrderByFinanceHandAuditRequest extends AbstractSessionRequest{
    private static final long serialVersionUID = 8753873691714337347L;
    @NotNull(message = "订货门店编号不能为空！")
    private Long subUnitNumId;

    @NotNull(message = "订单日期不能为空！")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date orderDate;

    @NotNull(message = "退货审批单号不能为空")
    private String approvalNumId;

    @NotNull(message = "强制审核标识不能为空！")
    private Long forceAuditSign; //1.代表强制审核

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

    public Long getForceAuditSign() {
        return forceAuditSign;
    }

    public void setForceAuditSign(Long forceAuditSign) {
        this.forceAuditSign = forceAuditSign;
    }
}
