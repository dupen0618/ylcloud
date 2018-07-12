package com.ykcloud.soa.erp.api.scm.response;

import java.util.List;
import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.scm.model.ImportPriceCutError;

/**
 * 削价excel导入
 * @author pengh
 *
 */
public class PriceCutImportResponse extends MessagePack {

	private static final long serialVersionUID = 5870545387046291226L;
	
	public List<ImportPriceCutError> importPriceCutErrors;

    public List<ImportPriceCutError> getImportPriceCutErrors() {
        return importPriceCutErrors;
    }

    public void setImportPriceCutErrors(List<ImportPriceCutError> importPriceCutErrors) {
        this.importPriceCutErrors = importPriceCutErrors;
    } 
	
	
}
