package com.ykcloud.soa.erp.api.wm.request;

import java.util.Date;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

/**
 * 
 * @author Dan
 * @date 2018年3月21日
 */
public class WmWlBcHdrGetRequest extends AbstractRequest {

	private static final long serialVersionUID = 5406829904473382550L;

	@Length(min = 6, max = 6, message = "请出入后六位！")
	private String wlbc;

	@NotNull(message = "门店ID不能为空! ")
	private Long subUnitNumId;

	private Date orderDate;

	public String getWlbc() {
		return wlbc;
	}

	public void setWlbc(String wlbc) {
		this.wlbc = wlbc;
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

}
