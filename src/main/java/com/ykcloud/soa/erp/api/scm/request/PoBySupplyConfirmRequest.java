package com.ykcloud.soa.erp.api.scm.request;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;
import com.ykcloud.soa.erp.api.scm.model.SupplyConfirmDtl;

/**
 * 供应商预约送货服务入参
 * @author tz.x
 *
 * @date 2018年3月24日上午11:30:02
 */
public class PoBySupplyConfirmRequest extends AbstractRequest {

	private static final long serialVersionUID = 2626180051596876648L;
	
	/**
	 * 门店编号
	 */
	@NotNull(message = "门店编号不能为空！")
	private Long subUnitNumId;
	
	/**
	 * 订单日期 格式：yyyy-mm-dd
	 */
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	@NotNull(message = "订单日期不能为空！")
	private Date orderDate;
	
	/**
	 * 采购单号
	 */
	@NotNull(message = "采购单号不能为空！")
	private String poNumId;
	
	/**
	 * 确认日期
	 */
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	@NotNull(message = "确认日期不能为空！")
	private Date confirmDate;
	
	/**
	 * 供应商确认明细列表
	 */
	@NotEmpty(message = "供应商确认明细列表不能为空！")
	private List<SupplyConfirmDtl> SupplyConfimDtls;

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

	public String getPoNumId() {
		return poNumId;
	}

	public void setPoNumId(String poNumId) {
		this.poNumId = poNumId;
	}

	public Date getConfirmDate() {
		return confirmDate;
	}

	public void setConfirmDate(Date confirmDate) {
		this.confirmDate = confirmDate;
	}

	public List<SupplyConfirmDtl> getSupplyConfimDtls() {
		return SupplyConfimDtls;
	}

	public void setSupplyConfimDtls(List<SupplyConfirmDtl> supplyConfimDtls) {
		SupplyConfimDtls = supplyConfimDtls;
	}
	

}
