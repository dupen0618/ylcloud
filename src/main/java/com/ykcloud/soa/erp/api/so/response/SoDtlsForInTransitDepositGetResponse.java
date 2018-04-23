package com.ykcloud.soa.erp.api.so.response;

import java.util.List;
import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.so.model.SoDtlForInTransitDeposit;

public class SoDtlsForInTransitDepositGetResponse extends MessagePack {

	private static final long serialVersionUID = 5304969504492084935L;

	private List<SoDtlForInTransitDeposit> soDtls;

	public List<SoDtlForInTransitDeposit> getSoDtls() {
		return soDtls;
	}

	public void setSoDtls(List<SoDtlForInTransitDeposit> soDtls) {
		this.soDtls = soDtls;
	}


	

}
