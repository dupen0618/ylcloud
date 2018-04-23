package com.ykcloud.soa.erp.api.wm.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description: 盘点箱（货架）信息
 * @author: henry.wang
 * @date: 2018/4/23 14:24
 **/
public class ContainerInfoForStockCheck implements Serializable {

    private static final long serialVersionUID = 1L;

    private String reservedNo; // 盘存单号(引用盘存表)
    private String containerSerlno;//箱编号（主键）
    private String trayLabserlno;//容器标签码/货架号
    private Date stocktakingDate;// 盘存日期
    private Long statusNumId;// 状态
    private Long soFromType;// 来源
    private Long physicalNumId;// 物理仓库
    private String remark;// 备注
    private Long planStatusNumId;//盘点计划单状态

    private Double totalByCon;  //当前箱盘点的合计数量

    public String getReservedNo() {
        return reservedNo;
    }

    public void setReservedNo(String reservedNo) {
        this.reservedNo = reservedNo;
    }

    public String getContainerSerlno() {
        return containerSerlno;
    }

    public void setContainerSerlno(String containerSerlno) {
        this.containerSerlno = containerSerlno;
    }

    public String getTrayLabserlno() {
        return trayLabserlno;
    }

    public void setTrayLabserlno(String trayLabserlno) {
        this.trayLabserlno = trayLabserlno;
    }

    public Date getStocktakingDate() {
        return stocktakingDate;
    }

    public void setStocktakingDate(Date stocktakingDate) {
        this.stocktakingDate = stocktakingDate;
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

    public Long getPlanStatusNumId() {
        return planStatusNumId;
    }

    public void setPlanStatusNumId(Long planStatusNumId) {
        this.planStatusNumId = planStatusNumId;
    }

    public Double getTotalByCon() {
        return totalByCon;
    }

    public void setTotalByCon(Double totalByCon) {
        this.totalByCon = totalByCon;
    }
}
