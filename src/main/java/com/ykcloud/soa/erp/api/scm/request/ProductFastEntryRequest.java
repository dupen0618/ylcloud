package com.ykcloud.soa.erp.api.scm.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

public class ProductFastEntryRequest extends AbstractUserSessionRequest {

	/**
	 * 快速录入
	 */
	private static final long serialVersionUID = 1L;
	
	@NotNull(message="门店编号不能为空")
	private Long subUnitNumId;  //门店
	
	@NotNull(message="申请编号不能为空")
	private String applyNumId;  //申请编号
	
	@NotNull(message="日期不能为空")
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date orderDate;     //日期
	
	private Long supplyUnitNumId; //供应商编号
	
	private Long divNumId;   //部类编号
	
	private Long logisticsType; //物流方式
	
	private String reservedNoTemp; //促销档期
	
    private Long pty2NumId;      //中类
    
    private Long pty3NumId;      //小类

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public String getApplyNumId() {
		return applyNumId;
	}

	public void setApplyNumId(String applyNumId) {
		this.applyNumId = applyNumId;
	}

	public Long getSupplyUnitNumId() {
		return supplyUnitNumId;
	}

	public void setSupplyUnitNumId(Long supplyUnitNumId) {
		this.supplyUnitNumId = supplyUnitNumId;
	}

	public Long getDivNumId() {
		return divNumId;
	}

	public void setDivNumId(Long divNumId) {
		this.divNumId = divNumId;
	}

	public Long getLogisticsType() {
		return logisticsType;
	}

	public void setLogisticsType(Long logisticsType) {
		this.logisticsType = logisticsType;
	}

	public String getReservedNoTemp() {
		return reservedNoTemp;
	}

	public void setReservedNoTemp(String reservedNoTemp) {
		this.reservedNoTemp = reservedNoTemp;
	}

	public Long getPty2NumId() {
		return pty2NumId;
	}

	public void setPty2NumId(Long pty2NumId) {
		this.pty2NumId = pty2NumId;
	}

	public Long getPty3NumId() {
		return pty3NumId;
	}

	public void setPty3NumId(Long pty3NumId) {
		this.pty3NumId = pty3NumId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
    
    

}
