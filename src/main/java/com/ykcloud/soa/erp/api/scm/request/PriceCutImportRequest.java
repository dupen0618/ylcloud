package com.ykcloud.soa.erp.api.scm.request;

import java.util.List;
import org.hibernate.validator.constraints.NotEmpty;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.scm.model.ImportPriceCut;

/**
 * 削价excel导入
 * @author pengh
 *
 */
public class PriceCutImportRequest extends AbstractUserSessionRequest {

	private static final long serialVersionUID = -5567561237996119331L;
	
	@NotEmpty(message = "导入明细不能为空！")
	public List<ImportPriceCut> importPriceCuts;

    public List<ImportPriceCut> getImportPriceCuts() {
        return importPriceCuts;
    }

    public void setImportPriceCuts(List<ImportPriceCut> importPriceCuts) {
        this.importPriceCuts = importPriceCuts;
    }
		
}
