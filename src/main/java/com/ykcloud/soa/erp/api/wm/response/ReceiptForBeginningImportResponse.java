package com.ykcloud.soa.erp.api.wm.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.scm.model.ImportError;

/**
 * 期初库存导入
 * @author tz.x
 * @date 2018年6月7日下午4:42:12
 */
public class ReceiptForBeginningImportResponse extends MessagePack {

	private static final long serialVersionUID = 897625451272196992L;
	
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
