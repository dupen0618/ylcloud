package com.ykcloud.soa.erp.api.so.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.scm.model.ImportError;

/**
 * 店间调拨批量导入
 * @author tz.x
 * @date 2018年5月14日下午2:39:18
 */
public class ShopTransferDtlImportResponse extends MessagePack {

	private static final long serialVersionUID = 1367566408501787000L;
	
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
