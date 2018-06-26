package com.ykcloud.soa.erp.api.scm.request;

import javax.validation.constraints.NotNull;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

/**
 * 售价(临时/永久)调整审核请求参数
 * 
 * @author pengh
 *
 */
public class ChangeVipPriceAuditRequest extends AbstractUserSessionRequest {

  private static final long serialVersionUID = -5567561237996119331L;

  @NotNull(message = "商品单据不能为空！")
  private Long reservedNo;

  @NotNull(message = "调整类型不能为空！")
  private Long typeNumId;

  public Long getReservedNo() {
    return reservedNo;
  }

  public void setReservedNo(Long reservedNo) {
    this.reservedNo = reservedNo;
  }

  public Long getTypeNumId() {
    return typeNumId;
  }

  public void setTypeNumId(Long typeNumId) {
    this.typeNumId = typeNumId;
  }


}
