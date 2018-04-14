package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

import javax.validation.constraints.NotNull;

/**
 * Created by yiako on 2018/4/2
 */
public class UsableInventoryByReservedNoGetRequest extends AbstractRequest{

	private static final long serialVersionUID = 1L;
	@NotNull(message = "单据编号不能为空！")
    String reservedNo;
    
	@NotNull(message = "业务类型编号不能为空！")
    String billTypeNum;
    
	@NotNull(message = "单据类型不能为空！")
    Long typeNum;
    
	@NotNull(message = "入账类型不能为空！")
    String accountName;


	public String getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	}

	public String getBillTypeNum() {
        return billTypeNum;
    }

    public void setBillTypeNum(String billTypeNum) {
        this.billTypeNum = billTypeNum;
    }

    public Long getTypeNum() {
        return typeNum;
    }

    public void setTypeNum(Long typeNum) {
        this.typeNum = typeNum;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
}
