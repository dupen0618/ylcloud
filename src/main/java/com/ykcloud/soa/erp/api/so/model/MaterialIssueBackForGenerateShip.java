package com.ykcloud.soa.erp.api.so.model;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: fred.zhao
 * @Description:为产生入库单负数查询行政领料退回/领赠品退回单头单身
 * @Date: Created in 17:04:2018/4/12
 */
public class MaterialIssueBackForGenerateShip implements Serializable {
    private static final long serialVersionUID = -249082064428541017L;

    private String applyNumId;//退库申请单编号

    private Long soFromType;//来源

    private Long typeNumId;//业务类型

    private Long recStorageNumId;//收货逻辑仓

    private Long recPhysicalNumId;//收货物理仓

    private Long settlementType;//结算方式

    private String originReservedNo;//源出库单编号

    private String remark;//备注

    private List<ReturnApplyDtl> returnApplyDtlList;


    public String getApplyNumId() {
        return applyNumId;
    }

    public void setApplyNumId(String applyNumId) {
        this.applyNumId = applyNumId;
    }

    public Long getSoFromType() {
        return soFromType;
    }

    public void setSoFromType(Long soFromType) {
        this.soFromType = soFromType;
    }

    public Long getTypeNumId() {
        return typeNumId;
    }

    public void setTypeNumId(Long typeNumId) {
        this.typeNumId = typeNumId;
    }

    public Long getRecStorageNumId() {
        return recStorageNumId;
    }

    public void setRecStorageNumId(Long recStorageNumId) {
        this.recStorageNumId = recStorageNumId;
    }

    public Long getRecPhysicalNumId() {
        return recPhysicalNumId;
    }

    public void setRecPhysicalNumId(Long recPhysicalNumId) {
        this.recPhysicalNumId = recPhysicalNumId;
    }

    public Long getSettlementType() {
        return settlementType;
    }

    public void setSettlementType(Long settlementType) {
        this.settlementType = settlementType;
    }

    public String getOriginReservedNo() {
        return originReservedNo;
    }

    public void setOriginReservedNo(String originReservedNo) {
        this.originReservedNo = originReservedNo;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public List<ReturnApplyDtl> getReturnApplyDtlList() {
        return returnApplyDtlList;
    }

    public void setReturnApplyDtlList(List<ReturnApplyDtl> returnApplyDtlList) {
        this.returnApplyDtlList = returnApplyDtlList;
    }
}
