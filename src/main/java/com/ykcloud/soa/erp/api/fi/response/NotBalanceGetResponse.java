package com.ykcloud.soa.erp.api.fi.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.fi.model.FiBalance;
import com.ykcloud.soa.erp.api.wm.model.SupBalanceDtl;

/**
 * @Description://获取可结算验收入库明细
 * @author Song
 * @Date 2018年4月4日 下午3:06:43
 */
public class NotBalanceGetResponse extends MessagePack {

	private static final long serialVersionUID = -3725506062937780824L;

	private List<SupBalanceDtl> data;

	public List<SupBalanceDtl> getData() {
		return data;
	}

	public void setData(List<SupBalanceDtl> data) {
		this.data = data;
	}

}
