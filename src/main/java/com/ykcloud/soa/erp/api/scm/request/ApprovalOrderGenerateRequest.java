/**   
 * 功能描述：
 * @Package: com.ykcloud.soa.erp.api.scm.request 
 * @author: fred.zhao  
 * @date: 2018年3月12日 上午11:00:45 
 */
package com.ykcloud.soa.erp.api.scm.request;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

/**
 * @ClassName: GenerateApprovalOrderGetRequest.java
 * @Description: 补货申请单生成订货审批单request
 * @version: v1.0.0
 * @author: fred.zhao
 * @date: 2018年3月12日 上午11:00:45
 */
public class ApprovalOrderGenerateRequest extends AbstractRequest {

	private static final long serialVersionUID = 1L;

	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date orderDate;// 日期，格式：yyyy-mm-dd


	@NotNull
	private Long onlyFdc;// 1:只集生鲜商品(16:00集生鲜商品用,0:不限定 1：限定生鲜)

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Long getOnlyFdc() {
		return onlyFdc;
	}

	public void setOnlyFdc(Long onlyFdc) {
		this.onlyFdc = onlyFdc;
	}

}
