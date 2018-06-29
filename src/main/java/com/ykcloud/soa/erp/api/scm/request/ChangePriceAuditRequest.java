package com.ykcloud.soa.erp.api.scm.request;

import org.hibernate.validator.constraints.NotBlank;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

/**
 * 售价(临时/永久)调整审核请求参数
 * 
 * @author pengh
 *
 */
public class ChangePriceAuditRequest extends AbstractUserSessionRequest {

  private static final long serialVersionUID = -5567561237996119331L;

  @NotBlank(message = "商品单据不能为空！")
  private String reservedNo;

  public String getReservedNo() {
    return reservedNo;
  }

  public void setReservedNo(String reservedNo) {
    this.reservedNo = reservedNo;
  }



}
