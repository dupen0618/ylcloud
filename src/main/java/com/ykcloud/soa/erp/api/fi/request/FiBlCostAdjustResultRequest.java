package com.ykcloud.soa.erp.api.fi.request;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * 代销发出商品成本表头调整请求
 *
 * @author Sealin
 * Created on 2018-06-20
 */
public class FiBlCostAdjustResultRequest extends AbstractUserSessionRequest {
    private static final long serialVersionUID = -6020133431531325456L;
    /**
     * 门店
     */
    @NotNull(message = "门店不可为空")
    private Long subUnitNumId;
    /**
     * 调整单号
     */
    @NotNull(message = "调整单号不可为空")
    private String adjustReversedNo;
    /**
     * 调整日期
     */
    @NotNull(message = "调整日期不可为空")
    private Date justDate;
    /**
     * 业务类型: <hr />
     * 1: 代销商品款调整 <hr />
     * 2: 商品成本调整 <hr />
     * 3: 发出代销商品调整 <hr />
     * 4: 发出商品调整 <hr />
     * 5: 批次进销存调整
     */

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }

    public String getAdjustReversedNo() {
        return adjustReversedNo;
    }

    public void setAdjustReversedNo(String adjustReversedNo) {
        this.adjustReversedNo = adjustReversedNo;
    }

    public Date getJustDate() {
        return justDate;
    }

    public void setJustDate(Date justDate) {
        this.justDate = justDate;
    }
}
