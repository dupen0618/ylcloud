package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

import com.ykcloud.soa.erp.api.wm.model.ScmAccInvOwnStk;
import com.ykcloud.soa.erp.api.wm.model.WmBlReceiptBudDtl;
import com.ykcloud.soa.erp.api.wm.model.WmPhysicalAccountWba;

import javax.validation.constraints.NotNull;

/**
 * @Author Hewei
 * @Date 2018/3/29 16:00
 */
public class WmAccountRequest extends AbstractRequest {
    private WmBlReceiptBudDtl wmBlReceiptBudDtl;
    private Long balanceFunction;
    private ScmAccInvOwnStk scmAccInvOwnStk;
    private Boolean exists;
    private Long userNumId;
    private WmPhysicalAccountWba wmPhysicalAccountWba;

    private Long reservedNO;
    private Long divNumId;
    private Long itemNumId;

    private String scmAccInvOwnStkTscListStr;
    private String exArcAccountFieldconfigListStr;
    private Long subUnitNumId;

    @NotNull(message = "业务类型编号不能为空！")
    String billTypeNumId;
    @NotNull(message = "单据类型不能为空！")
    String typeNumId;
    @NotNull(message = "入账类型不能为空！")
    String accountName;

    Long balaFuncId;

    public WmBlReceiptBudDtl getWmBlReceiptBudDtl() {
        return wmBlReceiptBudDtl;
    }

    public void setWmBlReceiptBudDtl(WmBlReceiptBudDtl wmBlReceiptBudDtl) {
        this.wmBlReceiptBudDtl = wmBlReceiptBudDtl;
    }

    public Long getBalanceFunction() {
        return balanceFunction;
    }

    public void setBalanceFunction(Long balanceFunction) {
        this.balanceFunction = balanceFunction;
    }

    public ScmAccInvOwnStk getScmAccInvOwnStk() {
        return scmAccInvOwnStk;
    }

    public void setScmAccInvOwnStk(ScmAccInvOwnStk scmAccInvOwnStk) {
        this.scmAccInvOwnStk = scmAccInvOwnStk;
    }

    public Boolean getExists() {
        return exists;
    }

    public void setExists(Boolean exists) {
        this.exists = exists;
    }

    public Long getUserNumId() {
        return userNumId;
    }

    public void setUserNumId(Long userNumId) {
        this.userNumId = userNumId;
    }

    public WmPhysicalAccountWba getWmPhysicalAccountWba() {
        return wmPhysicalAccountWba;
    }

    public void setWmPhysicalAccountWba(WmPhysicalAccountWba wmPhysicalAccountWba) {
        this.wmPhysicalAccountWba = wmPhysicalAccountWba;
    }

    public Long getReservedNO() {
        return reservedNO;
    }

    public void setReservedNO(Long reservedNO) {
        this.reservedNO = reservedNO;
    }

    public Long getDivNumId() {
        return divNumId;
    }

    public void setDivNumId(Long divNumId) {
        this.divNumId = divNumId;
    }

    public Long getItemNumId() {
        return itemNumId;
    }

    public void setItemNumId(Long itemNumId) {
        this.itemNumId = itemNumId;
    }

    public String getScmAccInvOwnStkTscListStr() {
        return scmAccInvOwnStkTscListStr;
    }

    public void setScmAccInvOwnStkTscListStr(String scmAccInvOwnStkTscListStr) {
        this.scmAccInvOwnStkTscListStr = scmAccInvOwnStkTscListStr;
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

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getExArcAccountFieldconfigListStr() {
        return exArcAccountFieldconfigListStr;
    }

    public void setExArcAccountFieldconfigListStr(String exArcAccountFieldconfigListStr) {
        this.exArcAccountFieldconfigListStr = exArcAccountFieldconfigListStr;
    }

    public Long getBalaFuncId() {
        return balaFuncId;
    }

    public void setBalaFuncId(Long balaFuncId) {
        this.balaFuncId = balaFuncId;
    }

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }
}
