package com.ykcloud.soa.erp.api.scm.service;

import com.ykcloud.soa.erp.api.scm.request.ScmBlChangeCostRequest;
import com.ykcloud.soa.erp.api.scm.response.ScmBlChangeCostResponse;

 /**
  * @author alfred
  * @date 2018/5/14 21:29
  * @description
  */
public interface ScmBlChangeCostService
{
     /**
      * @author alfred
      * @date 2018/5/14 21:30
      * @description 调整库存成本金额
      */
     public ScmBlChangeCostResponse adjustWmInventoryCost(ScmBlChangeCostRequest request);
}
