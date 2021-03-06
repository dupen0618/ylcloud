package com.ykcloud.soa.erp.api.wm.service;

import com.ykcloud.soa.erp.api.wm.request.ReceiptInventoryAccountUpdateRequest;
import com.ykcloud.soa.erp.api.wm.response.ReceiptInventoryAccountUpdateResponse;

/**
*Wm业务帐处理服务类
@author hank.zhu
@date 2018年4月12日 上午7:09:13 新建
**/
public interface WmInventoryAccountService {

	/**
	 *@Description: 仓库收货,业务帐处理   ;在验收单验收复核完成后,通过消息调用触发
	 *@Auther hank
	 *@Date 2018-4-12
	 *@param request{subUnitNumId,reservedNo,userNumId}
	 *@return response{}
	 */
	public ReceiptInventoryAccountUpdateResponse updateReceiptInventoryAccount(ReceiptInventoryAccountUpdateRequest request);
	
	/**
	 * 
	 * @description 收货完成，处理可用库存和批次，采用顺序消息
	 * @author gaoyun.shen
	 * @date: 2018年5月14日 下午3:56:01
	 * @param 
	 * @return
	 */
	public ReceiptInventoryAccountUpdateResponse updateReceiptInventoryAccountWithOrderFlowMessage(ReceiptInventoryAccountUpdateRequest request);
	
	
	/**
	 *@Description: 仓库收货,业务帐处理   ;在验收单验收复核完成后,通过消息调用触发  不带TCC
	 *@Auther hank
	 *@Date 2018-4-12
	 *@param request{subUnitNumId,reservedNo,userNumId}
	 *@return response{}
	 */
	public ReceiptInventoryAccountUpdateResponse updateReceiptInventoryAccountWithNoTransaction(ReceiptInventoryAccountUpdateRequest request);
	
	/**
	 * 
	 * @description 
	 * @author gaoyun.shen
	 * @date: 2018年4月19日 下午6:01:30
	 * @param 
	 * @return
	 */
	public ReceiptInventoryAccountUpdateResponse updateReserveReceiptInventoryAccount(ReceiptInventoryAccountUpdateRequest request);
	
	
	

}
