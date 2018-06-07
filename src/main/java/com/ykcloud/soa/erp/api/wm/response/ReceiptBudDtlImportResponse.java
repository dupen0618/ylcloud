/**
 * 
 */
package com.ykcloud.soa.erp.api.wm.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.scm.model.ImportBeginError;
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
	private List<ImportBeginError> importErrors;

	public List<ImportBeginError> getImportErrors() {
		return importErrors;
	}

	public void setImportErrors(List<ImportBeginError> importErrors) {
		this.importErrors = importErrors;
	}

}
