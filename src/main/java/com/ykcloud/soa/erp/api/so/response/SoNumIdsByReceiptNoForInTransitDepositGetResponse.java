package com.ykcloud.soa.erp.api.so.response;

import java.util.List;
import com.gb.soa.omp.ccommon.api.response.MessagePack;

public class SoNumIdsByReceiptNoForInTransitDepositGetResponse extends MessagePack {

	private static final long serialVersionUID = 5304969504492084935L;

	private List<String> soNumIds;

	public List<String> getSoNumIds() {
		return soNumIds;
	}

	public void setSoNumIds(List<String> soNumIds) {
		this.soNumIds = soNumIds;
	}

}
