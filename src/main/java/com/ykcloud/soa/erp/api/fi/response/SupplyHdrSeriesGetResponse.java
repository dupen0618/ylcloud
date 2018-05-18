package com.ykcloud.soa.erp.api.fi.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.wm.model.SupBalanceDtl;

public class SupplyHdrSeriesGetResponse extends MessagePack{

	private static final long serialVersionUID = 5770751933938319056L;
	
	private List<SupBalanceDtl>  wmSellDailies;

    public List<SupBalanceDtl> getWmSellDailies() {
        return wmSellDailies;
    }

    public void setWmSellDailies(List<SupBalanceDtl> wmSellDailies) {
        this.wmSellDailies = wmSellDailies;
    }
}
