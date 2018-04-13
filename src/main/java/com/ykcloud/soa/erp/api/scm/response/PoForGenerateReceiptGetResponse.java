package com.ykcloud.soa.erp.api.scm.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.scm.model.PoDtlForGenerateReceipt;
import com.ykcloud.soa.erp.api.scm.model.PoSupDtlForGenerateReceipt;

/**
 * 为产生验收单获取采购单头、单身、供应商协同单身信息出参
 * @author tz.x
 *
 * @date 2018年3月27日下午2:13:51
 * @see
 */
public class PoForGenerateReceiptGetResponse extends MessagePack {
	
	private static final long serialVersionUID = 8560296643393530581L;
	
	/**
	 * 采购途径 1国内 2国际
	 */
	private Long purchaseTypeNumId;
	
	/**
	 * 供应商确认生产日期
	 */
	private String supProduceDate;

	/**
	 * 供应商编号
	 */
	private Long supplyUnitNumId;
	
	/**
	 * 收货逻辑仓
	 */
	private Long storageNumId;
	
	/**
	 * 收货物理仓库
	 */
	private Long physicalNumId;
	
	/**
	 * 存储条件 1：常温，2:冷藏，3:冷冻
	 */
	private Long storeType;
	
	/**
	 * 结算方式：购销，2：代销，3：联销
	 */
	private Long settlementType;
	
	/**
	 * 送货方式
	 */
	private Long logisticsType;
	
	/**
	 * 促销档期
	 */
	private String promotionGrade;
	
	/**
	 * 采购明细列表
	 */
	private List<PoDtlForGenerateReceipt> poDtls;
	
	/**
	 * 供应商协同明细列表
	 */
	private List<PoSupDtlForGenerateReceipt> poSupDtls;

	public Long getPurchaseTypeNumId() {
		return purchaseTypeNumId;
	}

	public void setPurchaseTypeNumId(Long purchaseTypeNumId) {
		this.purchaseTypeNumId = purchaseTypeNumId;
	}

	public String getSupProduceDate() {
		return supProduceDate;
	}

	public void setSupProduceDate(String supProduceDate) {
		this.supProduceDate = supProduceDate;
	}

	public Long getSupplyUnitNumId() {
		return supplyUnitNumId;
	}

	public void setSupplyUnitNumId(Long supplyUnitNumId) {
		this.supplyUnitNumId = supplyUnitNumId;
	}

	public Long getStorageNumId() {
		return storageNumId;
	}

	public void setStorageNumId(Long storageNumId) {
		this.storageNumId = storageNumId;
	}

	public Long getPhysicalNumId() {
		return physicalNumId;
	}

	public void setPhysicalNumId(Long physicalNumId) {
		this.physicalNumId = physicalNumId;
	}

	public Long getStoreType() {
		return storeType;
	}

	public void setStoreType(Long storeType) {
		this.storeType = storeType;
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

	public String getPromotionGrade() {
		return promotionGrade;
	}

	public void setPromotionGrade(String promotionGrade) {
		this.promotionGrade = promotionGrade;
	}

	public List<PoDtlForGenerateReceipt> getPoDtls() {
		return poDtls;
	}

	public void setPoDtls(List<PoDtlForGenerateReceipt> poDtls) {
		this.poDtls = poDtls;
	}

	public List<PoSupDtlForGenerateReceipt> getPoSupDtls() {
		return poSupDtls;
	}

	public void setPoSupDtls(List<PoSupDtlForGenerateReceipt> poSupDtls) {
		this.poSupDtls = poSupDtls;
	}

}
