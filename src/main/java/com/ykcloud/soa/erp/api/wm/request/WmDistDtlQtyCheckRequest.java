package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

import javax.validation.constraints.NotNull;

/**
 * @Author: fred.zhao
 * @Description:
 * @Date: Created in 14:34:2018/4/16
 */
public class WmDistDtlQtyCheckRequest extends AbstractRequest {
    private static final long serialVersionUID = -5518647569589469232L;

    @NotNull(message = "门店号不能为空! ")
    private Long subUnitNumId;




}
