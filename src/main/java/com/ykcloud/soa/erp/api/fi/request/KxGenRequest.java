package com.ykcloud.soa.erp.api.fi.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.annotation.ApiField;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import java.util.Date;
import javax.validation.constraints.NotNull;

/**
 * @Description: 自动生成扣项的入参
 * @author: henry.wang
 * @date: 2018/5/12 13:46
 **/
public class KxGenRequest extends AbstractUserSessionRequest{

	private static final long serialVersionUID = 1L;

	@ApiField(description = "门店编号")
	@NotNull(message = "门店编号不能为空！")
	private Long subUnitNumId;

	@ApiField(description = "日结日期")
	@NotNull(message = "日结日期不能为空！")
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date sellDate;

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public Date getSellDate() {
		return sellDate;
	}

	public void setSellDate(Date sellDate) {
		this.sellDate = sellDate;
	}
}
