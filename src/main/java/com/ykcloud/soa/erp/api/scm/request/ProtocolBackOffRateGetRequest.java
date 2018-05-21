package com.ykcloud.soa.erp.api.scm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @Description:根据供应商找到对应的采购协议request
 * @Author: ALi
 * @Date: 2018/4/17 9:14
 */
// 获得直通门店供应商周期 请求参数类
public class ProtocolBackOffRateGetRequest extends AbstractRequest {
	private static final long serialVersionUID = 1L;
	@NotNull(message = "门店信息不能为空！")
	private Long subUnitNumId;
	@NotNull(message = "供应商信息不能为空！")
	private Long supplyUnitNumId;
	@NotNull(message = "采购方信息不能为空！")
	private Long unitNumId;
	@NotNull(message = "商品编号不能为空！")
	private Long itemNumId;
	@NotNull(message = "业务日期不能为空！")
	private Date operatDate;

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public Long getSupplyUnitNumId() {
		return supplyUnitNumId;
	}

	public void setSupplyUnitNumId(Long supplyUnitNumId) {
		this.supplyUnitNumId = supplyUnitNumId;
	}

	public Long getUnitNumId() {
		return unitNumId;
	}

	public void setUnitNumId(Long unitNumId) {
		this.unitNumId = unitNumId;
	}

	public Long getItemNumId() {
		return itemNumId;
	}

	public void setItemNumId(Long itemNumId) {
		this.itemNumId = itemNumId;
	}

	public Date getOperatDate() {
		return operatDate;
	}

	public void setOperatDate(Date operatDate) {
		this.operatDate = operatDate;
	}

}
