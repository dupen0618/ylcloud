package com.ykcloud.soa.erp.api.wm.service;

import com.ykcloud.soa.erp.api.fi.model.ExArcAccountFieldconfig;

import java.util.List;

public interface FiExArcAccountFieldconfigTwoService {

    List<ExArcAccountFieldconfig> getExArcAccountFieldconfigByAccountName(String accountName, Long dataSign);
}
