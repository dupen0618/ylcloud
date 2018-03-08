package com.ykcloud.soa.erp.api.prd.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

/***
 * 
 * @author hank.zhu
 *2018-03-02
 *
 */

public class ItemStatusPermitActionCheckResponse extends MessagePack{
	private static final long serialVersionUID = 1L;

private Long permitSign;

public Long getPermitSign() {
	return permitSign;
}

public void setPermitSign(Long permitSign) {
	this.permitSign = permitSign;
}


}
