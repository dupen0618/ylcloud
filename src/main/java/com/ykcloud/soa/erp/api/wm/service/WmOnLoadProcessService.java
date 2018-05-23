package com.ykcloud.soa.erp.api.wm.service;

import com.ykcloud.soa.erp.api.wm.request.WmOnLoadProcessRequest;
import com.ykcloud.soa.erp.api.wm.response.WmOnLoadProcessResponse;

import java.lang.reflect.InvocationTargetException;

/**
 * @Author Hewei
 * @Date 2018/5/17 11:13
 */
//物理仓在途库存处理
public interface WmOnLoadProcessService {
    //物理仓月进销存出库在途处理
    WmOnLoadProcessResponse PhysicalMonthShipOnLoadProcess(WmOnLoadProcessRequest request);

    //物理仓月进销存入库在途处理
    WmOnLoadProcessResponse PhysicalMonthReceiptOnLoadProcess(WmOnLoadProcessRequest request);
}
