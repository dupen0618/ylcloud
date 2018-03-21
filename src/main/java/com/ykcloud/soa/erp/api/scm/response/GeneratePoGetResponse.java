package com.ykcloud.soa.erp.api.scm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

/**
 * 
 * @author tz.x
 *
 * @date 2018年3月21日下午3:30:59
 */
public class GeneratePoGetResponse extends MessagePack {

	private static final long serialVersionUID = -6759216530682151348L;
	
	/**
	 * 采购单号
	 */
	private String poNumId;

	public String getPoNumId() {
		return poNumId;
	}

	public void setPoNumId(String poNumId) {
		this.poNumId = poNumId;
	}
	
	
}
