package com.ykcloud.soa.erp.api.fi.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.fi.model.WmSellDaily;

/**
 * @Description://获取可结算验收入库明细
 * @author Song
 * @Date 2018年4月4日 下午3:06:43
 */
public class ReceiptDtilsForCanBalanceGetResponse extends MessagePack {

	private static final long serialVersionUID = -3725506062937780824L;

	private List<WmSellDaily> data;

	public List<WmSellDaily> getData() {
		return data;
	}

	public void setData(List<WmSellDaily> data) {
		this.data = data;
	}

}
