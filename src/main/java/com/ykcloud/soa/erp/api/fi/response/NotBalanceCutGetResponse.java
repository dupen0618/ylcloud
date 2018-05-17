package com.ykcloud.soa.erp.api.fi.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.fi.model.BalanceCut;

/**
 * @Description:获取可结算扣款项明细
 * @author Song
 * @Date 2018年4月4日 下午5:15:02
 */
public class NotBalanceCutGetResponse extends MessagePack  {

	private static final long serialVersionUID = 2733868386803474661L;

	private List<BalanceCut> data;

	public List<BalanceCut> getData() {
		return data;
	}

	public void setData(List<BalanceCut> data) {
		this.data = data;
	}

	
	
}
