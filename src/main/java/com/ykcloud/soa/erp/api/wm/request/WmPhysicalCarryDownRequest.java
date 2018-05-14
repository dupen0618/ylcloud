package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author:shenq
 * @description:物理仓库月进销存结转Request
 * @date :2018/5/11 - 20:31
 * @version:v1.0
 */
public class WmPhysicalCarryDownRequest extends AbstractRequest {

    private static final long serialVersionUID = 44194492L;

    /**
     * 门店编号
     */
    @NotNull(message = "门店编号不能为空")
    private Long subUnitNumId;

    /**
     * 商品编号
     */
    @NotNull(message = "商品编号不能为空")
    private Long itemNumId;

    /**
     * 物理仓库编号
     */
    @NotNull(message = "物理仓库编号不能为空")
    private Long physicalNumId;

    /**
     * 结转年月
     */
    @NotNull(message = "结转年月不能为空")
    private Long accountMonth;

    @NotNull(message = "销售日期不能为空")
    private Date orderDate;

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }

    public Long getItemNumId() {
        return itemNumId;
    }

    public void setItemNumId(Long itemNumId) {
        this.itemNumId = itemNumId;
    }

    public Long getPhysicalNumId() {
        return physicalNumId;
    }

    public void setPhysicalNumId(Long physicalNumId) {
        this.physicalNumId = physicalNumId;
    }

    public Long getAccountMonth() {
        return accountMonth;
    }

    public void setAccountMonth(Long accountMonth) {
        this.accountMonth = accountMonth;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
}
