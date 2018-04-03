package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import java.util.Date;

/**
 * @Description: 查询盘点计划单表头的出参
 * @Author: henry.wang
 * @Date: 2018/3/31 16:09
 **/
public class StockTakingTaskHDRGetResponse extends MessagePack {

    private static final long serialVersionUID = 1L;

    private String reservedNo; // 盘点计划单号
    private Date inventorydate;// 计划日期
    private Long divNumId; // 商品中心（部门）
    private Long statusNumId;// 状态
    private Long soFromType;// 来源
    private Long typeNumId;// 单据类型
    private Long takingTypeNumId;// 业务类型
    private Long physicalNumId;// 物理仓库
    private String remark;// 备注
    private Long carrySign;// 结转标识
    private Long departNumId;// 盘点部门
    private Long classifyNumId;// 部门归集码

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getReservedNo() {
        return reservedNo;
    }

    public void setReservedNo(String reservedNo) {
        this.reservedNo = reservedNo;
    }

    public Date getInventorydate() {
        return inventorydate;
    }

    public void setInventorydate(Date inventorydate) {
        this.inventorydate = inventorydate;
    }

    public Long getDivNumId() {
        return divNumId;
    }

    public void setDivNumId(Long divNumId) {
        this.divNumId = divNumId;
    }

    public Long getStatusNumId() {
        return statusNumId;
    }

    public void setStatusNumId(Long statusNumId) {
        this.statusNumId = statusNumId;
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

    public Long getTakingTypeNumId() {
        return takingTypeNumId;
    }

    public void setTakingTypeNumId(Long takingTypeNumId) {
        this.takingTypeNumId = takingTypeNumId;
    }

    public Long getPhysicalNumId() {
        return physicalNumId;
    }

    public void setPhysicalNumId(Long physicalNumId) {
        this.physicalNumId = physicalNumId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Long getCarrySign() {
        return carrySign;
    }

    public void setCarrySign(Long carrySign) {
        this.carrySign = carrySign;
    }

    public Long getDepartNumId() {
        return departNumId;
    }

    public void setDepartNumId(Long departNumId) {
        this.departNumId = departNumId;
    }

    public Long getClassifyNumId() {
        return classifyNumId;
    }

    public void setClassifyNumId(Long classifyNumId) {
        this.classifyNumId = classifyNumId;
    }
}
