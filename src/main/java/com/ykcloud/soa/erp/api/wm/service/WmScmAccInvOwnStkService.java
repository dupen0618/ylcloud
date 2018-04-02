package com.ykcloud.soa.erp.api.wm.service;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.wm.model.ScmAccInvOwnStk;

/**
 * @Author Hewei
 * @Date 2018/4/2 16:52
 */
public interface WmScmAccInvOwnStkService {
    ScmAccInvOwnStk selectOne(Long tenantNumId, Long subUnitNumId, Long dataSign, Long storageNumId, Long itemNumId, Long divNumId);

    MessagePack modifyScmAccInvOwnStkService(boolean exists, ScmAccInvOwnStk scmAccInvOwnStk);
}
