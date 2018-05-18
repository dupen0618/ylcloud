package com.ykcloud.soa.erp.api.fi.request;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.fi.model.*;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @Author Hewei
 * @Date 2018/4/10 11:31
 */
public class FiOnLoadProcessRequest extends AbstractUserSessionRequest {
    private static final long serialVersionUID = 5687110045117649099L;

    @NotNull(message = "单据类型不能为空！")
    String typeNumId;

    @NotNull(message = "业务类型编号不能为空！")
    private String billTypeNumId;

    @NotNull(message = "订单编号不能为空！")
    String reservedNo;

    Long balaFuncId;

    Long crossSubCompanySign;

    WmBlShipHdr wmBlShipHdr;

    WmBlShipDtl wmBlShipDtl;

    WmBlReceiptBudHdr wmBlReceiptBudHdr;

    WmBlReceiptBudDtl wmBlReceiptBudDtl;
    private Long pty1NumId;
    private Long pty2NumId;
    private Long pty3NumId;
    private Long departNumId;
    private Double costTaxRate;


    public String getTypeNumId() {
        return typeNumId;
    }

    public void setTypeNumId(String typeNumId) {
        this.typeNumId = typeNumId;
    }

    public String getBillTypeNumId() {
        return billTypeNumId;
    }

    public void setBillTypeNumId(String billTypeNumId) {
        this.billTypeNumId = billTypeNumId;
    }

    public String getReservedNo() {
        return reservedNo;
    }

    public void setReservedNo(String reservedNo) {
        this.reservedNo = reservedNo;
    }

    public WmBlShipHdr getWmBlShipHdr() {
        return wmBlShipHdr;
    }

    public void setWmBlShipHdr(WmBlShipHdr wmBlShipHdr) {
        this.wmBlShipHdr = wmBlShipHdr;
    }

    public WmBlShipDtl getWmBlShipDtl() {
        return wmBlShipDtl;
    }

    public void setWmBlShipDtl(WmBlShipDtl wmBlShipDtl) {
        this.wmBlShipDtl = wmBlShipDtl;
    }

    public WmBlReceiptBudHdr getWmBlReceiptBudHdr() {
        return wmBlReceiptBudHdr;
    }

    public void setWmBlReceiptBudHdr(WmBlReceiptBudHdr wmBlReceiptBudHdr) {
        this.wmBlReceiptBudHdr = wmBlReceiptBudHdr;
    }

    public WmBlReceiptBudDtl getWmBlReceiptBudDtl() {
        return wmBlReceiptBudDtl;
    }

    public void setWmBlReceiptBudDtl(WmBlReceiptBudDtl wmBlReceiptBudDtl) {
        this.wmBlReceiptBudDtl = wmBlReceiptBudDtl;
    }

    public void setPty1NumId(Long pty1NumId) {
        this.pty1NumId = pty1NumId;
    }

    public Long getPty1NumId() {
        return pty1NumId;
    }

    public void setPty2NumId(Long pty2NumId) {
        this.pty2NumId = pty2NumId;
    }

    public Long getPty2NumId() {
        return pty2NumId;
    }

    public void setPty3NumId(Long pty3NumId) {
        this.pty3NumId = pty3NumId;
    }

    public Long getPty3NumId() {
        return pty3NumId;
    }

    public void setDepartNumId(Long departNumId) {
        this.departNumId = departNumId;
    }

    public Long getDepartNumId() {
        return departNumId;
    }

    public void setCostTaxRate(Double costTaxRate) {
        this.costTaxRate = costTaxRate;
    }

    public Double getCostTaxRate() {
        return costTaxRate;
    }

    public Long getBalaFuncId() {
        return balaFuncId;
    }

    public void setBalaFuncId(Long balaFuncId) {
        this.balaFuncId = balaFuncId;
    }

    public Long getCrossSubCompanySign() {
        return crossSubCompanySign;
    }

    public void setCrossSubCompanySign(Long crossSubCompanySign) {
        this.crossSubCompanySign = crossSubCompanySign;
    }
}


