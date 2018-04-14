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
    String typeNumId;
    @NotEmpty(message = "待入账批次流水不能为空！")
    List<FiPhysicalBatchAccountWba> fiPhysicalBatchAccountWbaList;

	Long balaFuncId;




}
