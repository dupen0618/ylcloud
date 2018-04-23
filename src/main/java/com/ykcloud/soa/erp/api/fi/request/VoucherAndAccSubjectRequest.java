package com.ykcloud.soa.erp.api.fi.request;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

import javax.validation.constraints.NotNull;

/**
 * @Description: TODO
 * @Author: ALi
 * @Date: 2018/4/19 18:24
 */
public class VoucherAndAccSubjectRequest extends AbstractUserSessionRequest {
    private static final long serialVersionUID = 4627685577873375711L;

    @NotNull(message = "凭证单号不能为空！")
    private String voucherNumId;
    @NotNull(message = "原始状态不能为空！")
    private Long oldStatusNumId;
    @NotNull(message = "新状态不能为空！")
    private Long newStatusNumId;
    @NotNull(message = "单据号不能为空！")
    private String reservedNo;
    @NotNull(message = "业务类型不能为空！")
    private Long billTypeNumId;

    public String getVoucherNumId() {
        return voucherNumId;
    }

    public void setVoucherNumId(String voucherNumId) {
        this.voucherNumId = voucherNumId;
    }

    public Long getOldStatusNumId() {
        return oldStatusNumId;
    }

    public void setOldStatusNumId(Long oldStatusNumId) {
        this.oldStatusNumId = oldStatusNumId;
    }

    public Long getNewStatusNumId() {
        return newStatusNumId;
    }

    public void setNewStatusNumId(Long newStatusNumId) {
        this.newStatusNumId = newStatusNumId;
    }

    public String getReservedNo() {
        return reservedNo;
    }

    public void setReservedNo(String reservedNo) {
        this.reservedNo = reservedNo;
    }

    public Long getBillTypeNumId() {
        return billTypeNumId;
    }

    public void setBillTypeNumId(Long billTypeNumId) {
        this.billTypeNumId = billTypeNumId;
    }
}