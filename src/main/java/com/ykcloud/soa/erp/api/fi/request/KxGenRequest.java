package com.ykcloud.soa.erp.api.fi.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.annotation.ApiField;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;
import java.util.Date;
import javax.validation.constraints.NotNull;

/**
 * @Description: 自动生成扣项的入参
 * @author: henry.wang
 * @date: 2018/5/12 13:46
 **/
public class KxGenRequest extends AbstractRequest{

	private static final long serialVersionUID = 1L;

	@ApiField(description = "会计月份")
	@NotNull(message = "会计月份不能为空！")
	@JsonFormat(pattern = "yyyyMM", timezone = "GMT+8")
	private String accountMonth;

	public String getAccountMonth() {
		return accountMonth;
	}

	public void setAccountMonth(String accountMonth) {
		this.accountMonth = accountMonth;
	}
}
