package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.wm.model.AdjustForGenerateResult;

import java.util.List;

/**
 * 成本调整表
 *
 * @author Sealin
 * @date 2018-07-02
 */
public class CostAdjustResponse extends MessagePack {
    private List<AdjustForGenerateResult> adjusts;

    public List<AdjustForGenerateResult> getAdjusts() {
        return adjusts;
    }

    public void setAdjusts(List<AdjustForGenerateResult> adjusts) {
        this.adjusts = adjusts;
    }
}
