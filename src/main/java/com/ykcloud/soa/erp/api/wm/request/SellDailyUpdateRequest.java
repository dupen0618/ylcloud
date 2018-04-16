package com.ykcloud.soa.erp.api.wm.request;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import java.util.List;

/**
 * @Description:销售日报出库修改
 * @Author: ALi
 * @Date: 2018/4/13 20:28
 */
public class SellDailyUpdateRequest extends AbstractUserSessionRequest {
    private static final long serialVersionUID = -2565804606566389459L;
    private List<String> servies;
    private  Long flagStatus;//修改状态

    public List<String> getServies() {
        return servies;
    }

    public void setServies(List<String> servies) {
        this.servies = servies;
    }

    public Long getFlagStatus() {
        return flagStatus;
    }

    public void setFlagStatus(Long flagStatus) {
        this.flagStatus = flagStatus;
    }
}
