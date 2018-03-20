/**   
 * Copyright © 2018 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * 功能描述：
 * @Package: com.ykcloud.soa.erp.api.md.request 
 * @author: fred.zhao  
 * @date: 2018年3月9日 下午5:23:59 
 */ 
package com.ykcloud.soa.erp.api.md.request;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

/**
* @ClassName: ShopStorageListFroReplenishGetRequest.java
* @Description: 获取门店下参与补货的仓库列表request
* @version: v1.0.0
* @author: fred.zhao
* @date: 2018年3月9日 下午5:23:59 
*/
public class ShopStorageListFroReplenishGetRequest extends AbstractRequest {

	private static final long serialVersionUID = -5164990865195716542L;
	
	@NotNull(message="门店编号不能为空！")
	private Long subUnitNumId;

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}
}
