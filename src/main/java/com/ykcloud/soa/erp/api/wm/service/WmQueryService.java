package com.ykcloud.soa.erp.api.wm.service;

import com.ykcloud.soa.erp.api.wm.request.BackOffRateGetRequest;
import com.ykcloud.soa.erp.api.wm.request.BillInAccountDateGetRequest;
import com.ykcloud.soa.erp.api.wm.request.SalesDateGetRequest;
import com.ykcloud.soa.erp.api.wm.request.SupPriceBySeriesGetRequest;
import com.ykcloud.soa.erp.api.wm.request.TaxRateByFirstBatchSeriesGetRequest;
import com.ykcloud.soa.erp.api.wm.response.BackOffRateGetResponse;
import com.ykcloud.soa.erp.api.wm.response.BillInAccountDateGetResponse;
import com.ykcloud.soa.erp.api.wm.response.SalesDateGetResponse;
import com.ykcloud.soa.erp.api.wm.response.SupPriceBySeriesGetResponse;
import com.ykcloud.soa.erp.api.wm.response.TaxRateByFirstBatchSeriesGetResponse;

/**
 * @Description: 倒扣率
 * @Author: ALi
 * @Date: 2018/4/18 16:00
 */
public interface WmQueryService {
	
	/**
	 * 获取入账日期（提供获取移动加权价服务）
	 * @author tz.x
	 * @date 2018年6月11日下午7:18:25
	 */
	public SalesDateGetResponse getSalesDate(SalesDateGetRequest request);
	
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

     /**
      * @author alfred.liu
      * @date 2018/6/20 20:18
      * @description 根据首次入库批次行号获取税额
      */
    TaxRateByFirstBatchSeriesGetResponse getTaxRateByFirstBatchSeries(TaxRateByFirstBatchSeriesGetRequest request);

}
