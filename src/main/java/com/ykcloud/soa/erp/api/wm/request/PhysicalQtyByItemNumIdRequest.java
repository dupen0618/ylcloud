package com.ykcloud.soa.erp.api.wm.request;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;
/**
 * 
 * @author gaoyun.shen
 *
 * @date 2018年7月19日 下午9:04:24
 * 
 * @Description
 */
public class PhysicalQtyByItemNumIdRequest extends AbstractRequest {
    private static final long serialVersionUID = 1L;


	@NotNull(message="门店编号不能为空!")
	private  Long subUnitNumId;   //门店编号
	
	@NotNull(message="商品编号不能为空!")
	private  Long itemNumId;     //商品编号
	
	@NotNull(message="查询年月不能为空")
	private  String accountMonth;    

	public String getAccountMonth() {
		return accountMonth;
	}

	public void setAccountMonth(String accountMonth) {
		this.accountMonth = accountMonth;
	}

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public Long getItemNumId() {
		return itemNumId;
	}

	public void setItemNumId(Long itemNumId) {
		this.itemNumId = itemNumId;
	}
	

}
