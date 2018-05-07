package com.ykcloud.soa.erp.api.scm.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by yiako on 2018/3/15
 */
public class HandReplenishProductGetRequest extends AbstractRequest {
	private static final long serialVersionUID = 1L;

	@NotNull(message = "门店编号不能为空")
	private Long subUnitNumId;

	private Long supplyUnitNumId;// 供应商编号

	private Long settlementType;// 结算方式1：购销，2：代销，3：联销,用于3.21.3 供应商自下联营订单时控制

	private Long logisticsType;// 物流方式

	private String barcode;// 商品编号、商品条码二选一

	private Long storageNumId;// 指定收货仓

	private Long storeType;// 指定存储方式

	private String promotionGrade;// 指定促销档期

	private Long purchaseTypeNumId;// 国内国外

	private Long divNumId;// 部类

	@Range(min = 1, max = 4)
	@NotNull(message = "补货类别不能为空")
	private Long typeNumId = 1L;

	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	@NotNull(message = "日期不能为空")
	private Date orderDate;// 日期，格式：yyyy-mm-dd

	private Long supplyContractCheckSign;// 1:要检查合同0：不检查合同

	@Range(min = 0, max = 1)
	private Long openQtyCacheSign; // 否，默认为1 在途数量是否用缓存表的数据，1：先查询缓存表，不存在先查询并写到缓存表，供下次使用，0：不用缓存表，查询后写到缓存表，供下次使用

	private String action;// 补货：repment 自动补货 auto_repment

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

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

	public Long getSettlementType() {
		return settlementType;
	}

	public void setSettlementType(Long settlementType) {
		this.settlementType = settlementType;
	}

	public Long getLogisticsType() {
		return logisticsType;
	}

	public void setLogisticsType(Long logisticsType) {
		this.logisticsType = logisticsType;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Long getSupplyContractCheckSign() {
		return supplyContractCheckSign;
	}

	public void setSupplyContractCheckSign(Long supplyContractCheckSign) {
		this.supplyContractCheckSign = supplyContractCheckSign;
	}

	public Long getOpenQtyCacheSign() {
		return openQtyCacheSign;
	}

	public void setOpenQtyCacheSign(Long openQtyCacheSign) {
		this.openQtyCacheSign = openQtyCacheSign;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public Long getStorageNumId() {
		return storageNumId;
	}

	public void setStorageNumId(Long storageNumId) {
		this.storageNumId = storageNumId;
	}

	public Long getStoreType() {
		return storeType;
	}

	public void setStoreType(Long storeType) {
		this.storeType = storeType;
	}

	public String getPromotionGrade() {
		return promotionGrade;
	}

	public void setPromotionGrade(String promotionGrade) {
		this.promotionGrade = promotionGrade;
	}

	public Long getTypeNumId() {
		return typeNumId;
	}

	public void setTypeNumId(Long typeNumId) {
		this.typeNumId = typeNumId;
	}

	public Long getPurchaseTypeNumId() {
		return purchaseTypeNumId;
	}

	public void setPurchaseTypeNumId(Long purchaseTypeNumId) {
		this.purchaseTypeNumId = purchaseTypeNumId;
	}

	public Long getDivNumId() {
		return divNumId;
	}

	public void setDivNumId(Long divNumId) {
		this.divNumId = divNumId;
	}

}
