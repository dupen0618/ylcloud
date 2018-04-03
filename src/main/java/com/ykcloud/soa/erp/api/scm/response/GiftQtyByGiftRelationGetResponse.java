package com.ykcloud.soa.erp.api.scm.response;

import java.util.List;
import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.scm.model.GiftProduct;

//获取供应商品赠品数量
public class GiftQtyByGiftRelationGetResponse extends MessagePack {

	private static final long serialVersionUID = -3621634900229807547L;

	private List<GiftProduct> data;

	public List<GiftProduct> getData() {
		return data;
	}

	public void setData(List<GiftProduct> data) {
		this.data = data;
	}

}
