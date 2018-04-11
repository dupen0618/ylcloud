package com.ykcloud.soa.erp.api.scm.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

/**
 * 配送生成so后更新配送审批单状态并回填审批单单身so_num_id入参
 * @author tz.x
 *
 * @date 2018年4月8日上午11:05:13
 */
public class ApprovalStatusNumIdAndSoNumIdUpdateRequest extends AbstractUserSessionRequest {

	private static final long serialVersionUID = -6094319484295198360L;
	

	@NotNull(message = "门店编号不能为空！")
	private Long subUnitNumId;

	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	@NotNull(message = "订单日期不能为空！")
	private Date orderDate;

	@NotEmpty(message = "配送审批单单号不能为空！")
	private String approvalNumId;
	
	@NotEmpty(message = "配送订单号不能为空！")
	private String soNumId;
	
	@NotEmpty(message = "配送审批单行号不能为空！")
	private String series;

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public String getSoNumId() {
		return soNumId;
	}

	public void setSoNumId(String soNumId) {
		this.soNumId = soNumId;
	}

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
	
	


}
