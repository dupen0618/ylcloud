package com.ykcloud.soa.erp.api.fi.request;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.fi.model.AccEmitForSupplyGenerate;

import java.util.List;

/**
 * 调整总部发出商品
 *
 * @author Sealin Created on 2018-06-23
 */
public class FiAccEmitGenerateSupplyRequest extends AbstractUserSessionRequest {
    private static final long serialVersionUID = -4234234063320202708L;
    /**
     * 门店
     */
    private Long subUnitNumId;
    /**
     * 供应商门店
     */
    private Long supplyUnitNumId;
    private Long typeNumId;
    private List<AccEmitForSupplyGenerate> adjusts;

    /**
     * 获取 subUnitNumId
     *
     * @author Sealin
     */
    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    /**
     * 设置 subUnitNumId
     *
     * @author Sealin
     */
    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }

    /**
     * 获取 supplyUnitNumId
     *
     * @author Sealin
     */
    public Long getSupplyUnitNumId() {
        return supplyUnitNumId;
    }

    /**
     * 设置 supplyUnitNumId
     *
     * @author Sealin
     */
    public void setSupplyUnitNumId(Long supplyUnitNumId) {
        this.supplyUnitNumId = supplyUnitNumId;
    }

    /**
     * 获取 adjusts
     *
     * @author Sealin
     */
    public List<AccEmitForSupplyGenerate> getAdjusts() {
        return adjusts;
    }

    /**
     * 设置 adjusts
     *
     * @author Sealin
     */
    public void setAdjusts(List<AccEmitForSupplyGenerate> adjusts) {
        this.adjusts = adjusts;
    }

    public Long getTypeNumId() {
        return typeNumId;
    }

    public void setTypeNumId(Long typeNumId) {
        this.typeNumId = typeNumId;
    }
}
