package com.ykcloud.soa.erp.api.md.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

public class ConfigValueGetResponse extends MessagePack {

	private String configValue;

	public String getConfigValue() {
		return configValue;
	}

	public void setConfigValue(String configValue) {
		this.configValue = configValue;
	}
	
	
}
