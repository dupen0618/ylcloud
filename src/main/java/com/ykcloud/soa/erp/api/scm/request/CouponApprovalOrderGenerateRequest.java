package com.ykcloud.soa.erp.api.scm.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author zhaokang
 * 团购补货申请单生成订货审批单入参类
 */
public class CouponApprovalOrderGenerateRequest extends AbstractRequest{
    private static final long serialVersionUID = -1945009738807635650L;

    @NotNull(message = "门店编号不能为空")
    private Long subUnitNumId;

    @NotNull
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date orderDate;//日期，格式：yyyy-mm-dd

    @NotNull
    private Long onlyFdc;//1:只集生鲜商品(16:00集生鲜商品用,0:不限定 1：限定生鲜)

    @NotNull(message = "补货申请单号不能为空")
    private String applyNumId;


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

    public Long getOnlyFdc() {
        return onlyFdc;
    }

    public void setOnlyFdc(Long onlyFdc) {
        this.onlyFdc = onlyFdc;
    }

    public String getApplyNumId() {
        return applyNumId;
    }

    public void setApplyNumId(String applyNumId) {
        this.applyNumId = applyNumId;
    }
}
