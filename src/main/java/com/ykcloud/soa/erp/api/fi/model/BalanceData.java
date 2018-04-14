package com.ykcloud.soa.erp.api.fi.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description:结算数据
 * @author Song
 * @Date 2018年4月7日 上午11:18:08
 */
/**
 * @Description:
 * @author Song
 * @Date 2018年4月7日 上午11:25:06
 */
public class BalanceData implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long subUnitNumId;//门店编号
	
	private Long unitNumId;//供应商编号
	
	private Date startDate;//开始日期
	
	private Date endtDate;//截止日期
	
	private Long settlementType;//经营方式（标识，1：购销，2：代销，3：联销）
	
	private Date balanceDate;//结算周期
	
	private Long createUserId;//操作人
	
	private String balanceNo;//结算单号

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public Long getUnitNumId() {
		return unitNumId;
	}

	public void setUnitNumId(Long unitNumId) {
		this.unitNumId = unitNumId;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndtDate() {
		return endtDate;
	}

	public void setEndtDate(Date endtDate) {
		this.endtDate = endtDate;
	}

	public Long getSettlementType() {
		return settlementType;
	}

	public void setSettlementType(Long settlementType) {
		this.settlementType = settlementType;
	}

	public Date getBalanceDate() {
		return balanceDate;
	}

	public void setBalanceDate(Date balanceDate) {
		this.balanceDate = balanceDate;
	}

	public Long getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(Long createUserId) {
		this.createUserId = createUserId;
	}

	public String getBalanceNo() {
		return balanceNo;
	}

	public void setBalanceNo(String balanceNo) {
		this.balanceNo = balanceNo;
	}


	
	
}
