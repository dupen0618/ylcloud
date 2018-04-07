package com.ykcloud.soa.erp.api.scm.request;

import java.util.Date;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Range;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.annotation.ApiField;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class InTransitDepositByBillIdRequest extends AbstractRequest {
	private static final long serialVersionUID = 5118059696054727934L;

	@NotNull(message = "门店编号不能为空！")
	private Long subUnitNumId;

	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	@NotNull(message = "订单日期不能为空！")
	private Date orderDate;

	@NotNull(message = "单据编号不能为空！")
	private String billId;

	@NotNull(message = "在途类别不能为空！")
	@ApiField(description = "100:补货申请单 200:订货审批单 300:采购单 4XX:执行订单so(401：直通分拨到店（总仓），402：直通分拨到仓，403：配送到店，404：配送分拨到仓，405：配送分拨到店，409：直送退供应商，410：直通退供应商 411：配送退总仓，415：直通分拨到店（分仓")
	private Long billType;

	@NotNull(message = "在途类别不能为空！")
	@ApiField(description = "1:入账 2:销账")
	@Range(min = 1L, max = 2L, message = "1:入账 2:销账")
	private Long depositSign;

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

	public String getBillId() {
		return billId;
	}

	public void setBillId(String billId) {
		this.billId = billId;
	}

	public Long getBillType() {
		return billType;
	}

	public void setBillType(Long billType) {
		this.billType = billType;
	}

	public Long getDepositSign() {
		return depositSign;
	}

	public void setDepositSign(Long depositSign) {
		this.depositSign = depositSign;
	}

}
