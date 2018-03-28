package com.ykcloud.soa.erp.api.fi.service;

import com.ykcloud.soa.erp.api.fi.model.ExArcAccountFieldconfig;

import java.util.List;

/**
 * @Author Hewei
 * @Date 2018/3/27 17:10
 */
public interface FiConfigService {
    List<ExArcAccountFieldconfig> getExArcAccountFieldconfigByAccountName(String accountName);
}
