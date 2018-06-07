package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.wm.model.WmBlStockadjustBatchDtl;
import java.util.List;

/**
 * @Description: 查询盈亏单带批次代销商品明细，用于核销代销商品款的出参
 * @author: henry.wang
 * @date: 2018/6/6 16:34
 **/
public class StockadjustBatchDtlsForCheckConsignmentProductAccountFindResponse extends MessagePack {

    private static final long serialVersionUID = -8716207623324225827L;

    private List<WmBlStockadjustBatchDtl> batchDtls;

    public List<WmBlStockadjustBatchDtl> getBatchDtls() {
        return batchDtls;
    }

    public void setBatchDtls(
        List<WmBlStockadjustBatchDtl> batchDtls) {
        this.batchDtls = batchDtls;
    }
}
