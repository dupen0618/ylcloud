package com.ykcloud.soa.erp.api.md.request;

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
	private Long itemStatusId;
	@NotEmpty(message = "商品动作不能那个为空！")
	private String action;
	public Long getItemStatusId() {
		return itemStatusId;
	}
	public void setItemStatusId(Long itemStatusId) {
		this.itemStatusId = itemStatusId;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	
	
}
