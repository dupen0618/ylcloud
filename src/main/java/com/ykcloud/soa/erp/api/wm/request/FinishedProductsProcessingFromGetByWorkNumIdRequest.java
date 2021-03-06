package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

import javax.validation.constraints.NotNull;

/**
 * Created by yiako on 2018/3/28
 */
public class FinishedProductsProcessingFromGetByWorkNumIdRequest extends AbstractRequest {

	private static final long serialVersionUID = 1L;
	@NotNull(message = "订单编号不能为空！")
    String reservedNo;
    @NotNull(message = "业务类型编号不能为空！")
    Long typeNumId;
    @NotNull(message = "单据类型不能为空！")
    String billTypeNumId;
    @NotNull(message = "入账类型不能为空！")
    String accountName;

    public String getReservedNo() {
        return reservedNo;
    }

    public void setReservedNo(String reservedNo) {
        this.reservedNo = reservedNo;
    }

    public Long getTypeNumId() {
        return typeNumId;
    }

    public void setTypeNumId(Long typeNumId) {
        this.typeNumId = typeNumId;
    }

    public String getBillTypeNumId() {
        return billTypeNumId;
    }

    public void setBillTypeNumId(String billTypeNumId) {
        this.billTypeNumId = billTypeNumId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
}
