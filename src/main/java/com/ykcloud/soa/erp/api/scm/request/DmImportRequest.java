package com.ykcloud.soa.erp.api.scm.request;

import java.util.List;
import org.hibernate.validator.constraints.NotEmpty;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.scm.model.ImportDm;

/**
 * DM促销excel导入
 * @author pengh
 *
 */
public class DmImportRequest extends AbstractUserSessionRequest {

	private static final long serialVersionUID = -5567561237996119331L;
	
	@NotEmpty(message = "导入明细不能为空！")
	public List<ImportDm> importDms;

    public List<ImportDm> getImportDms() {
        return importDms;
    }

    public void setImportDms(List<ImportDm> importDms) {
        this.importDms = importDms;
    }
	
	
}
