package com.ykcloud.soa.erp.api.fi.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;
import com.ykcloud.soa.erp.api.fi.model.VirtualWmBlBatchDtl;

import javax.validation.constraints.NotNull;

/**
 * @Author: fred.zhao
 * @Description:
 * @Date: Created in 20:07:2018/5/11
 */
public class VirtualDailyAndMonthCostGenerateRequest extends AbstractRequest {
    private static final long serialVersionUID = -6820833950056653435L;

    @NotNull(message = "虚拟批次数据不能为空！")
    private VirtualWmBlBatchDtl wmBlBatchDtl;

    public VirtualWmBlBatchDtl getWmBlBatchDtl() {
        return wmBlBatchDtl;
    }

    public void setWmBlBatchDtl(VirtualWmBlBatchDtl wmBlBatchDtl) {
        this.wmBlBatchDtl = wmBlBatchDtl;
    }
}
