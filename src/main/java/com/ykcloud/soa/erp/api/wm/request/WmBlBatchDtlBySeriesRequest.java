package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

import javax.validation.constraints.NotNull;

public class WmBlBatchDtlBySeriesRequest extends AbstractRequest
{
    private static final long serialVersionUID = 1L;

    private String series;

    @NotNull(message="门店编号不能为空")
    Long subUnitNumId;

    public String getSeries()
    {
        return series;
    }

    public void setSeries(String series)
    {
        this.series = series;
    }

    public Long getSubUnitNumId()
    {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId)
    {
        this.subUnitNumId = subUnitNumId;
    }
}
