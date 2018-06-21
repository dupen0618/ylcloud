package com.ykcloud.soa.erp.api.wm.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @Author: fred.zhao
 * @Description:
 * @Date: Created in 17:26:2018/6/20
 */
public class PoorInvertedExtrusionShipSellDailyCreateRequest extends AbstractUserSessionRequest {

	private static final long serialVersionUID = 2804004832708564390L;

	@NotNull(message = "商品编号不能为空!")
	private Long itemNumId;

	@NotNull(message = "供应商编号不能为空!")
	private Long supplyUnitNumId;

	@NotNull(message = "们店编号不能为空!")
	private Long subUnitNumId;

	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	@NotNull(message = "日结日期不能为空！")
	private Date orderDate;

	@NotNull(message = "物理仓库不能为空！")
	private Long physicalNumId;

	@NotNull(message = "商品产地不能为空!")
	private Long productOriginNumId;

	@NotNull(message = "倒挤差成本不能为空!")
	private Double upsideDowmAmount;

	@NotNull(message = "成本税不能为空!")
	private Double inTaxRate;

	@NotNull(message = "临时单号")
	private String transientReservedNo;

	public Double getInTaxRate() {
		return inTaxRate;
	}

	public void setInTaxRate(Double inTaxRate) {
		this.inTaxRate = inTaxRate;
	}

	public Double getUpsideDowmAmount() {
		return upsideDowmAmount;
	}

	public void setUpsideDowmAmount(Double upsideDowmAmount) {
		this.upsideDowmAmount = upsideDowmAmount;
	}

	public Long getProductOriginNumId() {
		return productOriginNumId;
	}

	public void setProductOriginNumId(Long productOriginNumId) {
		this.productOriginNumId = productOriginNumId;
	}

	public Long getPhysicalNumId() {
		return physicalNumId;
	}

	public void setPhysicalNumId(Long physicalNumId) {
		this.physicalNumId = physicalNumId;
	}

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

	public Long getItemNumId() {
		return itemNumId;
	}

	public void setItemNumId(Long itemNumId) {
		this.itemNumId = itemNumId;
	}

	public Long getSupplyUnitNumId() {
		return supplyUnitNumId;
	}

	public void setSupplyUnitNumId(Long supplyUnitNumId) {
		this.supplyUnitNumId = supplyUnitNumId;
	}

	public String getTransientReservedNo() {
		return transientReservedNo;
	}

	public void setTransientReservedNo(String transientReservedNo) {
		this.transientReservedNo = transientReservedNo;
	}
	
	
}
