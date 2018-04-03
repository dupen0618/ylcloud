package com.ykcloud.soa.erp.api.wm.response;

import java.util.Date;
import java.util.List;

import javax.swing.Spring;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.wm.model.SupplyBalance;

/**
 * @Description:供应商结算相关业务
 * @author Song
 * @Date 2018年4月2日 下午5:50:03
 */
public class GoodsSupplyBalanceGetResponse extends MessagePack {

	private static final long serialVersionUID = -1621207553036267818L;
	
	
	private List<SupplyBalance> supplyBalance;


	public List<SupplyBalance> getSupplyBalance() {
		return supplyBalance;
	}


	public void setSupplyBalance(List<SupplyBalance> supplyBalance) {
		this.supplyBalance = supplyBalance;
	}
	
	
	
}
