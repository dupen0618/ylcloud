package com.ykcloud.soa.erp.api.fi.request;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.fi.model.FiPhysicalBatchAccountWba;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @Author Hewei
 * @Date 2018/4/10 11:31
 */
public class ReceiptInAccountRequest extends AbstractUserSessionRequest {
	private static final long serialVersionUID = 1L;

	@NotNull(message = "单据类型不能为空！")
	Long typeNum;
	@NotEmpty(message = "待入账批次流水不能为空！")
	List<FiPhysicalBatchAccountWba> fiPhysicalBatchAccountWbaList;

	Long balaFuncId;

	public Long getTypeNum() {
		return typeNum;
	}

	public void setTypeNum(Long typeNum) {
		this.typeNum = typeNum;
	}

	public List<FiPhysicalBatchAccountWba> getFiPhysicalBatchAccountWbaList() {
		return fiPhysicalBatchAccountWbaList;
	}

	public void setFiPhysicalBatchAccountWbaList(List<FiPhysicalBatchAccountWba> fiPhysicalBatchAccountWbaList) {
		this.fiPhysicalBatchAccountWbaList = fiPhysicalBatchAccountWbaList;
	}

	public Long getBalaFuncId() {
		return balaFuncId;
	}

	public void setBalaFuncId(Long balaFuncId) {
		this.balaFuncId = balaFuncId;
	}


	
}
