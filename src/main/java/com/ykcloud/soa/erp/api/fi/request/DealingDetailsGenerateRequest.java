package com.ykcloud.soa.erp.api.fi.request;

import java.util.List;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.fi.model.FiBlDealingsDtl;
import com.ykcloud.soa.erp.api.fi.model.FiBlDealingsHdr;
import com.ykcloud.soa.erp.api.fi.model.FiBlDealingsItemDtl;

/**
 * 库存金额调整后生成供应商往来明细
 * @author tz.x
 * @date 2018年5月17日下午2:11:56
 */
public class DealingDetailsGenerateRequest extends AbstractUserSessionRequest {

	private static final long serialVersionUID = 843005124841286194L;
	
	private List<FiBlDealingsHdr> fiBlDealingsHdrs;
	
	private List<FiBlDealingsDtl> fiBlDealingsDtls;
	
	private List<FiBlDealingsItemDtl> fiBlDealingsItemDtls;

	public List<FiBlDealingsHdr> getFiBlDealingsHdrs() {
		return fiBlDealingsHdrs;
	}

	public void setFiBlDealingsHdrs(List<FiBlDealingsHdr> fiBlDealingsHdrs) {
		this.fiBlDealingsHdrs = fiBlDealingsHdrs;
	}

	public List<FiBlDealingsDtl> getFiBlDealingsDtls() {
		return fiBlDealingsDtls;
	}

	public void setFiBlDealingsDtls(List<FiBlDealingsDtl> fiBlDealingsDtls) {
		this.fiBlDealingsDtls = fiBlDealingsDtls;
	}

	public List<FiBlDealingsItemDtl> getFiBlDealingsItemDtls() {
		return fiBlDealingsItemDtls;
	}

	public void setFiBlDealingsItemDtls(List<FiBlDealingsItemDtl> fiBlDealingsItemDtls) {
		this.fiBlDealingsItemDtls = fiBlDealingsItemDtls;
	}

}
