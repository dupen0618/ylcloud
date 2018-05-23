package com.ykcloud.soa.erp.api.fi.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @Description:获取可结算往来项明细
 * @author Song
 * @Date 2018年4月4日 下午5:19:12
 */
public class NotBalanceDealingsGetRequest extends AbstractRequest {

	private static final long serialVersionUID = 493084987885757157L;

	@NotNull(message = "门店编号不能为空！")
	private Long subUnitNumId;

	@NotNull(message = "供应商编号不能为空！")
	private Long unitNumId;

	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	@NotNull(message = "开始日期不能为空！")
	private Date startDate;

	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	@NotNull(message = "截止日期不能为空！")
	private Date endDate;

	/*
	 * @NotNull(message = "经营方式不能为空！") private Long settlementType;
	 * 
	 * @NotNull(message = "结算周期不能为空！") private Date balanceDate;
	 */

	/*
	 * @NotNull(message = "操作人ID不能为空！") private Long createUserId;
	 * 
	 * @NotNull(message = "结算单号不能为空！") private Long balanceNo;
	 */
	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public Long getUnitNumId() {
		return unitNumId;
	}

	public void setUnitNumId(Long unitNumId) {
		this.unitNumId = unitNumId;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}
