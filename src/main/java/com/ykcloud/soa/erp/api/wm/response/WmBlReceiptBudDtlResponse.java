package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.fi.model.WmBlReceiptBudDtl;

import java.util.List;

/**
 * @Author Hewei
 * @Date 2018/5/23 14:45
 */
public class WmBlReceiptBudDtlResponse extends MessagePack {
    private static final long serialVersionUID = 5670454578932790574L;

    List<WmBlReceiptBudDtl> wmBlReceiptBudDtlList;

    public List<WmBlReceiptBudDtl> getWmBlReceiptBudDtlList() {
        return wmBlReceiptBudDtlList;
    }

    public void setWmBlReceiptBudDtlList(List<WmBlReceiptBudDtl> wmBlReceiptBudDtlList) {
        this.wmBlReceiptBudDtlList = wmBlReceiptBudDtlList;
    }
}
