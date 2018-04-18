package com.ykcloud.soa.erp.api.so.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * 
 * @author gaoyun.shen
 *
 * @date 2018年4月19日 下午3:41:21 
 * 
 * @Description 根据申请单号获取原出库单号入参
 */
public class SoOriginReservedNoRequest  extends AbstractUserSessionRequest{
    private static final long serialVersionUID = 5128298133224977007L;
    @NotNull(message = "门店编号不能为空!")
    private Long subUnitNumId;

    @NotNull(message = "退回仓库申请单号不能为空！")
    private String applyNumId;

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }

    public String getApplyNumId() {
        return applyNumId;
    }

    public void setApplyNumId(String applyNumId) {
        this.applyNumId = applyNumId;
    }
}
