package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.wm.model.ScmAccInvOwnStkTsc;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @Author Hewei
 * @Date 2018/3/28 11:54
 */
public class WmBillInAccountRequest extends AbstractUserSessionRequest {

    @NotNull(message = "订单编号不能为空！")
    String reservedNo;
    @NotNull(message = "业务类型编号不能为空！")
    String billTypeNum;
    @NotNull(message = "单据类型不能为空！")
    String typeNum;
    @NotNull(message = "入账类型不能为空！")
    String accountName;

    public List<ScmAccInvOwnStkTsc> scmAccInvOwnStkTscs;


    public String getReservedNo() {
        return reservedNo;
    }

    public void setReservedNo(String reservedNo) {
        this.reservedNo = reservedNo;
    }

    public String getBillTypeNum() {
        return billTypeNum;
    }

    public void setBillTypeNum(String billTypeNum) {
        this.billTypeNum = billTypeNum;
    }

    public String getTypeNum() {
        return typeNum;
    }

    public void setTypeNum(String typeNum) {
        this.typeNum = typeNum;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public List<ScmAccInvOwnStkTsc> getScmAccInvOwnStkTscs() {
        return scmAccInvOwnStkTscs;
    }

    public void setScmAccInvOwnStkTscs(List<ScmAccInvOwnStkTsc> scmAccInvOwnStkTscs) {
        this.scmAccInvOwnStkTscs = scmAccInvOwnStkTscs;
    }
}
