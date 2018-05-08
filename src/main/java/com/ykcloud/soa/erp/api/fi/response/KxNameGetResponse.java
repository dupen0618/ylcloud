package com.ykcloud.soa.erp.api.fi.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

/**
 * @Description:查找扣项名称
 * @author Song
 * @Date 2018年5月8日 上午11:49:41
 */
public class KxNameGetResponse extends MessagePack{

	private static final long serialVersionUID = -5559699674026609496L;

	private String kxName;

	public String getKxName() {
		return kxName;
	}

	public void setKxName(String kxName) {
		this.kxName = kxName;
	}
	
	

}
