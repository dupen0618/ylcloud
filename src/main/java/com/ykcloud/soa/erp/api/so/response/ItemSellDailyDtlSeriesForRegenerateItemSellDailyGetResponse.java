package com.ykcloud.soa.erp.api.so.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.fi.model.BillDtlForWriteBackStatus;

public class ItemSellDailyDtlSeriesForRegenerateItemSellDailyGetResponse extends MessagePack{

	private static final long serialVersionUID = 1754628776443434936L;

	private BillDtlForWriteBackStatus billDtlForWriteBackStatus;

    public BillDtlForWriteBackStatus getBillDtlForWriteBackStatus() {
        return billDtlForWriteBackStatus;
    }

    public void setBillDtlForWriteBackStatus(BillDtlForWriteBackStatus billDtlForWriteBackStatus) {
        this.billDtlForWriteBackStatus = billDtlForWriteBackStatus;
    }
}
