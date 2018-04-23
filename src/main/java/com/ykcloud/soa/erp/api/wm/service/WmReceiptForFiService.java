package com.ykcloud.soa.erp.api.wm.service;


import com.ykcloud.soa.erp.api.wm.request.BalanceAuditForLossDtlStatusSelectRequest;
import com.ykcloud.soa.erp.api.wm.request.BalanceAuditForReceiptDtlStatusSelectRequest;
import com.ykcloud.soa.erp.api.wm.request.BalanceAuditForSellDailyDtlStatusSelectRequest;
import com.ykcloud.soa.erp.api.wm.request.BalanceAuditForStockadJustDtlStatusSelectRequest;
import com.ykcloud.soa.erp.api.wm.request.BalanceAuditForWorkRawDtlStatusSelectRequest;
import com.ykcloud.soa.erp.api.wm.request.BalanceDtlByDeductionSelectRequest;
import com.ykcloud.soa.erp.api.wm.request.LoseDtlDataGetRequest;
import com.ykcloud.soa.erp.api.wm.request.LossDtlByBalanceSelectRequest;
import com.ykcloud.soa.erp.api.wm.request.LossHdrSeriesGetRequest;
import com.ykcloud.soa.erp.api.wm.request.LossHdrStatusUpdateRequest;
import com.ykcloud.soa.erp.api.wm.request.LossSeriesGetRequest;
import com.ykcloud.soa.erp.api.wm.request.LossStatusUpdateRequest;
import com.ykcloud.soa.erp.api.wm.request.ReceiptForFiGetRequest;
import com.ykcloud.soa.erp.api.wm.request.ReceiptHdrSeriesGetRequest;
import com.ykcloud.soa.erp.api.wm.request.ReceiptHdrStatusUpdateRequest;
import com.ykcloud.soa.erp.api.wm.request.ReceiptSeriesGetRequest;
import com.ykcloud.soa.erp.api.wm.request.ReceiptStatusUpdateRequest;
import com.ykcloud.soa.erp.api.wm.request.SellDailyHdrSeriesGetRequest;
import com.ykcloud.soa.erp.api.wm.request.SellDailyHdrStatusUpdateRequest;
import com.ykcloud.soa.erp.api.wm.request.StockadJustDataGetRequest;
import com.ykcloud.soa.erp.api.wm.request.StockadJustHdrSeriesGetRequest;
import com.ykcloud.soa.erp.api.wm.request.StockadJustHdrStatusUpdateRequest;
import com.ykcloud.soa.erp.api.wm.request.StockadJustSelectRequest;
import com.ykcloud.soa.erp.api.wm.request.StockadJustSeriesGetRequest;
import com.ykcloud.soa.erp.api.wm.request.StockadJustStatusGetRequest;
import com.ykcloud.soa.erp.api.wm.request.WorkRawBatchDataGetRequest;
import com.ykcloud.soa.erp.api.wm.request.WorkRawDtlSelectRequest;
import com.ykcloud.soa.erp.api.wm.request.WorkRawHdrSeriesGetRequest;
import com.ykcloud.soa.erp.api.wm.request.WorkRawHdrStatusUpdateRequest;
import com.ykcloud.soa.erp.api.wm.request.WorkRawSeriesGetRequest;
import com.ykcloud.soa.erp.api.wm.request.WorkRawStatusGetRequest;
import com.ykcloud.soa.erp.api.wm.response.BalanceAuditForLossDtlStatusSelectResponse;
import com.ykcloud.soa.erp.api.wm.response.BalanceAuditForReceiptDtlStatusSelectResponse;
import com.ykcloud.soa.erp.api.wm.response.BalanceAuditForSellDailyDtlStatusSelectResponse;
import com.ykcloud.soa.erp.api.wm.response.BalanceAuditForStockadJustDtlStatusSelectResponse;
import com.ykcloud.soa.erp.api.wm.response.BalanceAuditForWorkRawDtlStatusSelectResponse;
import com.ykcloud.soa.erp.api.wm.response.BalanceDtlByDeductionSelectResponse;
import com.ykcloud.soa.erp.api.wm.response.LossDtlByBalanceSelectResponse;
import com.ykcloud.soa.erp.api.wm.response.LossDtlDataGetResponse;
import com.ykcloud.soa.erp.api.wm.response.LossHdrSeriesGetResponse;
import com.ykcloud.soa.erp.api.wm.response.LossHdrStatusUpdateResponse;
import com.ykcloud.soa.erp.api.wm.response.LossSeriesGetResponse;
import com.ykcloud.soa.erp.api.wm.response.LossStatusUpdateResponse;
import com.ykcloud.soa.erp.api.wm.response.ReceiptForFiGetResponse;
import com.ykcloud.soa.erp.api.wm.response.ReceiptHdrSeriesGetResponse;
import com.ykcloud.soa.erp.api.wm.response.ReceiptHdrStatusUpdateResponse;
import com.ykcloud.soa.erp.api.wm.response.ReceiptSeriesGetResponse;
import com.ykcloud.soa.erp.api.wm.response.ReceiptStatusUpdateResponse;
import com.ykcloud.soa.erp.api.wm.response.SellDailyHdrSeriesGetResponse;
import com.ykcloud.soa.erp.api.wm.response.SellDailyHdrStatusUpdateResponse;
import com.ykcloud.soa.erp.api.wm.response.StockadJustDataGetResponse;
import com.ykcloud.soa.erp.api.wm.response.StockadJustHdrSeriesGetResponse;
import com.ykcloud.soa.erp.api.wm.response.StockadJustHdrStatusUpdateResponse;
import com.ykcloud.soa.erp.api.wm.response.StockadJustSelectResponse;
import com.ykcloud.soa.erp.api.wm.response.StockadJustSeriesGetResponse;
import com.ykcloud.soa.erp.api.wm.response.StockadJustStatusGetResponse;
import com.ykcloud.soa.erp.api.wm.response.WorkRawBatchDataGetResponse;
import com.ykcloud.soa.erp.api.wm.response.WorkRawDtlSelectResponse;
import com.ykcloud.soa.erp.api.wm.response.WorkRawHdrSeriesGetResponse;
import com.ykcloud.soa.erp.api.wm.response.WorkRawHdrStatusUpdateResponse;
import com.ykcloud.soa.erp.api.wm.response.WorkRawSeriesGetResqonse;
import com.ykcloud.soa.erp.api.wm.response.WorkRawStatusGetResponse;

