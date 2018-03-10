package com.ykcloud.soa.erp.api.md.request;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class ConfigValueGetRequest extends AbstractRequest {
	
	private static final long serialVersionUID = 1L;
	
	@NotNull(message = "配置名不能为空")
	private String configName;

	public String getConfigName() {
		return configName;
	}

	public void setConfigName(String configName) {
		this.configName = configName;
	}
	
}
