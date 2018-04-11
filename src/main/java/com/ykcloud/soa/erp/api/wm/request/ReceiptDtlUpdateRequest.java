package com.ykcloud.soa.erp.api.wm.request;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.annotation.ApiField;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

/**
*
@author hank.zhu
@date 2018年3月13日 下午4:24:46 新建
**/
//更新收货数量入参类
public class ReceiptDtlUpdateRequest extends AbstractUserSessionRequest {

	private static final long serialVersionUID = 7609735815566193502L;

	@ApiField(description = "验收单号")
	@NotNull(message = "验收单号不能为空!")
	private String reservedNo;
	
	@ApiField(description = "托盘号")
	@NotNull(message = "托盘号不能为空!")
	private String traySerlno;
	
	@ApiField(description = "商品编码")
	@NotNull(message = "商品编码不能为空!")
	private Long itemNumId;
	
	@ApiField(description = "收货数量")
	@NotNull(message = "收货数量不能为空!")
	private Double qty;
	
	@ApiField(description = "更新正常品/赠品标识")
	private Long plmSign=2L;
	
	@ApiField(description = "门店编号")
	@NotNull(message="门店编号不能为空!")
	private Long subUnitNumId;
	
	@ApiField(description = "扫回标识")   //value{0 :正向,-1 :反向}
	@NotNull(message="扫回标识不能为空!")
	private Long canselSign;
	


	public Long getCanselSign() {
		return canselSign;
	}

	public void setCanselSign(Long canselSign) {
		this.canselSign = canselSign;
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

	public Long getItemNumId() {
		return itemNumId;
	}

	public void setItemNumId(Long itemNumId) {
		this.itemNumId = itemNumId;
	}

	public Double getQty() {
		return qty;
	}

	public void setQty(Double qty) {
		this.qty = qty;
	}

	public Long getPlmSign() {
		return plmSign;
	}

	public void setPlmSign(Long plmSign) {
		this.plmSign = plmSign;
	}

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}
}
