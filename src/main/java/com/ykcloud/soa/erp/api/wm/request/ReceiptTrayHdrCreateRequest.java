package com.ykcloud.soa.erp.api.wm.request;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

/**
*
@author hank.zhu
@date 2018年3月13日 下午4:00:40 新建
**/
//查询验收单入参类
public class ReceiptTrayHdrCreateRequest extends AbstractRequest {

	private static final long serialVersionUID = -3223809141034948084L;

	//托盘号
	@NotNull(message = "托盘号不能为空！")
	private Long traySerlno;
	
	//实物标签
	private Long traySerlnoLabel;

	public Long getTraySerlno() {
		return traySerlno;
	}

	public void setTraySerlno(Long traySerlno) {
		this.traySerlno = traySerlno;
	}

	public Long getTraySerlnoLabel() {
		return traySerlnoLabel;
	}

	public void setTraySerlnoLabel(Long traySerlnoLabel) {
		this.traySerlnoLabel = traySerlnoLabel;
	}
	
	
	
}
