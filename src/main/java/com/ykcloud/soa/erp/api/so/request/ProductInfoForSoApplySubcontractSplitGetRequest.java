package com.ykcloud.soa.erp.api.so.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;
//委外分解领料商品查询的入参类
public class ProductInfoForSoApplySubcontractSplitGetRequest extends AbstractRequest {
			@NotNull(message="调出门店商品编号不为空")
	  		private Long subUnitNumId;   //调出门店编号
			
			@NotNull(message="调入门店编号")
			private Long recSubUnitNumId; //调入门店编号
			
			@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
			@NotNull(message="日期不能为空")
			private Date orderDate;			//日期
						
			@NotNull(message="调出仓库编号不能为空")
			private Long storageNumId;   //调出仓库编号
			
			@NotNull(message="条形码不能为空")
			private String barcode;      //条形码
			
			@NotNull(message="委外供应商编号不能为空")
			private Long supplyUnitNumId;   //委外供应商编号
			
			@NotNull(message="存储方式不能为空")
			private Long storeType;   //存储方式限定 0-不限定

			public Long getSubUnitNumId() {
				return subUnitNumId;
			}

			public void setSubUnitNumId(Long subUnitNumId) {
				this.subUnitNumId = subUnitNumId;
			}

			public Long getRecSubUnitNumId() {
				return recSubUnitNumId;
			}

			public void setRecSubUnitNumId(Long recSubUnitNumId) {
				this.recSubUnitNumId = recSubUnitNumId;
			}

			public Date getOrderDate() {
				return orderDate;
			}

			public void setOrderDate(Date orderDate) {
				this.orderDate = orderDate;
			}

			public Long getStorageNumId() {
				return storageNumId;
			}

			public void setStorageNumId(Long storageNumId) {
				this.storageNumId = storageNumId;
			}

			public String getBarcode() {
				return barcode;
			}

			public void setBarcode(String barcode) {
				this.barcode = barcode;
			}

			public Long getSupplyUnitNumId() {
				return supplyUnitNumId;
			}

			public void setSupplyUnitNumId(Long supplyUnitNumId) {
				this.supplyUnitNumId = supplyUnitNumId;
			}

			public Long getStoreType() {
				return storeType;
			}

			public void setStoreType(Long storeType) {
				this.storeType = storeType;
			}
			
			
}
