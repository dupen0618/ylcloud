package com.ykcloud.soa.erp.api.so.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

/**
 * @Author: fred.zhao
 * @Description:
 * @Date: Created in 10:18:2018/4/25
 */
public class SoTmlBalanceSignUpdateRequest extends AbstractUserSessionRequest{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotNull(message = "销售门店编号不能为空！")
    private Long subUnitNumId;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @NotNull(message = "销售日期不能为空！")
    private Date orderDate;

    @NotNull(message = "销售小票单号不能为空！")
    private List<String> tmlNumIds;


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

    public List<String> getTmlNumIds() {
        return tmlNumIds;
    }

    public void setTmlNumIds(List<String> tmlNumIds) {
        this.tmlNumIds = tmlNumIds;
    }
}
