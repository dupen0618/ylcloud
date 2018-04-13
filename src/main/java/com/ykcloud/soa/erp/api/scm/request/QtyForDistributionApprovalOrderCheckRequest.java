package com.ykcloud.soa.erp.api.scm.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @Author: fred.zhao
 * @Description:配送数量检查
 * @Date: Created in 15:38:2018/4/11
 */
public class QtyForDistributionApprovalOrderCheckRequest extends AbstractRequest {
    private static final long serialVersionUID = -3039967510143413469L;

    @NotNull(message = "门店编码不能为空！")
    private Long subUnitNumId;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @NotNull(message = "订单日期不能为空！")
    private Date orderDate;

    private Double qty;

    private Double packageQty;

    @NotNull(message = "件装数不能为空！")
    private Double conversionQty;//件装数
    @NotNull(message = "商品编号不能为空！")
    private Long itemNumId;


    public Long getItemNumId() {
        return itemNumId;
    }

    public void setItemNumId(Long itemNumId) {
        this.itemNumId = itemNumId;
    }

    public Double getConversionQty() {
        return conversionQty;
    }

    public void setConversionQty(Double conversionQty) {
        this.conversionQty = conversionQty;
    }

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Double getQty() {
        return qty;
    }

    public void setQty(Double qty) {
        this.qty = qty;
    }

    public Double getPackageQty() {
        return packageQty;
    }

    public void setPackageQty(Double packageQty) {
        this.packageQty = packageQty;
    }

}
