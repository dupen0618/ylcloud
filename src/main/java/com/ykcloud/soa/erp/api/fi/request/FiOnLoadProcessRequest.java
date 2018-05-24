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

    @NotNull(message = "门店编号不能为空！")
    private Long subUnitNumId;
    @NotNull(message = "验收单号不能为空！")
    private String reservedNo;
    @NotNull(message = "单据类型不能为空!")
    private String billTypeNumId;
    @NotNull(message = "业务类型不能为空!")
    private String typeNumId;


    private Long pty1NumId;
    private Long pty2NumId;
    private Long pty3NumId;
    private Long departNumId;
    private Long balanceFunctionId;
    private Long crossSubCompanySign;

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


    public Long getPty1NumId() {
        return pty1NumId;
    }

    public void setPty1NumId(Long pty1NumId) {
        this.pty1NumId = pty1NumId;
    }

    public Long getPty2NumId() {
        return pty2NumId;
    }

    public void setPty2NumId(Long pty2NumId) {
        this.pty2NumId = pty2NumId;
    }

    public Long getPty3NumId() {
        return pty3NumId;
    }

    public void setPty3NumId(Long pty3NumId) {
        this.pty3NumId = pty3NumId;
    }

    public Long getDepartNumId() {
        return departNumId;
    }

    public void setDepartNumId(Long departNumId) {
        this.departNumId = departNumId;
    }

    public String getBillTypeNumId() {
        return billTypeNumId;
    }

    public void setBillTypeNumId(String billTypeNumId) {
        this.billTypeNumId = billTypeNumId;
    }

    public String getTypeNumId() {
        return typeNumId;
    }

    public void setTypeNumId(String typeNumId) {
        this.typeNumId = typeNumId;
    }

    public Long getBalanceFunctionId() {
        return balanceFunctionId;
    }

    public void setBalanceFunctionId(Long balanceFunctionId) {
        this.balanceFunctionId = balanceFunctionId;
    }

    public Long getCrossSubCompanySign() {
        return crossSubCompanySign;
    }

    public void setCrossSubCompanySign(Long crossSubCompanySign) {
        this.crossSubCompanySign = crossSubCompanySign;
    }
}


