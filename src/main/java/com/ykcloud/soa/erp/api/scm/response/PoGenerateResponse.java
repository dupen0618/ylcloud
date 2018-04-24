package com.ykcloud.soa.erp.api.scm.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

/**
 * 
 * @author tz.x
 *
 * @date 2018年3月21日下午3:30:59
 */
public class PoGenerateResponse extends MessagePack {

	private static final long serialVersionUID = -6759216530682151348L;
	
	/**
	 * 采购单号
	 */
	private List<String> poNumId;

	public List<String> getPoNumId() {
		return poNumId;
	}

	public void setPoNumId(List<String> poNumId) {
		this.poNumId = poNumId;
	}

	
}
