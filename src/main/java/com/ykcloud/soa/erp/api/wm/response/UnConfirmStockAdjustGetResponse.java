package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.wm.model.ContainerInfoForStockCheck;
import java.util.List;

/**
 * @Description: 查询指定日期之前的所有未入账的盈亏单的出参
 * @author: henry.wang
 * @date: 2018/5/3 16:39
 **/
public class UnConfirmStockAdjustGetResponse extends MessagePack {

    private static final long serialVersionUID = -8716207623324225827L;

    private List<String> reservedNos;

    public List<String> getReservedNos() {
        return reservedNos;
    }

    public void setReservedNos(List<String> reservedNos) {
        this.reservedNos = reservedNos;
    }
}
