package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

import javax.validation.constraints.NotNull;

/**
 * Created by yiako on 2018/4/2
 */
public class WmProcessAccountRequest extends AbstractUserSessionRequest {

	private static final long serialVersionUID = 1L;

	@NotNull(message = "订单编号不能为空！")
	private String reservedNo;
	
	@NotNull(message = "业务类型编号不能为空！")
	private String billTypeNumId;
	
	@NotNull(message = "门店编号不能为空！")
	private Long subUnitNumId;

	@NotNull(message = "单据类型编号不能为空！")
	private Long typeNumId;

	@NotNull(message = "入账类型不能为空！")
	String accountName;

	private Long balanceFunctionId;

	public String getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	}

	public String getBillTypeNumId() {
		return billTypeNumId;
	}

	public void setBillTypeNumId(String billTypeNumId) {
		this.billTypeNumId = billTypeNumId;
	}

	public Long getTypeNumId() {
		return typeNumId;
	}

	public void setTypeNumId(Long typeNumId) {
		this.typeNumId = typeNumId;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUntiNumId) {
		this.subUnitNumId = subUntiNumId;
	}

	public Long getBalanceFunctionId() {
		return balanceFunctionId;
	}

	public void setBalanceFunctionId(Long balanceFunctionId) {
		this.balanceFunctionId = balanceFunctionId;
	}
}
