package com.ykcloud.soa.erp.api.scm.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.scm.model.ChangeCostImportErrors;

/**
 * 进价调整导入
 * @author tz.x
 * @date 2018年7月9日上午8:59:07
 */
public class ChangeCostImportResponse extends MessagePack {

	private static final long serialVersionUID = 480549888453609169L;
	
	/**
	 * 导入错误明细
	 */
	private List<ChangeCostImportErrors> importErrors;

	public List<ChangeCostImportErrors> getImportErrors() {
		return importErrors;
	}

	public void setImportErrors(List<ChangeCostImportErrors> importErrors) {
		this.importErrors = importErrors;
	}
	

}
