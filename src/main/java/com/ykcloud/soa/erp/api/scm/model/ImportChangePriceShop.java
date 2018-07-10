package com.ykcloud.soa.erp.api.scm.model;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotEmpty;

public class ImportChangePriceShop implements Serializable {
	private static final long serialVersionUID = 1L;
	
    @NotEmpty(message="单据不能为空")
	private String reservedId;
	
    @NotEmpty(message="门店简码不能为空")
	private String subUnitId;

	public String getReservedId() {
        return reservedId;
    }

    public void setReservedId(String reservedId) {
        this.reservedId = reservedId;
    }

    public String getSubUnitId() {
		return subUnitId;
	}

	public void setSubUnitId(String subUnitId) {
		this.subUnitId = subUnitId;
	}

}
