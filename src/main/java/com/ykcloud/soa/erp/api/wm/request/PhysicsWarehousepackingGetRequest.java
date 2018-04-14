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
	private Long billTypeNumId;// 业务类型编号

	@NotNull(message = "单据类型不能为空!")
	private Long typeNumId;// 单据类型

	@NotNull(message = "入账类型不能为空！")
	String accountName;

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
}
