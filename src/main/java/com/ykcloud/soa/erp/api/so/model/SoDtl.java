package com.ykcloud.soa.erp.api.so.model;

import java.io.Serializable;
import java.util.Date;

public class SoDtl implements Serializable {
	
		/**
		 * 
		 */
		private static final long serialVersionUID = 1059899986268951129L;

		private String series;
		
		//订单ID
		private String soNumId;
		
		private Long tenantNumId;
		
		//商户ID
		private String subUnitNumId;
		
		private Long ordSubUnitNumId;
		
		//订单日期
		private Date orderDate;
		
		private String promotionGrade;
		
		private Long itemNumId;
		
		private Long divNumId;
		
		private String barcode;
		
		private String itemName;
		
		private String itemid;
		
		private Long storeType;
		
		private Long productOriginNumId;
		
		private Double conversionQty;
		
		private Long conversionUnitNumId;
		
		private String conversionStyleDesc;
		
		private Long pmtMaterial;
		
		private Double qty;
		
		private Double tradePrice;
		
		private Double cancelQty;
		
		private Double totalAmout;
		
		private Long pmtSign;
		
		private Long settlementType;
		
		private Long logisticsType;
		
		private String receiptLine;
		
		private String receiptNo;
		
		private String tmlNumId;
		
		private String tmlLine;
		
		private Long locPtyNumId;
		
		private Double poPrice;
		
		private String supProductDate;
		
		private Double taxRate;
		
		private Long supplyUnitNumId;
		
		private Double lockQty;
		
		private Double packingQty;
		
		private Double distributionQty;
		
		private Double shipQty;
		
		private Long createUserId;
		
		private Long lastUpdateUserId;
		
		private String cancelsign;
		
		private Long carrySign;
		
		private Long dataSign;
		
		private Date createDtme;
		
		private Date lastUpdtme;

		public String getSeries() {
			return series;
		}

		public void setSeries(String series) {
			this.series = series;
		}

		public String getSoNumId() {
			return soNumId;
		}

		public void setSoNumId(String soNumId) {
			this.soNumId = soNumId;
		}

		public Long getTenantNumId() {
			return tenantNumId;
		}

		public void setTenantNumId(Long tenantNumId) {
			this.tenantNumId = tenantNumId;
		}

		public String getSubUnitNumId() {
			return subUnitNumId;
		}

		public void setSubUnitNumId(String subUnitNumId) {
			this.subUnitNumId = subUnitNumId;
		}

		public Long getOrdSubUnitNumId() {
			return ordSubUnitNumId;
		}

		public void setOrdSubUnitNumId(Long ordSubUnitNumId) {
			this.ordSubUnitNumId = ordSubUnitNumId;
		}

		public Date getOrderDate() {
			return orderDate;
		}

		public void setOrderDate(Date orderDate) {
			this.orderDate = orderDate;
		}

		public String getPromotionGrade() {
			return promotionGrade;
		}

		public void setPromotionGrade(String promotionGrade) {
			this.promotionGrade = promotionGrade;
		}

		public Long getItemNumId() {
			return itemNumId;
		}

		public void setItemNumId(Long itemNumId) {
			this.itemNumId = itemNumId;
		}

		public Long getDivNumId() {
			return divNumId;
		}

		public void setDivNumId(Long divNumId) {
			this.divNumId = divNumId;
		}

		public String getBarcode() {
			return barcode;
		}

		public void setBarcode(String barcode) {
			this.barcode = barcode;
		}

		public String getItemName() {
			return itemName;
		}

		public void setItemName(String itemName) {
			this.itemName = itemName;
		}

		public Long getStoreType() {
			return storeType;
		}

		public void setStoreType(Long storeType) {
			this.storeType = storeType;
		}

		public Long getProductOriginNumId() {
			return productOriginNumId;
		}

		public void setProductOriginNumId(Long productOriginNumId) {
			this.productOriginNumId = productOriginNumId;
		}

		public Double getConversionQty() {
			return conversionQty;
		}

