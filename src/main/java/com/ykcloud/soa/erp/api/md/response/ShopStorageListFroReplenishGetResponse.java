/**   
 * Copyright © 2018 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * 功能描述：
 * @Package: com.ykcloud.soa.erp.api.md.response 
 * @author: fred.zhao  
 * @date: 2018年3月9日 下午5:24:53 
 */ 
package com.ykcloud.soa.erp.api.md.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

/**
* @ClassName: ShopStorageListFroReplenishGetResponse.java
* @Description: 获取门店下参与补货的仓库列表response
* @version: v1.0.0
* @author: fred.zhao
* @date: 2018年3月9日 下午5:24:53 
*/
public class ShopStorageListFroReplenishGetResponse extends MessagePack{

	private static final long serialVersionUID = -2776618190141502077L;
	
	//仓库编号列表
	private List<Long> stroageNumIds;

	public List<Long> getStroageNumIds() {
		return stroageNumIds;
	}

	public void setStroageNumIds(List<Long> stroageNumIds) {
		this.stroageNumIds = stroageNumIds;
	}
	
}
