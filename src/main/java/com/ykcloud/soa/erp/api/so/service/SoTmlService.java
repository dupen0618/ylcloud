package com.ykcloud.soa.erp.api.so.service;

import com.ykcloud.soa.erp.api.so.request.InterlockCollectSelldailyGainAppointRequest;
import com.ykcloud.soa.erp.api.so.request.InterlockCollectSelldailyGainRequest;
import com.ykcloud.soa.erp.api.so.request.InterlockPossibleSupBalanceSelldailyGainRequest;
import com.ykcloud.soa.erp.api.so.request.ItemSellDailyDtlSeriesForRegenerateItemSellDailyGetRequest;
import com.ykcloud.soa.erp.api.so.request.ItemSellDailyDtlStatusNumIdUpdateRequest;
import com.ykcloud.soa.erp.api.so.request.ItemSellDailyHdrAndDtlStatusNumIdUpdateRequest;
import com.ykcloud.soa.erp.api.so.request.ItemSellDailyListForAppointGenerateBalanceGetRequest;
import com.ykcloud.soa.erp.api.so.request.ItemSellDailyListForGenerateBalanceGetRequest;
import com.ykcloud.soa.erp.api.so.request.LastSalePriceGetRequest;
import com.ykcloud.soa.erp.api.so.request.OtOtmlGetRequest;
import com.ykcloud.soa.erp.api.so.request.SalesDailyGenerateRequest;
import com.ykcloud.soa.erp.api.so.request.SalesEndOfDayDtlGenerateRequest;
import com.ykcloud.soa.erp.api.so.request.SupBlanceDtlByItemSellDailyDtlSeriesGetRequest;
import com.ykcloud.soa.erp.api.so.request.SupplyUnitNumIdForJointSaleGetRequest;
import com.ykcloud.soa.erp.api.so.request.TmlDailyGenerateRequest;
import com.ykcloud.soa.erp.api.so.request.TmlProductAmountAndPayAmountCompareRequest;
import com.ykcloud.soa.erp.api.so.request.VoucherNumIdUpdateRequest;
import com.ykcloud.soa.erp.api.so.response.InterlockCollectSelldailyGainAppointResponse;
import com.ykcloud.soa.erp.api.so.response.InterlockCollectSelldailyGainResponse;
import com.ykcloud.soa.erp.api.so.response.InterlockPossibleSupBalanceSelldailyGainResponse;
import com.ykcloud.soa.erp.api.so.response.ItemSellDailyDtlSeriesForRegenerateItemSellDailyGetResponse;
import com.ykcloud.soa.erp.api.so.response.ItemSellDailyDtlStatusNumIdUpdateResponse;
import com.ykcloud.soa.erp.api.so.response.ItemSellDailyHdrAndDtlStatusNumIdUpdateResponse;
import com.ykcloud.soa.erp.api.so.response.ItemSellDailyListForAppointGenerateBalanceGetResponse;
import com.ykcloud.soa.erp.api.so.response.ItemSellDailyListForGenerateBalanceGetResponse;
import com.ykcloud.soa.erp.api.so.response.LastSalePriceGetResponse;
import com.ykcloud.soa.erp.api.so.response.OtOTmlGetResponse;
import com.ykcloud.soa.erp.api.so.response.SalesDailyGenerateResponse;
import com.ykcloud.soa.erp.api.so.response.SalesEndOfDayDtlGenerateResponse;
import com.ykcloud.soa.erp.api.so.response.SupBlanceDtlByItemSellDailyDtlSeriesGetResponse;
import com.ykcloud.soa.erp.api.so.response.SupplyUnitNumIdForJointSaleGetResponse;
import com.ykcloud.soa.erp.api.so.response.TmlDailyGenerateResponse;
import com.ykcloud.soa.erp.api.so.response.TmlProductAmountAndPayAmountCompareRequestCompareResponse;
import com.ykcloud.soa.erp.api.so.response.VoucherNumIdUpdateResponse;

