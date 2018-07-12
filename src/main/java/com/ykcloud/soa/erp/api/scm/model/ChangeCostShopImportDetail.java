package com.ykcloud.soa.erp.api.scm.model;

import java.io.Serializable;
import java.util.List;

import org.hibernate.validator.constraints.NotBlank;

/**
 * 进价调整单导入明细
 * @author tz.x
 * @date 2018年7月10日上午10:58:00
 */
public class ChangeCostShopImportDetail implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@NotBlank(message  = "调价业务单号不能为空！")
	private String reservedId;
	
	@NotBlank(message = "门店不能为空！")
	private List<String> subUnitIds;

	public String getReservedId() {
		return reservedId;
	}

	public void setReservedId(String reservedId) {
		this.reservedId = reservedId;
	}

	public List<String> getSubUnitIds() {
		return subUnitIds;
	}

	public void setSubUnitIds(List<String> subUnitIds) {
		this.subUnitIds = subUnitIds;
	}


}
