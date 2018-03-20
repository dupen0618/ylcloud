package com.ykcloud.soa.erp.api.prd.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

/**
* @ClassName: ShopProductDefaultReceiptStorageGetResponse.java
* @Description: 获取门店某商品默认收货仓库(逻辑仓及物理仓)出参
* @version: v1.0.0
* @author: fred.zhao
* @date: 2018年3月8日 下午2:08:58 
*/
public class ShopProductDefaultReceiptStorageGetResponse extends MessagePack{

	private static final long serialVersionUID = 1L;
	
	/**
	 * 逻辑仓库编号
	 */
	private Long stroageNumId; 
	
	/**
	 * 物理仓编号
	 */
	private Long physicalNumId;

	public Long getStroageNumId() {
		return stroageNumId;
	}

	public void setStroageNumId(Long stroageNumId) {
		this.stroageNumId = stroageNumId;
	}

	public Long getPhysicalNumId() {
		return physicalNumId;
	}

	public void setPhysicalNumId(Long physicalNumId) {
		this.physicalNumId = physicalNumId;
	}

	
	
	
}
