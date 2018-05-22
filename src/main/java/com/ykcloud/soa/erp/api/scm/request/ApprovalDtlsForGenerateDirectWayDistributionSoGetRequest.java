package com.ykcloud.soa.erp.api.scm.request;

import java.util.Date;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class ApprovalDtlsForGenerateDirectWayDistributionSoGetRequest extends AbstractRequest {

	private static final long serialVersionUID = 7988475632052221318L;

	@NotNull(message = "门店编号不能为空！")
	private Long subUnitNumId;

	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	@NotNull(message = "订单日期不能为空！")
	private Date orderDate;

	@NotEmpty(message = "订货审批单编号不能为空！")
	private String approvalNumId;	

	@NotEmpty(message = "订货编号不能为空！")
	private String poNumId;	

	@NotNull(message = "商品编号不能为空！")
	private Long itemNumId;

	@NotNull(message = "商品原产地编号不能为空！")
	private Long productOriginNumId;

	/*@NotNull(message = "价格不能为空！")
	private Double price;

	@NotNull(message = "税率不能为空！")
	private Double taxRate;*/

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getApprovalNumId() {
		return approvalNumId;
	}

	public void setApprovalNumId(String approvalNumId) {
		this.approvalNumId = approvalNumId;
	}

	public Long getItemNumId() {
		return itemNumId;
	}

	public void setItemNumId(Long itemNumId) {
		this.itemNumId = itemNumId;
	}

	public Long getProductOriginNumId() {
		return productOriginNumId;
	}

	public void setProductOriginNumId(Long productOriginNumId) {
		this.productOriginNumId = productOriginNumId;
	}

	public String getPoNumId() {
		return poNumId;
	}

	public void setPoNumId(String poNumId) {
		this.poNumId = poNumId;
	}

	
}
