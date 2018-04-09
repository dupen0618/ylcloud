package com.ykcloud.soa.erp.api.fi.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

/**
 * @Author: fred.zhao
 * @Description:获取门店、供应别代销商品款期末余额
 * @Date: Created in 17:31:2018/4/7
 */
public class ConsignmentProductFinalAmountForFinanceAuditApprovalReturnOrderGetRequest extends AbstractRequest {
    private static final long serialVersionUID = 6088030036088570593L;

    @NotNull(message="门店编号不能为空！")
    private Long subUnitNumId;

    @NotNull(message="供应商编号不能为空！")
    private Long supplyUnitNumId;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @NotNull(message = "订单日期不能为空！")
    private Date orderDate;

    @NotNull(message = "商品列表不能为空")
    private List<Long> itemNumIds;

    @NotNull(message="查询标识不能为空！")
    private Long supplyCortSign;

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }

    public Long getSupplyUnitNumId() {
        return supplyUnitNumId;
    }

    public void setSupplyUnitNumId(Long supplyUnitNumId) {
        this.supplyUnitNumId = supplyUnitNumId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public List<Long> getItemNumIds() {
        return itemNumIds;
    }

    public void setItemNumIds(List<Long> itemNumIds) {
        this.itemNumIds = itemNumIds;
    }

    public Long getSupplyCortSign() {
        return supplyCortSign;
    }

    public void setSupplyCortSign(Long supplyCortSign) {
        this.supplyCortSign = supplyCortSign;
    }
}
