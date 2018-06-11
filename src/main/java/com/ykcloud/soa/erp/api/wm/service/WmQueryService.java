package com.ykcloud.soa.erp.api.wm.service;

import com.ykcloud.soa.erp.api.wm.request.BackOffRateGetRequest;
import com.ykcloud.soa.erp.api.wm.request.BillInAccountDateGetRequest;
import com.ykcloud.soa.erp.api.wm.request.SupPriceBySeriesGetRequest;
import com.ykcloud.soa.erp.api.wm.response.BackOffRateGetResponse;
import com.ykcloud.soa.erp.api.wm.response.BillInAccountDateGetResponse;
import com.ykcloud.soa.erp.api.wm.response.SupPriceBySeriesGetResponse;

/**
 * @Description: 倒扣率
 * @Author: ALi
 * @Date: 2018/4/18 16:00
 */
public interface WmQueryService {
	
	/**
	 * 获取入账日期（包装）
	 * @author tz.x
	 * @date 2018年6月11日下午7:18:25
	 */
	public BillInAccountDateGetResponse getBillInAccountDate(BillInAccountDateGetRequest request);
	
    //查询倒扣率
    public BackOffRateGetResponse getBackOffRate(BackOffRateGetRequest request);

    //根据批次行号获得采购价格
    public SupPriceBySeriesGetResponse getSupPriceBySeries(SupPriceBySeriesGetRequest request);
}
