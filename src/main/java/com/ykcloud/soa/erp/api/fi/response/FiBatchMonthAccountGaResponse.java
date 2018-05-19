/**
 * 
 */
package com.ykcloud.soa.erp.api.fi.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.fi.model.AdjustPriceForApi;

/**
 * @author 殷剑
 *
 */
public class FiBatchMonthAccountGaResponse extends MessagePack {

	private static final long serialVersionUID = 8626232377619754200L;
	
	private List<AdjustPriceForApi> list;

	public List<AdjustPriceForApi> getList() {
		return list;
	}

	public void setList(List<AdjustPriceForApi> list) {
		this.list = list;
	}

}
