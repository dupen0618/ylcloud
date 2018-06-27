package com.ykcloud.soa.erp.api.scm.model;

import java.io.Serializable;

/**
 * 商品门店和商品编号发生变价
 * @author bi.cai
 * @date 2018年02月24日 上午14:12:21
 */
public class GoodsShopLogSubUnitModel implements Serializable {
	
	private static final long serialVersionUID = -6445347891259303182L;
	
	// 商品主键
	private Long itemNumId;
	// 门店编码
	private Long subUnitNumId;
	//线上门店编号
	private Long ecShopNumId;
	
	public Long getEcShopNumId() {
		return ecShopNumId;
	}
	public void setEcShopNumId(Long ecShopNumId) {
		this.ecShopNumId = ecShopNumId;
	}
	public Long getItemNumId() {
		return itemNumId;
	}
	public void setItemNumId(Long itemNumId) {
		this.itemNumId = itemNumId;
	}
	public Long getSubUnitNumId() {
		return subUnitNumId;
	}
	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}
}
