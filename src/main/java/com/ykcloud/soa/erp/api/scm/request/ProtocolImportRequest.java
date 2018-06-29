package com.ykcloud.soa.erp.api.scm.request;

import java.util.List;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;
import com.ykcloud.soa.erp.api.scm.model.ImportProtocol;
import com.ykcloud.soa.erp.api.scm.model.ProtocolShop;
public class ProtocolImportRequest extends AbstractRequest {
	
private static final long serialVersionUID = 1L;
	
	private List<ImportProtocol> importProtocols;
	
	private List<ProtocolShop> protocolShops;

	public List<ImportProtocol> getImportProtocols() {
		return importProtocols;
	}

	public void setImportProtocols(List<ImportProtocol> importProtocols) {
		this.importProtocols = importProtocols;
	}

	public List<ProtocolShop> getProtocolShops() {
		return protocolShops;
	}

	public void setProtocolShops(List<ProtocolShop> protocolShops) {
		this.protocolShops = protocolShops;
	}
	

}
