package com.ykcloud.soa.erp.api.fi.request;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

/**
 * @Description:查找扣项名称
 * @author Song
 * @Date 2018年5月8日 上午11:49:45
 */
public class KxNameGetRequest extends AbstractRequest{

	private static final long serialVersionUID = 1L;
	
	@NotNull(message = "扣项类型不能为空！")
	private Long kxType;

	public Long getKxType() {
		return kxType;
	}

	public void setKxType(Long kxType) {
		this.kxType = kxType;
	}
}
