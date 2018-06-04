package com.ykcloud.soa.erp.api.fi.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.annotation.ApiField;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import java.util.Date;
import javax.validation.constraints.NotNull;

/**
 * @Description: 生成购销客户结算单的入参
 * @author: henry.wang
 * @date: 2018/5/31 17:03
 **/
public class CustBalanceBlForPurchaseSellGenRequest extends AbstractUserSessionRequest {

	private static final long serialVersionUID = -5126554109130183317L;

	@NotNull(message = "结算门店不能为空！")
	@ApiField(description = "结算门店")
	private Long subUnitNumId;

	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	@NotNull(message = "日结日期不能为空！")
	@ApiField(description = "日结日期")
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
