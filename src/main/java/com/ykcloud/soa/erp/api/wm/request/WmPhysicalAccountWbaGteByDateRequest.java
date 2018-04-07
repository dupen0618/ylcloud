package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

import java.util.Date;

/**
 * Created by yiako on 2018/4/2
 */
public class WmPhysicalAccountWbaGteByDateRequest extends AbstractRequest {

    private Date recDate;

    public Date getRecDate() {
        return recDate;
    }

    public void setRecDate(Date recDate) {
        this.recDate = recDate;
    }
}