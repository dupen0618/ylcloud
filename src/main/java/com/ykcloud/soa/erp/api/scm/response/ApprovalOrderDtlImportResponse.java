package com.ykcloud.soa.erp.api.scm.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.scm.model.ImportError;

/**
 * 订货审批单excel批量导入
 * @author tz.x
 * @date 2018年5月9日下午2:19:14
 */
public class ApprovalOrderDtlImportResponse extends MessagePack {

	private static final long serialVersionUID = 7565429321373819990L;
	
	/**
	 * 订货审批单导入错误明细
	 */
	private List<ImportError> importErrors;

	public List<ImportError> getImportErrors() {
		return importErrors;
	}

	public void setImportErrors(List<ImportError> importErrors) {
		this.importErrors = importErrors;
	}

}
