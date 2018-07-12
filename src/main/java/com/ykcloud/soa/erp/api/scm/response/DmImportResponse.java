package com.ykcloud.soa.erp.api.scm.response;

import java.util.List;
import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.scm.model.ImportDmError;

/**
 * DM促销excel导入
 * @author pengh
 *
 */
public class DmImportResponse extends MessagePack {

	private static final long serialVersionUID = 5870545387046291226L;
	
	private List<ImportDmError> importDmErrors;

    public List<ImportDmError> getImportDmErrors() {
        return importDmErrors;
    }

    public void setImportDmErrors(List<ImportDmError> importDmErrors) {
        this.importDmErrors = importDmErrors;
    }
	
	
} 
