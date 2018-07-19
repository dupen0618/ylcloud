package com.ykcloud.soa.erp.api.sync.request;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import javax.validation.constraints.NotNull;

/**
 * @className:
 * @description:
 * @author: kevin.xiong
 */
public class FulfillDecreasePromotionSynRequest extends AbstractUserSessionRequest {

  private static final long serialVersionUID = 1397063663046123240L;

  //如果重复导入1不报错，0要报错
  @NotNull(message = "重复导入跳过标识不能为空!")
  private Long skipSign;

  public Long getSkipSign() {
    return skipSign;
  }

  public void setSkipSign(Long skipSign) {
    this.skipSign = skipSign;
  }
}
