package com.ykcloud.soa.erp.api.scm.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractSessionRequest;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @Author: fred.zhao
 * @Description: 退货审批单退大仓
 * @Date: Created in 16:46:2018/4/2
 */
public class DistributionApprovalReturnOrderByBuyerAuditRequest extends AbstractSessionRequest{
    private static final long serialVersionUID = 770835170753774878L;

    @NotNull(message = "门店编号不能为空！")
    private Long subUnitNumId;

    @NotNull(message = "订货日期不能为空！")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date orderDate;

    @NotNull(message = "订货审批单编号不能为空！")
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
