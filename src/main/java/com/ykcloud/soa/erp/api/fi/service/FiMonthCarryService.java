package com.ykcloud.soa.erp.api.fi.service;

import com.ykcloud.soa.erp.api.fi.request.MonthCarryRequest;
import com.ykcloud.soa.erp.api.fi.response.MonthCarryResponse;

/**
  * @author alfred.liu
  * @date 2018/6/5 16:38
  * @description  财务月结服务
  */
public interface FiMonthCarryService {
     /**
      * @author alfred.liu
      * @date 2018/6/5 16:48
      * @description  财务科目余额结转
      */
    public MonthCarryResponse carryMonth(MonthCarryRequest request);
}
