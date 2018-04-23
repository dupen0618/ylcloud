package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

import javax.validation.constraints.NotNull;

/**
 * Created by yiako on 2018/3/31
 */
public class PhysicsWarehousepackingGetRequest extends AbstractRequest {

	private static final long serialVersionUID = 1L;

	@NotNull(message = "出库单号不能为空！")
	private String reservedNo;// 出库单号

	@NotNull(message = "业务类型编号不能为空!")
	private String billTypeNumId;// 业务类型编号

	private Long typeNumId;// 单据类型

	@NotNull(message = "入账类型不能为空！")
	String accountName;

	@NotNull(message = "门店编号不能为空!")
	private Long subUnitNumId;

	@NotNull(message = "操作人不能为空!")
	private Long userNumId;

	private Long BalanceFunctionId;



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

	public Long getUserNumId() {
		return userNumId;
	}

	public void setUserNumId(Long userNumId) {
		this.userNumId = userNumId;
	}

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public Long getBalanceFunctionId() {
		return BalanceFunctionId;
	}

	public void setBalanceFunctionId(Long balanceFunctionId) {
		BalanceFunctionId = balanceFunctionId;
	}
}
