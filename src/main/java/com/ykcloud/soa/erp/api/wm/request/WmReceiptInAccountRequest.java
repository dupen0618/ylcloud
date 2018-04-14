package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

import javax.validation.constraints.NotNull;

/**
 * @Author Hewei
 * @Date 2018/4/10 9:49
 */
public class WmReceiptInAccountRequest extends AbstractUserSessionRequest {
	private static final long serialVersionUID = 1L;

	@NotNull(message = "订单编号不能为空！")
    private String reservedNo;
    
	@NotNull(message = "单据类型不能为空！")
    private Long typeNum;

    private Long balaFuncId;
    
    public String getReservedNo() {
        return reservedNo;
    }

    public void setReservedNo(String reservedNo) {
        this.reservedNo = reservedNo;
    }

	public Long getTypeNum() {
		return typeNum;
	}

	public void setTypeNum(Long typeNum) {
		this.typeNum = typeNum;
	}

	public Long getBalaFuncId() {
		return balaFuncId;
	}

	public void setBalaFuncId(Long balaFuncId) {
		this.balaFuncId = balaFuncId;
	}


    
}
