package com.ykcloud.soa.erp.api.fi.request;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.wm.model.WmBlCostAdjustDtl;
import com.ykcloud.soa.erp.api.wm.model.WmBlCostAdjustHdr;

import java.util.List;

/**
 * 代销发出商品成本表头调整请求
 *
 * @author Sealin
 * Created on 2018-06-20
 */
public class FiBlCostAdjustResultRequest extends AbstractUserSessionRequest {
    private static final long serialVersionUID = -8101216458775583463L;
    private WmBlCostAdjustHdr wmBlCostAdjustHdr;
    private List<WmBlCostAdjustDtl> wmBlCostAdjustDtls;

    /**
     * 获取 wmBlCostAdjustHdr
     *
     * @author Sealin
     */
    public WmBlCostAdjustHdr getWmBlCostAdjustHdr() {
        return wmBlCostAdjustHdr;
    }

    /**
     * 设置 wmBlCostAdjustHdr
     *
     * @author Sealin
     */
    public void setWmBlCostAdjustHdr(WmBlCostAdjustHdr wmBlCostAdjustHdr) {
        this.wmBlCostAdjustHdr = wmBlCostAdjustHdr;
    }

    /**
     * 获取 wmBlCostAdjustDtls
     *
     * @author Sealin
     */
    public List<WmBlCostAdjustDtl> getWmBlCostAdjustDtls() {
        return wmBlCostAdjustDtls;
    }

    /**
     * 设置 wmBlCostAdjustDtls
     *
     * @author Sealin
     */
    public void setWmBlCostAdjustDtls(List<WmBlCostAdjustDtl> wmBlCostAdjustDtls) {
        this.wmBlCostAdjustDtls = wmBlCostAdjustDtls;
    }
}
