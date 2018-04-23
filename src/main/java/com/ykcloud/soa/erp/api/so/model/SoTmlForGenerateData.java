package com.ykcloud.soa.erp.api.so.model;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: fred.zhao
 * @Description: 查询小票model
 * @Date: Created in 20:41:2018/4/19
 */
public class SoTmlForGenerateData implements Serializable {

    private static final long serialVersionUID = 5962718377947834162L;

    private List<SoTmlHdrForGenerateData> soTmlHdrList;

    public List<SoTmlHdrForGenerateData> getSoTmlHdrList() {
        return soTmlHdrList;
    }

    public void setSoTmlHdrList(List<SoTmlHdrForGenerateData> soTmlHdrList) {
        this.soTmlHdrList = soTmlHdrList;
    }
}
