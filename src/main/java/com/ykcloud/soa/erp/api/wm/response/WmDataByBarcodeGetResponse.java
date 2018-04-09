package com.ykcloud.soa.erp.api.wm.response;

import java.util.Date;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

public class WmDataByBarcodeGetResponse extends MessagePack {
	
		
		//订单ID
		private String soNumId;
		
		private String custSubUnitName;
		
		private Long sowNumId;
		
		//商品ID
		private Long itemNumId;
		
		//商品名称
		private String itemName;
		
		//商品条码数量
		private Double conversionQty;
		
		//托盘码
		private String containerSerlno;
		
		//托盘纸质编号
		private String containerLabserlno;
		
		private Double containerProductPackingQty;
		
		private Double containerPackingQty;
		
		private Double soLockQty;
		
		private Double soPackIngQty;
		
		private Double soProductLockQty;
		
		private Double soProductPackingQty;

		

		public String getSoNumId() {
			return soNumId;
		}

		public void setSoNumId(String soNumId) {
			this.soNumId = soNumId;
		}

		public String getCustSubUnitName() {
			return custSubUnitName;
		}

		public void setCustSubUnitName(String custSubUnitName) {
			this.custSubUnitName = custSubUnitName;
		}

		public Long getSowNumId() {
			return sowNumId;
		}

		public void setSowNumId(Long sowNumId) {
			this.sowNumId = sowNumId;
		}

		public Long getItemNumId() {
			return itemNumId;
		}

		public void setItemNumId(Long itemNumId) {
			this.itemNumId = itemNumId;
		}

		public String getItemName() {
			return itemName;
		}

		public void setItemName(String itemName) {
			this.itemName = itemName;
		}

		public Double getConversionQty() {
			return conversionQty;
		}

		public void setConversionQty(Double conversionQty) {
			this.conversionQty = conversionQty;
		}
		
		public String getContainerSerlno() {
			return containerSerlno;
		}

		public void setContainerSerlno(String containerSerlno) {
			this.containerSerlno = containerSerlno;
		}

		public String getContainerLabserlno() {
			return containerLabserlno;
		}

		public void setContainerLabserlno(String containerLabserlno) {
			this.containerLabserlno = containerLabserlno;
		}

		public Double getContainerProductPackingQty() {
			return containerProductPackingQty;
		}

		public void setContainerProductPackingQty(Double containerProductPackingQty) {
			this.containerProductPackingQty = containerProductPackingQty;
		}

		public Double getContainerPackingQty() {
			return containerPackingQty;
		}

		public void setContainerPackingQty(Double containerPackingQty) {
			this.containerPackingQty = containerPackingQty;
		}

		public Double getSoLockQty() {
			return soLockQty;
		}

		public void setSoLockQty(Double soLockQty) {
			this.soLockQty = soLockQty;
		}

		public Double getSoPackIngQty() {
			return soPackIngQty;
		}

		public void setSoPackIngQty(Double soPackIngQty) {
			this.soPackIngQty = soPackIngQty;
		}

		public Double getSoProductLockQty() {
			return soProductLockQty;
		}

		public void setSoProductLockQty(Double soProductLockQty) {
			this.soProductLockQty = soProductLockQty;
		}

		public Double getSoProductPackingQty() {
			return soProductPackingQty;
		}

		public void setSoProductPackingQty(Double soProductPackingQty) {
			this.soProductPackingQty = soProductPackingQty;
		}

}
