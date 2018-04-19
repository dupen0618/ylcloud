package com.ykcloud.soa.erp.api.wm.request;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.annotation.ApiField;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

/**
*创建退库收货托盘请求类
@author hank.zhu
@date 2018年4月19日 下午4:23:37 新建
**/
public class ReverseReceiptTrayHdrCreateRequest extends AbstractUserSessionRequest {
	private static final long serialVersionUID = 1591456042738925674L;
	
	@ApiField(description = "门店编号")
	@NotNull(message = "门店编号不能为空!")
	private Long subUnitNumId;
	
	@ApiField(description = "验收单号")
	@NotNull(message = "验收单号不能为空!")
	private String reservedNo;
	
	@ApiField(description = "托盘实物标签")
	private String traySerlnoLable;
	
	@ApiField(description = "忽略PC收货检查标识:RF收货时传0,或null;PC收货时传1")
	private Long ignoreCheckSign;

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

	public String getTraySerlnoLable() {
		return traySerlnoLable;
	}

	public void setTraySerlnoLable(String traySerlnoLable) {
		this.traySerlnoLable = traySerlnoLable;
	}

	public Long getIgnoreCheckSign() {
		return ignoreCheckSign;
	}

	public void setIgnoreCheckSign(Long ignoreCheckSign) {
		this.ignoreCheckSign = ignoreCheckSign;
	}

	

	

}
