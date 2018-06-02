package com.ykcloud.soa.erp.api.wm.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.annotation.ApiField;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;
import java.util.Date;
import javax.validation.constraints.NotNull;

/**
 * @Description: 查询出库单数据，用于生成购销客户结算单的入参
 * @author: henry.wang
 * @date: 2018/6/1 13:55
 **/
public class ShipInfosForGenerateCustBalanceBlFindRequest extends AbstractRequest {

    private static final long serialVersionUID = -3101956261800131597L;

    @ApiField(description = "结算门店")
    @NotNull(message = "结算门店不能为空！")
    private Long subUnitNumId;

    @ApiField(description = "收货门店")
    @NotNull(message = "收货门店不能为空！")
    private Long custSubUnitNumId;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiField(description = "起始日期")
    @NotNull(message = "起始日期不能为空！")
    private Date beginDate;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiField(description = "结束日期")
    @NotNull(message = "结束日期不能为空！")
    private Date endDate;

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }

    public Long getCustSubUnitNumId() {
        return custSubUnitNumId;
    }

    public void setCustSubUnitNumId(Long custSubUnitNumId) {
        this.custSubUnitNumId = custSubUnitNumId;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
