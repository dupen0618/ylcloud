package com.ykcloud.soa.erp.api.scm.request;

import java.util.List;

import org.hibernate.validator.constraints.NotEmpty;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.scm.model.ChangeCostImportDetail;

/**
 * 进价调整导入
 * @author tz.x
 * @date 2018年7月9日上午9:01:18
 */
public class ChangeCostImportRequest extends AbstractUserSessionRequest {

	private static final long serialVersionUID = -6507433824069644565L;
	
	@NotEmpty(message = "导入明细不能为空！")
	private List<ChangeCostImportDetail> importDetail;

	public List<ChangeCostImportDetail> getImportDetail() {
		return importDetail;
	}

	public void setImportDetail(List<ChangeCostImportDetail> importDetail) {
		this.importDetail = importDetail;
	}

}
