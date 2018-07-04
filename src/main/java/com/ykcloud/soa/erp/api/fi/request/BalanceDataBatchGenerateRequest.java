package com.ykcloud.soa.erp.api.fi.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.fi.model.BatchInsertBalance;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

/**
 * @Description:供应商结算生成结算单
 * @author Ali
 * @Date 2018年4月4日 下午1:47:35
 */
public class BalanceDataBatchGenerateRequest extends AbstractUserSessionRequest {

	private static final long serialVersionUID = 4627685577873375711L;

	List<BatchInsertBalance>  batchInsertBalanceList;

	public List<BatchInsertBalance> getBatchInsertBalanceList() {
		return batchInsertBalanceList;
	}

	public void setBatchInsertBalanceList(List<BatchInsertBalance> batchInsertBalanceList) {
		this.batchInsertBalanceList = batchInsertBalanceList;
	}
}
