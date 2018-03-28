package com.ykcloud.soa.erp.api.so.model;

import java.util.Date;

public class SoDtl {

		//订单行号
		private Long series;
		//订单ID
		private Long soNumId;
		
		//商户ID
		private Long subUnitNumId;
		
		//商品名称
		private String subUnitName;
		
		//商品名称
		private String itemName;
		
		//商品需求数量
		private Long qty;
		
		//锁箱数量
		private Long lockQty;
		
		//装箱数量(已复核数)
		private Long packingQty;
		
		//逻辑仓Id
		private Long storageNumId;
		
		//赠品标识符,1为赠品
		private Long pmtSign;
		
		//租户ID
		private Long tenantNumId;
		
		//数据类型
		private Long dataSign;
		
		//订单日期
		private Date orderDate;

		public Long getSeries() {
			return series;
		}


		public void setSeries(Long series) {
			this.series = series;
		}


		public Long getSoNumId() {
			return soNumId;
		}


		public void setSoNumId(Long soNumId) {
			this.soNumId = soNumId;
		}

		public Long getSubUnitNumId() {
			return subUnitNumId;
		}

		public void setSubUnitNumId(Long subUnitNumId) {
			this.subUnitNumId = subUnitNumId;
		}
		
		public String getSubUnitName() {
			return subUnitName;
		}


		public void setSubUnitName(String subUnitName) {
			this.subUnitName = subUnitName;
		}


		public String getItemName() {
			return itemName;
		}

		public void setItemName(String itemName) {
			this.itemName = itemName;
		}

		public Long getQty() {
			return qty;
		}

		public void setQty(Long qty) {
			this.qty = qty;
		}

		public Long getLockQty() {
			return lockQty;
		}

		public void setLockQty(Long lockQty) {
			this.lockQty = lockQty;
		}

		public Long getPackingQty() {
			return packingQty;
		}

		public void setPackingQty(Long packingQty) {
			this.packingQty = packingQty;
		}


		public Long getStorageNumId() {
			return storageNumId;
		}


		public void setStorageNumId(Long storageNumId) {
			this.storageNumId = storageNumId;
		}


		public Long getPmtSign() {
			return pmtSign;
		}


		public void setPmtSign(Long pmtSign) {
			this.pmtSign = pmtSign;
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


		public Date getOrderDate() {
			return orderDate;
		}


		public void setOrderDate(Date orderDate) {
			this.orderDate = orderDate;
		}
		
		
	
}
