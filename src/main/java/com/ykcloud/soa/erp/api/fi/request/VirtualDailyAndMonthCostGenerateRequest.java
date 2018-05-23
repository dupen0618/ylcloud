package com.ykcloud.soa.erp.api.fi.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.fi.model.VirtualWmBlBatchDtl;

import javax.validation.constraints.NotNull;

/**
 * @Author: fred.zhao
 * @Description:
 * @Date: Created in 20:07:2018/5/11
 */
public class VirtualDailyAndMonthCostGenerateRequest extends AbstractUserSessionRequest {
    private static final long serialVersionUID = -6820833950056653435L;
    
    @NotNull(message = "销售价格不能为空！")
    private Double tradePrice;
    
    @NotNull(message = "虚拟批次数据不能为空！")
    private VirtualWmBlBatchDtl wmBlBatchDtl;

    public Double getTradePrice() {
		return tradePrice;
	}

	public void setTradePrice(Double tradePrice) {
		this.tradePrice = tradePrice;
	}

	public VirtualWmBlBatchDtl getWmBlBatchDtl() {
        return wmBlBatchDtl;
    }

    public void setWmBlBatchDtl(VirtualWmBlBatchDtl wmBlBatchDtl) {
        this.wmBlBatchDtl = wmBlBatchDtl;
    }
}
