package com.ykcloud.soa.erp.api.wm.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

/**
 * @Description:生成日报查询的入参
 * @Author: ALi
 * @Date: 2018/4/13 20:28
 */
public class SellDailyBySeriesGetRequest extends AbstractUserSessionRequest {
    private static final long serialVersionUID = -2565804606566389459L;
   private List<String> servies;

    public List<String> getServies() {
        return servies;
    }

    public void setServies(List<String> servies) {
        this.servies = servies;
    }
}
