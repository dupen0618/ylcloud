package com.ykcloud.soa.erp.api.fi.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.annotation.ApiField;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import java.util.Date;
import javax.validation.constraints.NotNull;

/**
 * @Description: 盘盈盘亏单中类型(3、4、5、6)，并且 wm_bl_stockadjust_hdr.if_costadjust=0 核销代销商品款的入参
 * @author: henry.wang
 * @date: 2018/6/6 16:16
 **/
public class AccountForAdjustCheckRequest extends AbstractUserSessionRequest {

    private static final long serialVersionUID = -3101956261800131597L;

    @ApiField(description = "门店编号")
    @NotNull(message = "门店编号不能为空！")
    private Long subUnitNumId;

    @ApiField(description = "盈亏单号")
    @NotNull(message = "盈亏单号不能为空！")
    private String reservedNo;

    @ApiField(description = "盈亏日期")
    @NotNull(message = "盈亏日期不能为空！")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date justDate;

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }

    public String getReservedNo() {
        return reservedNo;
    }

    public void setReservedNo(String reservedNo) {
        this.reservedNo = reservedNo;
    }

    public Date getJustDate() {
        return justDate;
    }

    public void setJustDate(Date justDate) {
        this.justDate = justDate;
    }
}
