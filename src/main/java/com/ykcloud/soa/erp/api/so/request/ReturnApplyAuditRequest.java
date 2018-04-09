package com.ykcloud.soa.erp.api.so.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractSessionRequest;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @Author: fred.zhao
 * @Description: 退货申请主管审核
 * @Date: Created in 11:09:2018/4/7
 */
public class ReturnApplyAuditRequest  extends AbstractSessionRequest{
    private static final long serialVersionUID = 4722285466425907379L;

    @NotNull(message = "订货门店编号不能为空！")
    private Long subUnitNumId;

    @NotNull(message = "订单日期不能为空！")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date orderDate;

    @NotNull(message = "审批单号不能为空")
    private String applyNumId;


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


    public String getApplyNumId() {
        return applyNumId;
    }

    public void setApplyNumId(String applyNumId) {
        this.applyNumId = applyNumId;
    }

    public Long getAutoAuditSign() {
        return autoAuditSign;
    }

    public void setAutoAuditSign(Long autoAuditSign) {
        this.autoAuditSign = autoAuditSign;
    }
}
