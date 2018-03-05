package com.ykcloud.soa.erp.api.md.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
/***
 * 
 * @author hank.zhu
 *2018-03-02
 *
 */
public class SupplyStatusNumIdGetResponse extends MessagePack {
	private static final long serialVersionUID = 1L;
    private Long supplyStatusNumId;
	public Long getSupplyStatusNumId() {
		return supplyStatusNumId;
	}
	public void setSupplyStatusNumId(Long supplyStatusNumId) {
		this.supplyStatusNumId = supplyStatusNumId;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
