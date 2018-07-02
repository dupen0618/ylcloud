package com.ykcloud.soa.erp.api.wm.service;

import com.ykcloud.soa.erp.api.wm.request.MoveAuditDtlImprotRequest;
import com.ykcloud.soa.erp.api.wm.request.MoveAuditReuqest;
import com.ykcloud.soa.erp.api.wm.response.MoveAuditDtlImprotResponse;
import com.ykcloud.soa.erp.api.wm.response.MoveAuditRespnse;

public interface WmBlMoveService {
	//移库审核，就是移库处理的过程
	public MoveAuditRespnse auditMove(MoveAuditReuqest request);

	//移库单据Excle导入
	public MoveAuditDtlImprotResponse  improtMoveAuditDtl(MoveAuditDtlImprotRequest request);
}
