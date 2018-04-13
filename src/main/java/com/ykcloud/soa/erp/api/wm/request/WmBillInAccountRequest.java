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
    @NotNull(message = "单据类型不能为空！")
    String typeNum;

    public List<scmAccInvOwnStkTsc> scmAccInvOwnStkTscs;


    public String getReservedNo() {
        return reservedNo;
    }

    public void setReservedNo(String reservedNo) {
        this.reservedNo = reservedNo;
    }

    public String getTypeNum() {
        return typeNum;
    }

    public void setTypeNum(String typeNum) {
        this.typeNum = typeNum;
    }

    public List<scmAccInvOwnStkTsc> getScmAccInvOwnStkTscs() {
        return scmAccInvOwnStkTscs;
    }

    public void setScmAccInvOwnStkTscs(List<scmAccInvOwnStkTsc> scmAccInvOwnStkTscs) {
        this.scmAccInvOwnStkTscs = scmAccInvOwnStkTscs;
    }
}
