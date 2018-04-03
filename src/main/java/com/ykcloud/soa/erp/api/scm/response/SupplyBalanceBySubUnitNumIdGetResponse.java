package com.ykcloud.soa.erp.api.scm.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.scm.model.SupplyBalanceName;

/**
 * @Description:根据门店选择当前可结算的供应商
 * @author Song
 * @Date 2018年4月4日 下午12:47:31
 */
public class SupplyBalanceBySubUnitNumIdGetResponse extends MessagePack {

	private static final long serialVersionUID = -1621207553036267818L;
	
	private List<SupplyBalanceName> supplyBalanceName;

	public List<SupplyBalanceName> getSupplyBalanceName() {
		return supplyBalanceName;
	}

	public void setSupplyBalanceName(List<SupplyBalanceName> supplyBalanceName) {
		this.supplyBalanceName = supplyBalanceName;
	}
	
	
}
