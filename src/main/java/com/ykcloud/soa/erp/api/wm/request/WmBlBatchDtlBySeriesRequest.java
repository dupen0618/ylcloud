package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class WmBlBatchDtlBySeriesRequest extends AbstractRequest
{
    private static final long serialVersionUID = 1L;

    private String series;

    public String getSeries()
    {
        return series;
    }

    public void setSeries(String series)
    {
        this.series = series;
    }
}
