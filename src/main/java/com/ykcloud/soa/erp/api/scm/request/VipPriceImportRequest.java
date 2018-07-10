package com.ykcloud.soa.erp.api.scm.request;


import java.util.List;
import org.hibernate.validator.constraints.NotEmpty;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.scm.model.ImportChangePrice;
import com.ykcloud.soa.erp.api.scm.model.ImportChangePriceShop;

/**
 * 会员调价excel导入
 * @author pengh
 *
 */
public class VipPriceImportRequest extends AbstractUserSessionRequest {

	private static final long serialVersionUID = -5567561237996119331L;
	
	@NotEmpty(message = "导入明细不能为空！")
	public List<ImportChangePrice> importChangePrices;
	
	@NotEmpty(message = "执行门店不能为空！")
	public List<ImportChangePriceShop> importChangePriceShops;

    public List<ImportChangePrice> getImportChangePrices() {
        return importChangePrices;
    }

    public void setImportChangePrices(List<ImportChangePrice> importChangePrices) {
        this.importChangePrices = importChangePrices;
    }

    public List<ImportChangePriceShop> getImportChangePriceShops() {
        return importChangePriceShops;
    }

    public void setImportChangePriceShops(List<ImportChangePriceShop> importChangePriceShops) {
        this.importChangePriceShops = importChangePriceShops;
    }
	
	
	
}
