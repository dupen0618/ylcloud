package com.ykcloud.soa.erp.api.fi.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

/**
* @ClassName: LastMoveWeightingCostPriceGetResponse.java
* @Description:  取最新移动加权成本response
* @version: v1.0.0
* @author: fred.zhao
* @date: 2018年3月20日 上午9:59:38 
*/
public class LastMoveWeightingCostPriceGetResponse extends MessagePack{

	private static final long serialVersionUID = 3725506062937780824L;
	
	private Double costPrice;

	public Double getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(Double costPrice) {
		this.costPrice = costPrice;
	}
	
	

}