/**
 * @Description:
 * @author Song
 * @Date 2018年4月8日 下午4:50:36
 */
public interface WmReceiptForFiService {

	//验收入库获取数据，供财务调用接口()
	public ReceiptForFiGetResponse getReceiptForBalance(ReceiptForFiGetRequest request);
	
	//取结算数据，插入数据之后原表中商品状态改变
	public ReceiptStatusUpdateResponse updateStatusForBalance(ReceiptStatusUpdateRequest request);

	//得到验收入库的行号
	public ReceiptSeriesGetResponse getBalanceDtlByReceipt(ReceiptSeriesGetRequest request);
	
	//选择指定验收入库单明细项目生成结算明细
	public BalanceDtlByDeductionSelectResponse selectBalanceDtlByDeduction(BalanceDtlByDeductionSelectRequest request);
	
	//结算单审核,改变验收入库单表头的状态
	public ReceiptHdrStatusUpdateResponse updateHdrStatusForBalance(ReceiptHdrStatusUpdateRequest request);
	
	//结算单审核，得到验收入库表头的行号
	public ReceiptHdrSeriesGetResponse getBalanceHdrByReceipt(ReceiptHdrSeriesGetRequest request);
	
	//结算单审核查询损益单明细表的状态
	public BalanceAuditForReceiptDtlStatusSelectResponse selectReceiptDtlStatus (BalanceAuditForReceiptDtlStatusSelectRequest request);

	
	
	//损益单获取数据
	public LossDtlDataGetResponse getLoseDtlData(LoseDtlDataGetRequest request);
	
