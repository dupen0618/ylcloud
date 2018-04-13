package com.ykcloud.soa.erp.api.so.request;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.annotation.ApiField;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.so.model.ApplyDetail;

/**
 * 产生退货so回写退审批单后再回写退货申请单so_num_id及订单数量 入参
 * @author tz.x
 *
 * @date 2018年4月12日上午10:42:44
 */
public class ReturnApplyAfterGenerateReturnSoUpdateRequest extends AbstractUserSessionRequest {

	private static final long serialVersionUID = 8658023881247190522L;
	
	@NotNull(message = "门店编号不能为空！")
	@ApiField(description = "门店编号")
	private Long subUnitNumId;

	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	@NotNull(message = "订单日期不能为空！")
	@ApiField(description = "订单日期")
	private Date orderDate;

	@NotEmpty(message = "退货申请单号不能为空！")
	@ApiField(description = "退货申请单号")
	private String applyNumId;
	
	@NotEmpty(message = "申请单明细不能为空！")
	private List<ApplyDetail> applyDetail;

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

	public String getApplyNumId() {
		return applyNumId;
	}

	public void setApplyNumId(String applyNumId) {
		this.applyNumId = applyNumId;
	}

	public List<ApplyDetail> getApplyDetail() {
		return applyDetail;
	}

	public void setApplyDetail(List<ApplyDetail> applyDetail) {
		this.applyDetail = applyDetail;
	}

}
