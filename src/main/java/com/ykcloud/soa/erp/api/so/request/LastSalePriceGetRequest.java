package com.ykcloud.soa.erp.api.so.request;

import java.util.Date;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

/**
 * 计算商品最后售价接口入参
 * 
 * @author pengh
 *
 */
public class LastSalePriceGetRequest extends AbstractRequest {

    private static final long serialVersionUID = 7988475632052221318L;
    /**
     * 门店编号
     */
    @NotNull(message = "门店编号不能为空")
    private Long subUnitNumId;

    @NotNull(message = "结算日期不能为空")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date carryDate;

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }

    public Date getCarryDate() {
        return carryDate;
    }

    public void setCarryDate(Date carryDate) {
        this.carryDate = carryDate;
    }
    
}
