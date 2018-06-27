package com.ykcloud.soa.erp.api.fi.service;
import com.ykcloud.soa.erp.api.fi.request.AppointBalanceBillDtlGenerateRequest;
import com.ykcloud.soa.erp.api.fi.request.AppointForSupBalanceDtlDeleteRequest;
import com.ykcloud.soa.erp.api.fi.request.BalanceDataBatchGenerateRequest;
import com.ykcloud.soa.erp.api.fi.request.BalanceDataGenerateRequest;
import com.ykcloud.soa.erp.api.fi.request.NotBalanceBillGetRequest;
import com.ykcloud.soa.erp.api.fi.response.AppointBalanceBillDtlGenerateResponse;
import com.ykcloud.soa.erp.api.fi.response.AppointForSupBalanceDtlDeleteResponse;
import com.ykcloud.soa.erp.api.fi.response.BalanceDataBatchGenerateResponse;
import com.ykcloud.soa.erp.api.fi.response.BalanceDataGenerateResponse;
import com.ykcloud.soa.erp.api.fi.response.NotBalanceBillGetResponse;

/**
 * @Author:ALi
 * @Description: 供应商结算单
 * @Date:
 */
public interface FiSupBalanceBillService {
    /**
     * 取结算数据
     * @param
     * @return
     */
    public BalanceDataGenerateResponse generateBalanceData(BalanceDataGenerateRequest request);

    /**
     * 获取没有结算的数据
     * @param request
     * @return
     */
    public NotBalanceBillGetResponse getNotBalanceBill(NotBalanceBillGetRequest request);

    /**
     * 选择指定明细项目生成结算明细
     * @param request
     * @return
     */
    public AppointBalanceBillDtlGenerateResponse generateAppointBalanceBillDtl(AppointBalanceBillDtlGenerateRequest request) ;
    /**
     * 删除结算单商品明细中的指定项目
     * @param request
     * @return
     */
    public AppointForSupBalanceDtlDeleteResponse deleteAppointForSupBalanceDtl(AppointForSupBalanceDtlDeleteRequest request);

    /**
     * 批量生成结算
     * @param request
     * @return
     */
    public BalanceDataBatchGenerateResponse batchGenerateBalanceData(BalanceDataBatchGenerateRequest request);

}
