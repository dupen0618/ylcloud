package com.ykcloud.soa.erp.api.scm.request;

import java.util.List;

import org.hibernate.validator.constraints.NotEmpty;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.scm.model.ChangeCostImportDetail;
import com.ykcloud.soa.erp.api.scm.model.ChangeCostShopImportDetail;

/**
 * 进价调整导入
 * @author tz.x
 * @date 2018年7月9日上午9:01:18
 */
public class ChangeCostImportRequest extends AbstractUserSessionRequest {

	private static final long serialVersionUID = -6507433824069644565L;
	
	@NotEmpty(message = "进价调整单明细不能为空！")
	private List<ChangeCostImportDetail> costImportDetail;
	
	@NotEmpty(message = "适用机构明细不能为空！")
	private List<ChangeCostShopImportDetail> costShopImportDetail;

	public List<ChangeCostImportDetail> getCostImportDetail() {
		return costImportDetail;
	}

	public void setCostImportDetail(List<ChangeCostImportDetail> costImportDetail) {
		this.costImportDetail = costImportDetail;
	}

	public List<ChangeCostShopImportDetail> getCostShopImportDetail() {
		return costShopImportDetail;
	}

	public void setCostShopImportDetail(List<ChangeCostShopImportDetail> costShopImportDetail) {
		this.costShopImportDetail = costShopImportDetail;
	}


}
