package com.ykcloud.soa.erp.api.wm.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.wm.model.ImportMoveDtl;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

public class MoveAuditDtlImprotRequest extends AbstractUserSessionRequest {
    @NotNull(message = "移库单号不能为空")
    private String moveNumId;

//    @NotNull(message = "移库日期不能为空！")
//    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
//    private Date moveDate;

    @NotNull(message = "门店编号不能为空")
    private Long subUnitNumId;

    private List<ImportMoveDtl> importMoveDtls;

    public String getMoveNumId() {
        return moveNumId;
    }

    public void setMoveNumId(String moveNumId) {
        this.moveNumId = moveNumId;
    }

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }

    public List<ImportMoveDtl> getImportMoveDtls() {
        return importMoveDtls;
    }

    public void setImportMoveDtls(List<ImportMoveDtl> importMoveDtls) {
        this.importMoveDtls = importMoveDtls;
    }

//    public Date getMoveDate() {
//        return moveDate;
//    }
//
//    public void setMoveDate(Date moveDate) {
//        this.moveDate = moveDate;
//    }
}
