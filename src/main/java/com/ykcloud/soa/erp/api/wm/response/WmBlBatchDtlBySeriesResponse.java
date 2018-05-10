package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.wm.model.WM_BL_BATCH_DTL_API;

public class WmBlBatchDtlBySeriesResponse extends MessagePack
{
    private static final long serialVersionUID = 1L;

    private WM_BL_BATCH_DTL_API wm_bl_batch_dtl_api;

    public WM_BL_BATCH_DTL_API getWm_bl_batch_dtl_api()
    {
        return wm_bl_batch_dtl_api;
    }

    public void setWm_bl_batch_dtl_api(WM_BL_BATCH_DTL_API wm_bl_batch_dtl_api)
    {
        this.wm_bl_batch_dtl_api = wm_bl_batch_dtl_api;
    }
}