	//改变损益单结算后的状态
	public LossStatusUpdateResponse updateLossStatus(LossStatusUpdateRequest request);
	
	//得到损益单行号
	public LossSeriesGetResponse getLossSeries(LossSeriesGetRequest request);
	
	//选择指定损益单明细生成结算单
	public LossDtlByBalanceSelectResponse selectLossDtlByBalance(LossDtlByBalanceSelectRequest request);
	
	//结算单审核,改变损益单单表头的状态
	public LossHdrStatusUpdateResponse updateLossHdrStatus(LossHdrStatusUpdateRequest request);
	
	//结算单审核，得到损益单表头的行号
	public LossHdrSeriesGetResponse getLossHdrSeries(LossHdrSeriesGetRequest request);

	//结算单审核查询损益单明细表的状态(审核)
	public BalanceAuditForLossDtlStatusSelectResponse selectLossDtlStatus (BalanceAuditForLossDtlStatusSelectRequest request);

	

	//盈亏单获取数据
	public StockadJustDataGetResponse getStockadJustData(StockadJustDataGetRequest request);
	
	//改变盈亏单结算后的状态
	public StockadJustStatusGetResponse updateStockadJustStatus(StockadJustStatusGetRequest request);
	
	//获得盈亏单行号
	public StockadJustSeriesGetResponse getStockadJustSeries(StockadJustSeriesGetRequest request);
	
	//选择指定的盈亏单明细生成结算单
	public StockadJustSelectResponse selectStockadJust(StockadJustSelectRequest request);
	
	//结算单审核,改变验盈亏单表头的状态
	public StockadJustHdrStatusUpdateResponse updateStockadJustHdrStatus(StockadJustHdrStatusUpdateRequest request);
	
	//结算单审核，得到盈亏单表头的行号
	public StockadJustHdrSeriesGetResponse getStockadJustHdrSeries(StockadJustHdrSeriesGetRequest request);

	//结算单审核查询盈亏单明细表的状态
	public BalanceAuditForStockadJustDtlStatusSelectResponse selectStockadJustDtlStatus (BalanceAuditForStockadJustDtlStatusSelectRequest request);

	
	
	//加工单获取数据
	public WorkRawBatchDataGetResponse getWorkRawBatchData(WorkRawBatchDataGetRequest request);
	
	//改变加工单结算后的状态
	public WorkRawStatusGetResponse updateWorkRawStatus(WorkRawStatusGetRequest request);
	
	//获取加工单行号
	public WorkRawSeriesGetResqonse getWorkRawSeries(WorkRawSeriesGetRequest request);
	
	//选择指定的加工单明细生成结算单
	public WorkRawDtlSelectResponse selectWorkRawDtl(WorkRawDtlSelectRequest request);
	
	//结算单审核,改变验加工单表头的状态
	public WorkRawHdrStatusUpdateResponse updateWorkRawHdrStatus(WorkRawHdrStatusUpdateRequest request);
	
	//结算单审核，得到加工单表头的行号
	public WorkRawHdrSeriesGetResponse getWorkRawHdrSeries(WorkRawHdrSeriesGetRequest request);

	//结算单审核查询加工单明细表的状态
	public BalanceAuditForWorkRawDtlStatusSelectResponse selectWorkRawDtlStatus (BalanceAuditForWorkRawDtlStatusSelectRequest request);
	
	
	
	//结算单审核,改变销售日报单表头的状态
	public SellDailyHdrStatusUpdateResponse updateSellDailyHdrStatus(SellDailyHdrStatusUpdateRequest request);
	
	//结算单审核，得到销售日报表头的行号
	public SellDailyHdrSeriesGetResponse getSellDailyHdrSeries(SellDailyHdrSeriesGetRequest request);

	//结算单审核查询销售日报明细表的状态
	public BalanceAuditForSellDailyDtlStatusSelectResponse selectSellDailyDtlStatus (BalanceAuditForSellDailyDtlStatusSelectRequest request);

}
