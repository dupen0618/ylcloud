package com.ykcloud.soa.erp.api.scm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

import javax.validation.constraints.NotNull;

/**
 * @Author:ALi
 * @Description: 获得结算周期
 * @Date:
 */
public class SupplyPayTypeIdGetRequest extends AbstractRequest {
    private static final long serialVersionUID = 2380969623708420861L;
    @NotNull(message = "门店编号不能为空！")
    private Long unitNumId;
    @NotNull(message = "供应商不能为空！")
    private Long supplyUnitNumId;

    private String version;//版本

    public Long getUnitNumId() {
        return unitNumId;
    }

    public void setUnitNumId(Long unitNumId) {
        this.unitNumId = unitNumId;
    }

    public Long getSupplyUnitNumId() {
        return supplyUnitNumId;
    }

    public void setSupplyUnitNumId(Long supplyUnitNumId) {
        this.supplyUnitNumId = supplyUnitNumId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
