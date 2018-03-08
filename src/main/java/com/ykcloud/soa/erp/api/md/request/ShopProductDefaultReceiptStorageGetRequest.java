/**   
 * Copyright © 2018 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * 功能描述：
 * @Package: com.ykcloud.soa.erp.api.md.request 
 * @author: fred.zhao  
 * @date: 2018年3月8日 下午2:00:54 
 */ 
package com.ykcloud.soa.erp.api.md.request;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

/**
* @ClassName: ShopProductDefaultReceiptStorageGetRequest.java
* @Description: 获取门店某商品默认收货仓库(逻辑仓及物理仓)入参
* @version: v1.0.0
* @author: fred.zhao
* @date: 2018年3月8日 下午2:00:54 
*/
public class ShopProductDefaultReceiptStorageGetRequest extends AbstractRequest {
	
	private static final long serialVersionUID = 1L;

	@NotNull(message="门店编号不能为空")
	private Long subUnitNumId;
	
	@NotNull(message="商品编号不能为空")
	private Long itemNumId;

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public Long getItemNumId() {
		return itemNumId;
	}

	public void setItemNumId(Long itemNumId) {
		this.itemNumId = itemNumId;
	} 

	
	
	
	
}
