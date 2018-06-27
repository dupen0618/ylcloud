package com.ykcloud.soa.erp.api.scm.request;

import javax.validation.constraints.NotNull;
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

  @NotNull(message = "调整类型不能为空！")
  private Long typeNumId;

  public String getReservedNo() {
    return reservedNo;
  }

  public void setReservedNo(String reservedNo) {
    this.reservedNo = reservedNo;
  }

  public Long getTypeNumId() {
    return typeNumId;
  }

  public void setTypeNumId(Long typeNumId) {
    this.typeNumId = typeNumId;
  }


}
