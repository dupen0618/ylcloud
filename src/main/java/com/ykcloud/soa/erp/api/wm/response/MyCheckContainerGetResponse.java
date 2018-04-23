package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.wm.model.ContainerInfoForStockCheck;
import java.util.List;

/**
 * @Description: 查询当前人盘点的货架列表的出参
 * @author: henry.wang
 * @date: 2018/4/23 14:21
 **/
public class MyCheckContainerGetResponse extends MessagePack {

    private static final long serialVersionUID = -8716207623324225827L;

    private List<ContainerInfoForStockCheck> containerList;

    public List<ContainerInfoForStockCheck> getContainerList() {
        return containerList;
    }

    public void setContainerList(
        List<ContainerInfoForStockCheck> containerList) {
        this.containerList = containerList;
    }
}