		public void setConversionQty(Double conversionQty) {
			this.conversionQty = conversionQty;
		}

		public Long getConversionUnitNumId() {
			return conversionUnitNumId;
		}

		public void setConversionUnitNumId(Long conversionUnitNumId) {
			this.conversionUnitNumId = conversionUnitNumId;
		}

		public String getConversionStyleDesc() {
			return conversionStyleDesc;
		}

		public void setConversionStyleDesc(String conversionStyleDesc) {
			this.conversionStyleDesc = conversionStyleDesc;
		}

		public Long getPmtMaterial() {
			return pmtMaterial;
		}

		public void setPmtMaterial(Long pmtMaterial) {
			this.pmtMaterial = pmtMaterial;
		}

		public Double getQty() {
			return qty;
		}

		public void setQty(Double qty) {
			this.qty = qty;
		}

		public Double getTradePrice() {
			return tradePrice;
		}

		public void setTradePrice(Double tradePrice) {
			this.tradePrice = tradePrice;
		}

		public Double getCancelQty() {
			return cancelQty;
		}

		public void setCancelQty(Double cancelQty) {
			this.cancelQty = cancelQty;
		}

		public Double getTotalAmout() {
			return totalAmout;
		}

		public void setTotalAmout(Double totalAmout) {
			this.totalAmout = totalAmout;
		}

		public Long getPmtSign() {
			return pmtSign;
		}

		public void setPmtSign(Long pmtSign) {
			this.pmtSign = pmtSign;
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


		public String getReceiptLine() {
			return receiptLine;
		}

		public void setReceiptLine(String receiptLine) {
			this.receiptLine = receiptLine;
		}

		public String getReceiptNo() {
			return receiptNo;
		}

		public void setReceiptNo(String receiptNo) {
			this.receiptNo = receiptNo;
		}


		public String getTmlNumId() {
			return tmlNumId;
		}

		public void setTmlNumId(String tmlNumId) {
			this.tmlNumId = tmlNumId;
		}

		public String getTmlLine() {
			return tmlLine;
		}

		public void setTmlLine(String tmlLine) {
			this.tmlLine = tmlLine;
		}

		public Long getLocPtyNumId() {
			return locPtyNumId;
		}

		public void setLocPtyNumId(Long locPtyNumId) {
			this.locPtyNumId = locPtyNumId;
		}

		public Double getPoPrice() {
			return poPrice;
		}

		public void setPoPrice(Double poPrice) {
			this.poPrice = poPrice;
		}

		public String getSupProductDate() {
			return supProductDate;
		}

		public void setSupProductDate(String supProductDate) {
			this.supProductDate = supProductDate;
		}

		public Double getTaxRate() {
			return taxRate;
		}

		public void setTaxRate(Double taxRate) {
			this.taxRate = taxRate;
		}

		public Long getSupplyUnitNumId() {
			return supplyUnitNumId;
		}

		public void setSupplyUnitNumId(Long supplyUnitNumId) {
			this.supplyUnitNumId = supplyUnitNumId;
		}

		public Double getLockQty() {
			return lockQty;
		}

		public void setLockQty(Double lockQty) {
			this.lockQty = lockQty;
		}

		public Double getPackingQty() {
			return packingQty;
		}

		public void setPackingQty(Double packingQty) {
			this.packingQty = packingQty;
		}

		public Double getDistributionQty() {
			return distributionQty;
		}

		public void setDistributionQty(Double distributionQty) {
			this.distributionQty = distributionQty;
		}

		public Double getShipQty() {
			return shipQty;
		}

		public void setShipQty(Double shipQty) {
			this.shipQty = shipQty;
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

		public Long getCarrySign() {
			return carrySign;
		}

		public void setCarrySign(Long carrySign) {
			this.carrySign = carrySign;
		}

		public Long getDataSign() {
			return dataSign;
		}

		public void setDataSign(Long dataSign) {
			this.dataSign = dataSign;
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

		public String getItemid() {
			return itemid;
		}

		public void setItemid(String itemid) {
			this.itemid = itemid;
		}

		
		
	
}
