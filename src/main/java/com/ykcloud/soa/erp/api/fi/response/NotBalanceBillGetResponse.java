package com.ykcloud.soa.erp.api.fi.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.wm.model.SupBalanceBillDtl;
import com.ykcloud.soa.erp.api.wm.model.SupBalanceDtl;

import java.util.List;

/**
 * @Description://获取可结算验收入库明细
 * @author Song
 * @Date 2018年4月4日 下午3:06:43
 */
public class NotBalanceBillGetResponse extends MessagePack {

	private static final long serialVersionUID = -3725506062937780824L;

	private List<SupBalanceBillDtl> data;

	public List<SupBalanceBillDtl> getData() {
		return data;
	}

	public void setData(List<SupBalanceBillDtl> data) {
		this.data = data;
	}

}