/**
 * @author:shenq
 * @description:销售出库日报Service
 * @date :2018/4/23 - 10:01
 * @version:v1.0
 */
public interface SoTmlService {
	
	/**
	 * 生成销售日期
	 * @author tz.x
	 * @date 2018年6月5日下午12:01:36
	 */
	public SalesEndOfDayDtlGenerateResponse generateSalesEndOfDay(SalesEndOfDayDtlGenerateRequest request);



    /**
     * 根据销售小票生成销售出库日报
     * @author shenq
     * @param request
     * @return
     */
    public SalesDailyGenerateResponse generateSalesDaily(SalesDailyGenerateRequest request);


    public ItemSellDailyListForGenerateBalanceGetResponse getItemSellDailyListForGenerateBalance(ItemSellDailyListForGenerateBalanceGetRequest request);

    public ItemSellDailyDtlStatusNumIdUpdateResponse updateItemSellDailyDtlStatusNumId(ItemSellDailyDtlStatusNumIdUpdateRequest request);

    public ItemSellDailyHdrAndDtlStatusNumIdUpdateResponse updateItemSellDailyHdrAndDtlStatusNumId(ItemSellDailyHdrAndDtlStatusNumIdUpdateRequest request);

    public SupBlanceDtlByItemSellDailyDtlSeriesGetResponse getSupBlanceDtlByItemSellDailyDtlSeries(SupBlanceDtlByItemSellDailyDtlSeriesGetRequest request);
    
    public ItemSellDailyDtlSeriesForRegenerateItemSellDailyGetResponse getItemSellDailyDtlSeriesForRegenerateItemSellDaily(ItemSellDailyDtlSeriesForRegenerateItemSellDailyGetRequest request);
    
    public SupplyUnitNumIdForJointSaleGetResponse getSupplyUnitNumIdForJointSale(SupplyUnitNumIdForJointSaleGetRequest request);
    
    //public SalesDailyGenerateResponse getItemSellDaily(SalesDailyGenerateRequest request);

    //生成小票
    public TmlDailyGenerateResponse generateTmlDaily(TmlDailyGenerateRequest request);
    
    //查询oto发货小票信息
    public OtOTmlGetResponse getOtOTmlList(OtOtmlGetRequest request);
    
    //回写凭证单号
    public VoucherNumIdUpdateResponse updateVoucherNumId(VoucherNumIdUpdateRequest request);
    
    //比较价格
    public TmlProductAmountAndPayAmountCompareRequestCompareResponse compareTmlProductAmountAndPayAmount(TmlProductAmountAndPayAmountCompareRequest request);

    /***
     * 计算商品最后一次售价（计算七天內最底价,若七天内无销售计算最近一次售价）
     * @param request
     * @author pengh
     * @return
     */
    public LastSalePriceGetResponse getLastSalePrice(LastSalePriceGetRequest request);
     /**
      * @author alfred.liu
      * @date 2018/6/27 14:55
      * @description 获取联销汇总日报信息
      */
    public InterlockCollectSelldailyGainResponse gainInterlockCollectSelldaily(InterlockCollectSelldailyGainRequest request);

     /**
      * @author alfred.liu
      * @date 2018/6/27 16:42
      * @description 获取指定联销日报信息
      */
    public ItemSellDailyListForAppointGenerateBalanceGetResponse getItemSellDailyListForAppointGenerateBalance(
            ItemSellDailyListForAppointGenerateBalanceGetRequest request);

     /**
      * @author alfred.liu
      * @date 2018/6/28 11:11
      * @description 获取指定联销未结算日报信息汇总
      */
    public InterlockCollectSelldailyGainAppointResponse gainAppointInterlockCollectSelldaily(InterlockCollectSelldailyGainAppointRequest request);

     /**
      * @author alfred.liu
      * @date 2018/7/3 19:49
      * @description 获取销售日报需要结算的供应商
      */
    public InterlockPossibleSupBalanceSelldailyGainResponse gainInterlockPossibleSupBalanceSelldaily(InterlockPossibleSupBalanceSelldailyGainRequest request);
}
