/**   
 * Copyright © 2018 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * 功能描述：
 * @Package: com.ykcloud.soa.erp.api.md.response 
 * @author: fred.zhao  
 * @date: 2018年3月9日 下午4:48:54 
 */ 
package com.ykcloud.soa.erp.api.md.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

/**
* @ClassName: FinalDistributionStorageNumIdGetResponse.java
* @Description: 获取门店最终配送逻辑仓response
* @version: v1.0.0
* @author: fred.zhao
* @date: 2018年3月9日 下午4:48:54 
*/
public class FinalDistributionStorageNumIdGetResponse extends MessagePack{
	
	private static final long serialVersionUID = -7700625003359115882L;
	//最终仓库
	private Long storageNumId;
	
	public Long getStorageNumId() {
		return storageNumId;
	}
	public void setStorageNumId(Long storageNumId) {
		this.storageNumId = storageNumId;
	}
	
	
}
