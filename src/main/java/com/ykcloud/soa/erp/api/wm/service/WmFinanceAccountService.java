package com.ykcloud.soa.erp.api.wm.service;

import com.ykcloud.soa.erp.api.wm.request.ReceiptFinanceAccountUpdateRequest;
import com.ykcloud.soa.erp.api.wm.response.ReceiptFinanceAccountUpdateResponse;

/**
*Wm财务帐处理服务类
@author hank.zhu
@date 2018年4月13日 下午4:44:54 新建
**/
public interface WmFinanceAccountService {
	
	/**
	 *@Description: 仓库收货,财务帐处理   ;在验收单验收复核完成后,业务帐处理完后,通过消息调用触发
	 *@Auther hank
	 *@Date 2018-4-13
	 *@param request{subUnitNumId,reservedNo,userNumId}
	 *@return response{}
	 */
	public ReceiptFinanceAccountUpdateResponse updateReceiptFinanceAccount(ReceiptFinanceAccountUpdateRequest request);
	/**
	 *@Description: 仓库收货,财务帐处理   ;在验收单验收复核完成后,业务帐处理完后,通过消息调用触发  不用TCC
	 *@Auther hank
	 *@Date 2018-4-13
	 *@param request{subUnitNumId,reservedNo,userNumId}
	 *@return response{}
	 */
	public ReceiptFinanceAccountUpdateResponse updateReceiptFinanceAccountWithNoTransaction(ReceiptFinanceAccountUpdateRequest request);
}
