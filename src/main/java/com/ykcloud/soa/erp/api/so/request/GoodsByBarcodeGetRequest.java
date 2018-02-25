package com.ykcloud.soa.erp.api.so.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

/***
 * 通过条形码获取商品信息请求参数
 * @author bi.cai
 * @date 2018年01月11日 下午10:46:39
 */
public class GoodsByBarcodeGetRequest extends AbstractRequest {

	private static final long serialVersionUID = 7988475632052221318L;

	@NotNull(message = "门店编号不能为空！")
	private Long subUnitNumId;

	@NotBlank(message = "条码不能为空！")
	private String barcode;
	
	@NotNull(message = "会员编号不能为空！")
	private Long usrNumId;

	@NotNull(message = "会员等级不能为空！")
	private Long vipTypeNumId;
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	@NotNull(message = "销售时间不能为空！")
	private Date saleDtme;
	
	
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

	public Long getUsrNumId() {
		return usrNumId;
	}

	public void setUsrNumId(Long usrNumId) {
		this.usrNumId = usrNumId;
	}

	public Long getVipTypeNumId() {
		return vipTypeNumId;
	}

	public void setVipTypeNumId(Long vipTypeNumId) {
		this.vipTypeNumId = vipTypeNumId;
	}

	public Date getSaleDtme() {
		return saleDtme;
	}

	public void setSaleDtme(Date saleDtme) {
		this.saleDtme = saleDtme;
	}
}
