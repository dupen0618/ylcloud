package com.ykcloud.soa.erp.api.so.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.so.model.GroupNumIdAndItemNumId;

//so中用于自动补货查询商品销售的相关信息的出参类
public class ItemSaleInfoByItemNumIdAndOrderDateGetResponse extends MessagePack {

	private static final long serialVersionUID = 1L;
	private List<GroupNumIdAndItemNumId> groupNumIdAndItemNumIds;

	public List<GroupNumIdAndItemNumId> getGroupNumIdAndItemNumIds() {
		return groupNumIdAndItemNumIds;
	}

	public void setGroupNumIdAndItemNumIds(List<GroupNumIdAndItemNumId> groupNumIdAndItemNumIds) {
		this.groupNumIdAndItemNumIds = groupNumIdAndItemNumIds;
	}

}
