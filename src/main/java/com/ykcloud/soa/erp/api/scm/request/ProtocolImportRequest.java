package com.ykcloud.soa.erp.api.scm.request;

import java.util.List;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.scm.model.ImportProtocol;
import com.ykcloud.soa.erp.api.scm.model.ProtocolShop;
public class ProtocolImportRequest extends AbstractUserSessionRequest {
	
private static final long serialVersionUID = 1L;
	
	private List<ImportProtocol> importProtocols;
	
	private List<ProtocolShop> protocolShops;
	
	// 导入模式：1、严格模式 2、宽松模式
	private Integer mode;

	// 参数 1-存在跳过 0-存在抛错,基础数据同步不用Txc
	private Integer skipExistSign;

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

	public Integer getMode() {
		return mode;
	}

	public void setMode(Integer mode) {
		this.mode = mode;
	}

	public Integer getSkipExistSign() {
		return skipExistSign;
	}

	public void setSkipExistSign(Integer skipExistSign) {
		this.skipExistSign = skipExistSign;
	}
	
	

}
