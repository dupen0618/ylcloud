package com.ykcloud.soa.erp.api.prd.request;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

/***
 * 
 * @author hank.zhu
 *@date 2018-03-02创建
 *
 */

public class ItemStatusPermitActionGetRequest extends AbstractRequest {


	private static final long serialVersionUID = 1L;
	@NotNull(message = "商品状态Id不能为空！")
	private Long statusNumId;  
	@NotEmpty(message = "商品动作不能那个为空！")
	private String action;
	
	public Long getStatusNumId() {
		return statusNumId;
	}
	public void setStatusNumId(Long statusNumId) {
		this.statusNumId = statusNumId;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	
	
}
