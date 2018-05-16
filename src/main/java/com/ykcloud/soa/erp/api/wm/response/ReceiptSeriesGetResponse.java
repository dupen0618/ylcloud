package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.wm.model.SupBalanceDtl;

import java.util.List;

/**
 * @Description: 验收入库查询出参
 * @Author: song
 * @Date: 2018/4/13 20:49
 */
public class ReceiptSeriesGetResponse  extends MessagePack {
    private static final long serialVersionUID = -3708825331021090125L;
      private    List<SupBalanceDtl>  wmSellDailies;

        public List<SupBalanceDtl> getWmSellDailies() {
            return wmSellDailies;
        }

        public void setWmSellDailies(List<SupBalanceDtl> wmSellDailies) {
            this.wmSellDailies = wmSellDailies;
        }
}
