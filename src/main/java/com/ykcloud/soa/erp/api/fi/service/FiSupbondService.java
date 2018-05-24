package com.ykcloud.soa.erp.api.fi.service;


import com.ykcloud.soa.erp.api.fi.request.EarnestMoneyRequest;
import com.ykcloud.soa.erp.api.fi.response.EarnestMoneyResponse;

/**
  * @author alfred.liu
  * @date 2018/5/24 11:13
  * @description
  */

public interface FiSupbondService {
     /**
      * @author alfred.liu
      * @date 2018/5/24 11:20
      * @description 保证金审核
      */
     public EarnestMoneyResponse audit(EarnestMoneyRequest request);

 }
