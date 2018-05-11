package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

import javax.validation.constraints.NotNull;

/**
 * fakir
 * 2018/4/17
 */
public class WorkProductAndBomIDGetRequest extends AbstractRequest {
    private static final long serialVersionUID = 1L;

    @NotNull(message = "商品编码不能为空")
    private Long ItemNumId;
    @NotNull(message = "业务类型不能为空")
    private long typeNumId;
    @NotNull(message = "门店编号不能为空")
    private Long subUnitNumId;

    public Long getItemNumId() {
        return ItemNumId;
    }

    public void setItemNumId(Long itemNumId) {
        ItemNumId = itemNumId;
    }

    public long getTypeNumId() {
        return typeNumId;
    }

    public void setTypeNumId(long typeNumId) {
        this.typeNumId = typeNumId;
    }

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }
}
