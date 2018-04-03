package com.ykcloud.soa.erp.api.fi.service;

import com.ykcloud.soa.erp.api.fi.model.ExArcAccountFieldconfig;

import java.util.List;

/**
 * @Author Hewei
 * @Date 2018/4/2 16:40
 */
public interface FiExArcAccountFieldconfigService {
    List<ExArcAccountFieldconfig> getExArcAccountFieldconfigByAccountName(String accountName);
}
