package com.ykcloud.soa.erp.api.so.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.so.model.SoTmlDtlForGenerateData;
import com.ykcloud.soa.erp.api.so.model.SoTmlHdrForGenerateData;
import com.ykcloud.soa.erp.api.so.model.SoTmlLockForGenerateData;

import java.util.List;

/**
 * @Author: fred.zhao
 * @Description:
 * @Date: Created in 15:04:2018/4/19
 */
public class SoTmlHdrLimitGetResponse extends MessagePack {

    private static final long serialVersionUID = 5979766755811279757L;

    private List<SoTmlHdrForGenerateData> tmlHdrList;

    private List<SoTmlDtlForGenerateData> soTmlDtlList;

    private List<SoTmlLockForGenerateData> lockTmlList;

    public List<SoTmlLockForGenerateData> getLockTmlList() {
        return lockTmlList;
    }

    public void setLockTmlList(List<SoTmlLockForGenerateData> lockTmlList) {
        this.lockTmlList = lockTmlList;
    }

    public List<SoTmlDtlForGenerateData> getSoTmlDtlList() {
        return soTmlDtlList;
    }

    public void setSoTmlDtlList(List<SoTmlDtlForGenerateData> soTmlDtlList) {
        this.soTmlDtlList = soTmlDtlList;
    }

    public List<SoTmlHdrForGenerateData> getTmlHdrList() {
        return tmlHdrList;
    }

    public void setTmlHdrList(List<SoTmlHdrForGenerateData> tmlHdrList) {
        this.tmlHdrList = tmlHdrList;
    }
}
