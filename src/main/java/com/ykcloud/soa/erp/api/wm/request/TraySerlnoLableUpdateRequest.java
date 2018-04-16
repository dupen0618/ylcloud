package com.ykcloud.soa.erp.api.wm.request;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import com.gb.soa.omp.ccommon.api.annotation.ApiField;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

/**
*绑定托盘实物周转箱编号请求类
@author hank.zhu
@date 2018年4月16日 上午8:47:01 新建
**/
public class TraySerlnoLableUpdateRequest extends AbstractUserSessionRequest {
	
	private static final long serialVersionUID = 2959306634036253575L;

	@ApiField(description = "门店编号")
	@NotNull(message="门店编号不能为空!")
	private Long subUnitNumId;
	
	@ApiField(description = "验收单号")
	@NotNull(message="验收单号不能为空!")
	private String reservedNo;//
	
	@ApiField(description = "托盘号")
	@NotNull(message="托盘号不能为空!")
	private String traySerlno;
	
	@ApiField(description = "周转箱编号")
	@NotEmpty(message="周转箱编号不能为空!")
	private String traySerlnoLable;

	
	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public String getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	}

	public String getTraySerlno() {
		return traySerlno;
	}

	public void setTraySerlno(String traySerlno) {
		this.traySerlno = traySerlno;
	}

	public String getTraySerlnoLable() {
		return traySerlnoLable;
	}

	public void setTraySerlnoLable(String traySerlnoLable) {
		this.traySerlnoLable = traySerlnoLable;
	}
	
	

}
