package com.ykcloud.soa.erp.api.wm.request;

import javax.validation.constraints.NotNull;
import com.gb.soa.omp.ccommon.api.annotation.ApiField;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;
/**
 * 
 * @author gaoyun.shen
 *
 * @date 2018年6月4日 下午4:54:25
 * 
 * @Description  收货获取托盘明细
 */
public class ReceiptTrayDetailListGetRequest extends AbstractRequest {

	private static final long serialVersionUID = 7988475632052221318L;

	@NotNull(message = "门店编号不能为空！")
	private Long subUnitNumId;
	
	@ApiField(description = "验收单号")
	@NotNull(message = "验收单号不能为空!")
	private String reservedNo;
	
	
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

	
}
