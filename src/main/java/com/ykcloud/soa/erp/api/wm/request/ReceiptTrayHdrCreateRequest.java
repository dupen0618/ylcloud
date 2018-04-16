package com.ykcloud.soa.erp.api.wm.request;

import javax.validation.constraints.NotNull;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
/**
*创建托盘请求类
@author hank.zhu
@date 2018年3月13日 下午4:00:40 新建
**/
//查询验收单入参类
public class ReceiptTrayHdrCreateRequest extends AbstractUserSessionRequest {
	private static final long serialVersionUID = -3223809141034948084L;
	//托盘号
	@NotNull(message = "验收单号不能为空！")
	private String reservedNo;
	
	//托盘实物标签号
	private String traySerlnoLabel;
	
	//忽略检查标识
	private Long ignoreCheckSign;//忽略PC检查标识value {1 :忽略检查 ,0 or null :不忽略检查}
	
	//门店编号
	@NotNull(message = "门店编号不能为空！")
	private Long subUnitNumId;

	
	public Long getIgnoreCheckSign() {
		return ignoreCheckSign;
	}

	public void setIgnoreCheckSign(Long ignoreCheckSign) {
		this.ignoreCheckSign = ignoreCheckSign;
	}

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

	public String getTraySerlnoLabel() {
		return traySerlnoLabel;
	}

	public void setTraySerlnoLabel(String traySerlnoLabel) {
		this.traySerlnoLabel = traySerlnoLabel;
	}
}
