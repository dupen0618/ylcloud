package com.ykcloud.soa.erp.api.scm.response;

import java.util.List;
import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.scm.model.ImportChangePriceError;

/**
 * 调价excel导入
 * @author pengh
 *
 */
public class ChangePriceImportResponse extends MessagePack {

	private static final long serialVersionUID = 5870545387046291226L;

	/**
     * 导入错误对像
     */
    public List<ImportChangePriceError> importErrors;

    public List<ImportChangePriceError> getImportErrors() {
        return importErrors;
    }

    public void setImportErrors(List<ImportChangePriceError> importErrors) {
        this.importErrors = importErrors;
    }
    
    
}
