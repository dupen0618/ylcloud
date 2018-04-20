package com.ykcloud.soa.erp.api.wm.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class DailySettlementRequest extends AbstractRequest {
	private static final long serialVersionUID = 1L;

	@NotNull(message = "门店编号不能为空")
	private Long subUnitNumId;

	@NotNull(message = "业务类型不能为空")
	private Long typeNumId;

	@NotNull(message = "成品商品不能为空")
	private Long proItemNumId;

	@NotNull(message = "商品数量不能为空")
	private Double Qty;

	@NotNull(message = "成品物理仓库不能为空")
	private Long proPhysicalNumId;

	private Long createUserId;// 创建人id

	private Long lastUpdateUserId;// 更新人id

	private Date createDtme;// 创建时间

	private Date lastUpdtme;// 更新时间

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public Long getTypeNumId() {
		return typeNumId;
	}

	public void setTypeNumId(Long typeNumId) {
		this.typeNumId = typeNumId;
	}

	public Double getQty() {
		return Qty;
	}

	public void setQty(Double qty) {
		Qty = qty;
	}

	public Long getProItemNumId() {
		return proItemNumId;
	}

	public void setProItemNumId(Long proItemNumId) {
		this.proItemNumId = proItemNumId;
	}

	public Long getProPhysicalNumId() {
		return proPhysicalNumId;
	}

	public void setProPhysicalNumId(Long proPhysicalNumId) {
		this.proPhysicalNumId = proPhysicalNumId;
	}

	public Long getCreateUserId() {
		return createUserId;
	}

	public Long getLastUpdateUserId() {
		return lastUpdateUserId;
	}

	public Date getCreateDtme() {
		return createDtme;
	}

	public Date getLastUpdtme() {
		return lastUpdtme;
	}

	public void setCreateUserId(Long createUserId) {
		this.createUserId = createUserId;
	}

	public void setLastUpdateUserId(Long lastUpdateUserId) {
		this.lastUpdateUserId = lastUpdateUserId;
	}

	public void setCreateDtme(Date createDtme) {
		this.createDtme = createDtme;
	}

	public void setLastUpdtme(Date lastUpdtme) {
		this.lastUpdtme = lastUpdtme;
	}

}
