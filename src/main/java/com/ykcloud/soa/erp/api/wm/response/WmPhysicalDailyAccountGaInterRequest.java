package com.ykcloud.soa.erp.api.wm.response;

import javax.validation.constraints.NotNull;

public class WmPhysicalDailyAccountGaInterRequest {

    @NotNull(message = "订单编号不能为空！")
    private String reservedNo;
    
    @NotNull(message = "业务类型编号不能为空！")
    private Long billTypeNum;
   
    @NotNull(message = "单据类型不能为空！")
    private Long typeNum;
    
    @NotNull(message = "入账类型不能为空！")
    String accountName;

	public String getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	}

	public Long getBillTypeNum() {
		return billTypeNum;
	}

	public void setBillTypeNum(Long billTypeNum) {
		this.billTypeNum = billTypeNum;
	}

	public Long getTypeNum() {
		return typeNum;
	}

	public void setTypeNum(Long typeNum) {
		this.typeNum = typeNum;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

    
}
