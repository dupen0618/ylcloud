package com.ykcloud.soa.erp.api.fi.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.fi.model.BalanceCut;
import com.ykcloud.soa.erp.api.fi.model.BalanceDealings;

import java.util.List;

/**
 * @Description:获取可结算往来项明细
 * @author Song
 * @Date 2018年4月4日 下午5:15:02
 */
public class NotBalanceDealingsGetResponse extends MessagePack  {

	private static final long serialVersionUID = 2733868386803474661L;

	private List<BalanceDealings> data;

	public List<BalanceDealings> getData() {
		return data;
	}

	public void setData(List<BalanceDealings> data) {
		this.data = data;
	}

	
	
}
