package com.ykcloud.soa.erp.api.scm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

import javax.validation.constraints.NotNull;

/***
 * 通过商品单据审核商品单据请求参数
 * @author bi.cai
 * @date 2018年01月11日 下午10:46:39
 */
public class DMAuditRequest extends AbstractRequest {

	private static final long serialVersionUID = 7988475632052221318L;

	@NotNull(message = "商品单据不能为空！")
	private Long reservedNo;

	//更新用户
	private Long lastUpdateUserId;
	

	public Long getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(Long reservedNo) {
		this.reservedNo = reservedNo;
	}

	public Long getLastUpdateUserId() {
		return lastUpdateUserId;
	}

	public void setLastUpdateUserId(Long lastUpdateUserId) {
		this.lastUpdateUserId = lastUpdateUserId;
	}
}
