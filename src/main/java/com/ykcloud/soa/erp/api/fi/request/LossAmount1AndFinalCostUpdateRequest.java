package com.ykcloud.soa.erp.api.fi.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class LossAmount1AndFinalCostUpdateRequest extends AbstractRequest {
	private static final long serialVersionUID = 1L;

	@NotNull(message = "门店编号不能为空！")
	private Long subUnitNumId;

	@NotNull(message = "商品编号不能为空！")
	private Long itemNumId;

	@NotNull(message = "物理仓库不能为空！")
	private Long physicalNumId;

	@NotNull(message = "损耗金额不能为空！")
	private Double losscost;

	@NotNull(message = "损耗类型不能为空！")
	private String lossType;

	@NotNull(message = "税额不能为空！")
	private Double taxAmount;

	@NotNull(message = "入账日期不能为空！")
	private Date recDate;

	public static interface lossTypeOption {
		/**
		 * 报损类型
		 */
		public String LOSS = "0";
		/**
		 * 报溢类型
		 */
		public String OVERFLOW = "1";
	}

	public Double getLosscost() {
		return losscost;
	}

	public void setLosscost(Double losscost) {
		this.losscost = losscost;
	}

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public Long getItemNumId() {
		return itemNumId;
	}

	public void setItemNumId(Long itemNumId) {
		this.itemNumId = itemNumId;
	}

	public Long getPhysicalNumId() {
		return physicalNumId;
	}

	public void setPhysicalNumId(Long physicalNumId) {
		this.physicalNumId = physicalNumId;
	}

	public String getLossType() {
		return lossType;
	}

	public void setLossType(String lossType) {
		this.lossType = lossType;
	}

	public Double getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(Double taxAmount) {
		this.taxAmount = taxAmount;
	}

	public Date getRecDate() {
		return recDate;
	}

	public void setRecDate(Date recDate) {
		this.recDate = recDate;
	}

}
