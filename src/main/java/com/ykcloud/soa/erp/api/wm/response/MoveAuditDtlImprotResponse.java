package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.scm.model.ImportError;
import com.ykcloud.soa.erp.api.wm.model.ImportMoveError;

import java.util.List;

public class MoveAuditDtlImprotResponse extends MessagePack {

    private static final long serialVersionUID = 7565429321373819990L;

    /**
     * 移库单导入错误明细
     */
    private List<ImportMoveError> importMoveErrors;

    public List<ImportMoveError> getImportMoveErrors() {
        return importMoveErrors;
    }

    public void setImportMoveErrors(List<ImportMoveError> importMoveErrors) {
        this.importMoveErrors = importMoveErrors;
    }
}
