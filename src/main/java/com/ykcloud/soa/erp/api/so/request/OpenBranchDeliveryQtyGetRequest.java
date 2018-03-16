package com.ykcloud.soa.erp.api.so.request;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;
/**
 * 分仓在途数的查询入参类
 * @author 14540
 *
 */
public class OpenBranchDeliveryQtyGetRequest extends AbstractRequest {
	    @NotNull(message="订单门店编号不能为空!")
	    private Long ordSubUnitNumId;  //订单门店编号
	    @NotNull(message="商品编号不能为空!")
	    private Long itemNumId;       //商品编号
	    
	    private Long storageNumId;    //仓库编号
	    
	    private Double openBranchDeliveryQty;//分仓在途数量
	    
		public Double getOpenBranchDeliveryQty() {
			return openBranchDeliveryQty;
		}
		public void setOpenBranchDeliveryQty(Double openBranchQty) {
			this.openBranchDeliveryQty = openBranchQty;
		}
		public Long getStorageNumId() {
			return storageNumId;
		}
		public void setStorageNumId(Long storageNumId) {
			this.storageNumId = storageNumId;
		}
		public Long getOrdSubUnitNumId() {
			return ordSubUnitNumId;
		}
		public void setOrdSubUnitNumId(Long ordSubUnitNumId) {
			this.ordSubUnitNumId = ordSubUnitNumId;
		}
		public Long getItemNumId() {
			return itemNumId;
		}
		public void setItemNumId(Long itemNumId) {
			this.itemNumId = itemNumId;
		}
	    
	    
}
