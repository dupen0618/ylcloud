package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.wm.model.scmAccInvOwnStkTsc;

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
    String bill_type_num;
    @NotNull(message = "单据类型不能为空！")
    String type_num;
    @NotNull(message = "入账类型不能为空！")
    String accountName;

    public List<scmAccInvOwnStkTsc> scmAccInvOwnStkTscs;


    public String getReservedNo() {
        return reservedNo;
    }

    public void setReservedNo(String reservedNo) {
        this.reservedNo = reservedNo;
    }

    public String getBill_type_num() {
        return bill_type_num;
    }

    public void setBill_type_num(String bill_type_num) {
        this.bill_type_num = bill_type_num;
    }

    public String getType_num() {
        return type_num;
    }

    public void setType_num(String type_num) {
        this.type_num = type_num;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public List<scmAccInvOwnStkTsc> getScmAccInvOwnStkTscs() {
        return scmAccInvOwnStkTscs;
    }

    public void setScmAccInvOwnStkTscs(List<scmAccInvOwnStkTsc> scmAccInvOwnStkTscs) {
        this.scmAccInvOwnStkTscs = scmAccInvOwnStkTscs;
    }
}
