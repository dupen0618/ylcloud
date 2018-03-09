/**   
 * Copyright © 2018 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * 功能描述：
 * @Package: com.ykcloud.soa.erp.api.md.response 
 * @author: fred.zhao  
 * @date: 2018年3月9日 下午3:11:24 
 */ 
package com.ykcloud.soa.erp.api.md.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

/**
* @ClassName: DirectWayFirstReceiptStorageNumIdGetResponse.java
* @Description: 获取门店直通商品首次收货仓response
* @version: v1.0.0
* @author: fred.zhao
* @date: 2018年3月9日 下午3:11:24 
*/
public class DirectWayFirstReceiptStorageNumIdGetResponse extends MessagePack{

	private static final long serialVersionUID = 3105816938481510645L;
	
	//仓库编号
	private Long storageNumId;

	public Long getStorageNumId() {
		return storageNumId;
	}

	public void setStorageNumId(Long storageNumId) {
		this.storageNumId = storageNumId;
	}
	
	
}
