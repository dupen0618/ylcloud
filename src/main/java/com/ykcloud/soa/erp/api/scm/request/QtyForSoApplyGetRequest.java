package com.ykcloud.soa.erp.api.scm.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;
//数量检查(店间调拨、仓间调拨、加工领料、行政领料)的入参
public class QtyForSoApplyGetRequest extends AbstractRequest {
		
		@NotNull(message="门店编号不能为空")
		private Long subUnitNumId; //门店编号
		
		@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
		@NotNull(message="日期不能为空")
		private Date orderDate;  //日期
		
		private Double qty;     //数量
		
		private Double packageQty; //件数
		
		@NotNull(message="出库仓库编号不能为空")
		private Long storageNumId;  //出货仓库编号
		
		@NotNull(message="件装数不能为空")
		private Double conversionQty;//件装数
		
		@NotNull(message="商品编号不能为空")
		private Long itemNumId;    //商品编号

		public Long getSubUnitNumId() {
			return subUnitNumId;
		}

		public void setSubUnitNumId(Long subUnitNumId) {
			this.subUnitNumId = subUnitNumId;
		}

		public Date getOrderDate() {
			return orderDate;
		}

		public void setOrderDate(Date orderDate) {
			this.orderDate = orderDate;
		}

		public Double getQty() {
			return qty;
		}

		public void setQty(Double qty) {
			this.qty = qty;
		}

		public Double getPackageQty() {
			return packageQty;
		}

		public void setPackageQty(Double packageQty) {
			this.packageQty = packageQty;
		}

		public Long getStorageNumId() {
			return storageNumId;
		}

		public void setStorageNumId(Long storageNumId) {
			this.storageNumId = storageNumId;
		}

		public Double getConversionQty() {
			return conversionQty;
		}

		public void setConversionQty(Double conversionQty) {
			this.conversionQty = conversionQty;
		}

		public Long getItemNumId() {
			return itemNumId;
		}

		public void setItemNumId(Long itemNumId) {
			this.itemNumId = itemNumId;
		}
		
		

}
