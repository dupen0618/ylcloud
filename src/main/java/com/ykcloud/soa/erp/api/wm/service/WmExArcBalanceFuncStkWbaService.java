package com.ykcloud.soa.erp.api.wm.service;

import com.ykcloud.soa.erp.api.wm.model.ExArcBalanceFuncStkWba;

import java.util.List;

/**
 * @Author Hewei
 * @Date 2018/4/2 16:17
 */
public interface WmExArcBalanceFuncStkWbaService {
    List<ExArcBalanceFuncStkWba> getExArcBalanceFuncStkWba(String billTypeNum);
}
