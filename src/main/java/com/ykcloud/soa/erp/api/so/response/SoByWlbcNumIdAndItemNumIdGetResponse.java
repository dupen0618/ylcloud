package com.ykcloud.soa.erp.api.so.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.so.model.SoDtl;

/**
 * 
 * @author Dan
 * @date 2018年3月30日
 * @description
 */
public class SoByWlbcNumIdAndItemNumIdGetResponse extends MessagePack {
	
	//订单明细集合
	private List<SoDtl> soDtlList;

	public List<SoDtl> getSoDtlList() {
		return soDtlList;
	}

	public void setSoDtlList(List<SoDtl> soDtlList) {
		this.soDtlList = soDtlList;
	}
	
	

}
