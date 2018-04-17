package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

import java.util.List;

/**
 * @Description:生成日报.验收入库，加工，盈亏，损益查询的入参
 * @Author: ALi
 * @Date: 2018/4/13 20:28
 */
public class BalanceDtlByDeductionSelectRequest extends AbstractUserSessionRequest {
    private static final long serialVersionUID = -2565804606566389459L;
    private List<String> servies;

    public List<String> getServies() {
        return servies;
    }

    public void setServies(List<String> servies) {
        this.servies = servies;
    }
}
