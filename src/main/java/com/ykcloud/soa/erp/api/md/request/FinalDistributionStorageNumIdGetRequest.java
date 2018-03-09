/**   
 * Copyright © 2018 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * 功能描述：
 * @Package: com.ykcloud.soa.erp.api.md.request 
 * @author: fred.zhao  
 * @date: 2018年3月9日 下午4:46:18 
 */ 
package com.ykcloud.soa.erp.api.md.request;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.annotation.ApiField;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

/**
* @ClassName: FinalDistributionStorageNumIdGetRequest.java
* @Description: 获取门店最终配送逻辑仓request
* @version: v1.0.0
* @author: fred.zhao
* @date: 2018年3月9日 下午4:46:18 
*/
public class FinalDistributionStorageNumIdGetRequest extends AbstractRequest{

	private static final long serialVersionUID = -7358774441624037259L;
	
	@NotNull(message="门店编号不能为空！")
	@ApiField(description="门店编号")
	private Long subUnitNumId;

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}
	
	
}
