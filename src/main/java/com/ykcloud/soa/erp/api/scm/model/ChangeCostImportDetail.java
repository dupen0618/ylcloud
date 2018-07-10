package com.ykcloud.soa.erp.api.scm.model;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.gb.soa.omp.ccommon.api.annotation.ApiField;

/**
 * 进价调整单导入明细
 * @author tz.x
 * @date 2018年7月9日上午10:03:17
 */
public class ChangeCostImportDetail implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@NotBlank(message  = "调价单号不能为空!")
	private String reservedNo;
	
	@NotBlank(message  = "调价业务单号不能为空!")
	private String reservedId;
	
	@NotNull(message = "调整类型不能为空!")
	private Long typeNumId;
	
	@ApiField(description = "备注")
	private String remark;
	
	@NotNull(message = "签订日期不能为空!")
	private Date makeDate;
	
	@ApiField(description = "起始日期")
	private Date beginDay;
	
	@ApiField(description = "截止日期")
	private Date endDay;
	
	@NotBlank(message = "商品商家编码不能为空!")
	private String itemid;
	
	@NotNull(message = "新售价不能为空!")
	private Double price;
	
	@NotBlank(message = "门店编码不能为空!")
	private String subUnitId;

	public String getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	}

	public String getReservedId() {
		return reservedId;
	}

	public void setReservedId(String reservedId) {
		this.reservedId = reservedId;
	}

	public Long getTypeNumId() {
		return typeNumId;
	}

	public void setTypeNumId(Long typeNumId) {
		this.typeNumId = typeNumId;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getMakeDate() {
		return makeDate;
	}

	public void setMakeDate(Date makeDate) {
		this.makeDate = makeDate;
	}

	public Date getBeginDay() {
		return beginDay;
	}

	public void setBeginDay(Date beginDay) {
		this.beginDay = beginDay;
	}

	public Date getEndDay() {
		return endDay;
	}

	public void setEndDay(Date endDay) {
		this.endDay = endDay;
	}

	public String getItemid() {
		return itemid;
	}

	public void setItemid(String itemid) {
		this.itemid = itemid;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getSubUnitId() {
		return subUnitId;
	}

	public void setSubUnitId(String subUnitId) {
		this.subUnitId = subUnitId;
	}

}
