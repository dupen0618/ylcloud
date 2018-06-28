package com.ykcloud.soa.erp.api.scm.request;

import org.hibernate.validator.constraints.NotBlank;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

/**
 * 削价单审核
 * 
 * @author pengh
 *
 */
public class PriceCatAuditRequest extends AbstractUserSessionRequest {

  private static final long serialVersionUID = -5567561237996119331L;
  @NotBlank(message = "单据号不能为空!")
  private String reservedNo;

  public String getReservedNo() {
    return reservedNo;
  }

  public void setReservedNo(String reservedNo) {
    this.reservedNo = reservedNo;
  }

}
