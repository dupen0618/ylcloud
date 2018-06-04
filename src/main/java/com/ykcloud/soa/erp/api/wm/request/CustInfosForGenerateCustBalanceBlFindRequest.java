package com.ykcloud.soa.erp.api.wm.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.annotation.ApiField;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;
import java.util.Date;
import javax.validation.constraints.NotNull;

/**
 * @Description: 查询未结算或部分结算的跨子公司的购销商品出库单涉及到的客户id集合的入参
 * @author: henry.wang
 * @date: 2018/6/1 13:55
 **/
public class CustInfosForGenerateCustBalanceBlFindRequest extends AbstractRequest {

    private static final long serialVersionUID = -3101956261800131597L;

    @ApiField(description = "门店编号")
    @NotNull(message = "门店编号不能为空！")
    private Long subUnitNumId;

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }
}
