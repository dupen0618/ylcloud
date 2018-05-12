package com.ykcloud.soa.erp.api.wm.request;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.annotation.ApiField;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

/**
 * 
 * @author gaoyun.shen
 *
 * @date 2018年5月11日 上午9:55:34
 * 
 * @Description 根据条码获取商品信息入参
 */
public class ProductByBarcodeForReceiptGetRequest extends AbstractUserSessionRequest {

	private static final long serialVersionUID = -9168361855155604873L;

	@ApiField(description = "验收单号")
	@NotNull(message = "验收单号不能为空!")
	private String reservedNo;
	
	@ApiField(description = "托盘号")
	@NotNull(message = "托盘号不能为空!")
	private String traySerlno;
	
	@ApiField(description = "门店编号")
	@NotNull(message="门店编号不能为空!")
	private Long subUnitNumId;
	
	@ApiField(description = "商品条码") 
	@NotNull(message="商品条码不能为空!")
	private String barcode;

	



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

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

}
