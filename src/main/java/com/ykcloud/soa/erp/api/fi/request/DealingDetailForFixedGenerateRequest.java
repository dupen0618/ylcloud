package com.ykcloud.soa.erp.api.fi.request;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.fi.model.FiBlDealingsDtl;
import com.ykcloud.soa.erp.api.fi.model.FiBlDealingsHdr;
import com.ykcloud.soa.erp.api.fi.model.FiBlDealingsItemDtl;

/**
 * @Description:
 * @author Song
 * @Date 2018年5月19日 下午3:58:12
 */
public class DealingDetailForFixedGenerateRequest extends AbstractUserSessionRequest{

	private static final long serialVersionUID = -8626173176652849783L;
	
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
