package com.ykcloud.soa.erp.api.so.request;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;
//根据行号查询销售日报表体入参
public class SaleInfoBySeriesGetRequest extends AbstractRequest {
	private static final long serialVersionUID = 1L;
	
	@NotNull(message="行号不能为空")
	private String line;  //行号


	public String getLine() {
		return line;
	}


	public void setLine(String line) {
		this.line = line;
	}

		

}
