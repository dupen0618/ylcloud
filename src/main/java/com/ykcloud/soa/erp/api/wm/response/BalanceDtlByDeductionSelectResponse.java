package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.wm.model.WmSellDaily;

import java.util.List;

/**
 * @Description: 验收入库查询出参
 * @Author: ALi
 * @Date: 2018/4/13 20:49
 */
public class BalanceDtlByDeductionSelectResponse  extends MessagePack {
    private static final long serialVersionUID = -3708825331021090125L;
      private    List<WmSellDaily>  wmSellDailies;

        public List<WmSellDaily> getWmSellDailies() {
            return wmSellDailies;
        }

        public void setWmSellDailies(List<WmSellDaily> wmSellDailies) {
            this.wmSellDailies = wmSellDailies;
        }
}
