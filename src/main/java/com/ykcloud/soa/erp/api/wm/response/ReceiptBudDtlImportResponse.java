/**
 * 
 */
package com.ykcloud.soa.erp.api.wm.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.scm.model.ImportError;

/**
 * @author 殷剑
 *
 */

public class ReceiptBudDtlImportResponse extends MessagePack {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8412759222053439936L;

	/**
	 * 导入错误明细
	 */
	private List<ImportError> importErrors;

	public List<ImportError> getImportErrors() {
		return importErrors;
	}

	public void setImportErrors(List<ImportError> importErrors) {
		this.importErrors = importErrors;
	}

}
