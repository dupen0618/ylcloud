package com.ykcloud.soa.erp.api.so.request;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;
/**
 * 
 * @author gaoyun.shen
 *
 * @date 2018年7月19日 下午12:11:09
 * 
 * @Description RF查询商品信息和销售统计入参
 */
public class ProductFullDetailAndSaleStatisticGetRequest extends AbstractRequest {
	private static final long serialVersionUID = 1L;
	
	@NotNull(message="门店编号不能为空!")
	private  Long subUnitNumId;   //门店编号
	
	@NotNull(message="商品编号不能为空!")
	private  String barcode;     //商品编号
	
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
