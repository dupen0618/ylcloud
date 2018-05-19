/**
 * 
 */
package com.ykcloud.soa.erp.api.fi.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.fi.model.AdjustPriceForApi;
import com.ykcloud.soa.erp.api.fi.model.BalanceCut;

/**
 * @author 殷剑
 *
 */
public class FiBatchDailyAccountGaResponse extends MessagePack {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4116632841845854107L;
	
	private List<AdjustPriceForApi> list;

	public List<AdjustPriceForApi> getList() {
		return list;
	}

	public void setList(List<AdjustPriceForApi> list) {
		this.list = list;
	}
	
}
