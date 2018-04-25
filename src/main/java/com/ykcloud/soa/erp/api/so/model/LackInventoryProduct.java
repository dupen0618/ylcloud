package com.ykcloud.soa.erp.api.so.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

//缺货商品
public class LackInventoryProduct implements Serializable{
	
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 行号
	 */
	@JsonIgnore
	private String serise;

		private Long itemNumId;  //商品编号
		
		private String itemName;  //商品名称
		
		private Double applyQty;  //需求数量
		
		private Double stockQty; //库存数量
		
		private Double lackQty; //缺少数量
		
		private String itemid;  //商家编码

		public String getSerise() {
			return serise;
		}

		public void setSerise(String serise) {
			this.serise = serise;
		}

		public String getItemid() {
			return itemid;
		}

		public void setItemid(String itemid) {
			this.itemid = itemid;
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

		public Double getApplyQty() {
			return applyQty;
		}

		public void setApplyQty(Double applyQty) {
			this.applyQty = applyQty;
		}

		public Double getStockQty() {
			return stockQty;
		}

		public void setStockQty(Double stockQty) {
			this.stockQty = stockQty;
		}

		public Double getLackQty() {
			return lackQty;
		}

		public void setLackQty(Double lackQty) {
			this.lackQty = lackQty;
		}
		
		

}
