package com.ykcloud.soa.erp.api.wm.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.wm.model.WmCollectShipSellDailyDtl;

/**
 * @author:shenq
 * @description:代销获取COSTAMOUNT
 * @date :2018/5/3 - 20:37
 * @version:v1.0
 */
public class SellDailyCollectResponse extends MessagePack {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * 出库日报汇总信息
     */
    private List<WmCollectShipSellDailyDtl> collectSellDaily;
    
	public List<WmCollectShipSellDailyDtl> getCollectSellDaily() {
		return collectSellDaily;
	}
	public void setCollectSellDaily(List<WmCollectShipSellDailyDtl> collectSellDaily) {
		this.collectSellDaily = collectSellDaily;
	}

    
}
