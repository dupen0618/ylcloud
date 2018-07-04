package com.ykcloud.soa.erp.api.fi.request;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.fi.model.AdjustResultForGenerate;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

/**
 * 代销发出商品成本表头调整请求
 *
 * @author Sealin
 * Created on 2018-06-20
 */
public class FiBlCostAdjustResultRequest extends AbstractUserSessionRequest {
    private static final long serialVersionUID = -4345400777618813092L;
    /**
     * 门店
     */
    @NotNull(message = "门店不可为空")
    private Long subUnitNumId;
    /**
     * 业务类型: <hr /> 1: 代销商品款调整 <hr /> 2: 商品成本调整 <hr /> 3: 发出代销商品调整 <hr /> 4: 发出商品调整 <hr /> 5: 批次进销存调整
     */
    private Long typeNumId;
    private List<AdjustResultForGenerate> adjusts;
    private Date justDate;
    private String remark;

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }

    public Long getTypeNumId() {
        return typeNumId;
    }

    public void setTypeNumId(Long typeNumId) {
        this.typeNumId = typeNumId;
    }

    public List<AdjustResultForGenerate> getAdjusts() {
        return adjusts;
    }

    public void setAdjusts(List<AdjustResultForGenerate> adjusts) {
        this.adjusts = adjusts;
    }

    public Date getJustDate() {
        return justDate;
    }

    public void setJustDate(Date justDate) {
        this.justDate = justDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
