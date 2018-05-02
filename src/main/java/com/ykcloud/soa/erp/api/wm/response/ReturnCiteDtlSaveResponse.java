package com.ykcloud.soa.erp.api.wm.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.scm.model.CiteDtl;

public class ReturnCiteDtlSaveResponse extends MessagePack {
	
	private static final long serialVersionUID = 1L;
	
	private List<CiteDtl> CiteDtls;

	public List<CiteDtl> getCiteDtls() {
		return CiteDtls;
	}

	public void setCiteDtls(List<CiteDtl> citeDtls) {
		CiteDtls = citeDtls;
	}
	

}
