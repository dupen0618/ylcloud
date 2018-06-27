package com.ykcloud.soa.erp.api.scm.service;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.scm.request.*;
import com.ykcloud.soa.erp.api.scm.response.*;

public interface ScmSupplyService {
  
	//获得直通门店供货商订货周期
  	public DirectWayReplenishweeklyDayFlagGetResponse getDirectWayReplenishweeklyDayFlag(DirectWayReplenishweeklyDayFlagGetRequest Request);

  	//查询直送门店的供应商订货周期、有效天数
  	public DirectDeliveryReplenishweeklyDayFlagAndEffectiveDayGetResponse  getDirectDeliveryReplenishweeklyDayFlagAndEffectiveDay(
  			DirectDeliveryReplenishweeklyDayFlagAndEffectiveDayGetRequest request);

  	//根据供应商找到对应的采购协议
	public ProtocolBackOffRateGetResponse getProtocolBackOffRate(
			ProtocolBackOffRateGetRequest request);

	//获得结算周期
	public SupplyPayTypeIdGetResponse getSupplyPayTypeId(SupplyPayTypeIdGetRequest Request);
	
	/**
	 * 
	 * @description 上传基础数据到证照系统中间库
	 * @author gaoyun.shen
	 * @date: 2018年5月2日 下午8:05:33
	 * @param 
	 * @return
	 */
	public MessagePack uploadBaseInfoTask(UploadBaseInfoTaskRequest request);


	AuditSupplyResponse auditSupply(AuditSupplyRequest request);

	ScmBlContractResponse importSupplyContract(ScmBlContractRequest request);
}
