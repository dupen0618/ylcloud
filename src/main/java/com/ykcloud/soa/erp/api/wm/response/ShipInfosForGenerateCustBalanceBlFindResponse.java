package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.wm.model.ShipInfoForGenerateCustBalanceBl;
import java.util.List;

/**
 * @Description: 查询出库单数据，用于生成购销客户结算单的出参
 * @author: henry.wang
 * @date: 2018/6/1 14:03
 **/
public class ShipInfosForGenerateCustBalanceBlFindResponse extends MessagePack {

    private static final long serialVersionUID = -8716207623324225827L;

    private List<ShipInfoForGenerateCustBalanceBl> shipInfos;

    public List<ShipInfoForGenerateCustBalanceBl> getShipInfos() {
        return shipInfos;
    }

    public void setShipInfos(
        List<ShipInfoForGenerateCustBalanceBl> shipInfos) {
        this.shipInfos = shipInfos;
    }
}
