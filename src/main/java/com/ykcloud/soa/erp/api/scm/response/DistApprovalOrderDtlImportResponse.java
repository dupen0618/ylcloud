package com.ykcloud.soa.erp.api.scm.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.scm.model.ImportError;

/**
 * 批量导入配送审批单excel
 * @author tz.x
 * @date 2018年5月14日上午9:29:38
 */
public class DistApprovalOrderDtlImportResponse extends MessagePack {

	private static final long serialVersionUID = 6726715354328207882L;
	
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
