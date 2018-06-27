package com.ykcloud.soa.erp.api.scm.model;

import java.io.Serializable;
import java.util.Date;

/***
 * DM协议实体
 * @author bi.cai
 * 201-02-07
 */
public class SupplyChainDMModel implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long series;//行号
	
	private Long reservedNo;//采购协议单号
	    
    private String reservedId;//采购业务单号
    
    private Long reservedNoParent;//DM方案编号
    
  	private Long typeNumId;//调整类型
  	
  	private String remark;//备注
  	
  	private Date makedate;//签订日期
  	
  	private Date beginDayPrice;//售价起始日期
  	
  	private Date endDayPrice;//售价截止日期
  	
	private Date beginDayCost;//进价起始日期
  	
  	private Date endDayCost;//进价截止日期
  	
	private Date createDtme;//创建时间
	
	private Date lastUpdtme;//最后更新时间
	
	private Long createUserId;//用户
	
	private Long lastUpdateUserId;//更新用户
	
	private String cancelsign;//删除
	
	private Long tenantNumId;//租户
	
	private Long dataSign;//正式或测试标识
	
	

	public Long getSeries() {
		return series;
	}

	public void setSeries(Long series) {
		this.series = series;
	}

	public Long getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(Long reservedNo) {
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

	public Date getMakedate() {
		return makedate;
	}

	public void setMakedate(Date makedate) {
		this.makedate = makedate;
	}

	public Date getBeginDayPrice() {
		return beginDayPrice;
	}

	public void setBeginDayPrice(Date beginDayPrice) {
		this.beginDayPrice = beginDayPrice;
	}

	public Date getEndDayPrice() {
		return endDayPrice;
	}

	public void setEndDayPrice(Date endDayPrice) {
		this.endDayPrice = endDayPrice;
	}

	public Date getBeginDayCost() {
		return beginDayCost;
	}

	public void setBeginDayCost(Date beginDayCost) {
		this.beginDayCost = beginDayCost;
	}

	public Date getEndDayCost() {
		return endDayCost;
	}

	public void setEndDayCost(Date endDayCost) {
		this.endDayCost = endDayCost;
	}

	public Date getCreateDtme() {
		return createDtme;
	}

	public void setCreateDtme(Date createDtme) {
		this.createDtme = createDtme;
	}

	public Date getLastUpdtme() {
		return lastUpdtme;
	}

	public void setLastUpdtme(Date lastUpdtme) {
		this.lastUpdtme = lastUpdtme;
	}

	public Long getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(Long createUserId) {
		this.createUserId = createUserId;
	}

	public Long getLastUpdateUserId() {
		return lastUpdateUserId;
	}

	public void setLastUpdateUserId(Long lastUpdateUserId) {
		this.lastUpdateUserId = lastUpdateUserId;
	}

	public String getCancelsign() {
		return cancelsign;
	}

	public void setCancelsign(String cancelsign) {
		this.cancelsign = cancelsign;
	}

	public Long getTenantNumId() {
		return tenantNumId;
	}

	public void setTenantNumId(Long tenantNumId) {
		this.tenantNumId = tenantNumId;
	}

	public Long getDataSign() {
		return dataSign;
	}

	public void setDataSign(Long dataSign) {
		this.dataSign = dataSign;
	}

	public Long getReservedNoParent() {
		return reservedNoParent;
	}

	public void setReservedNoParent(Long reservedNoParent) {
		this.reservedNoParent = reservedNoParent;
	}
}
