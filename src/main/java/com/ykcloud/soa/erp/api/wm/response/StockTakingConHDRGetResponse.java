package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import java.util.Date;

/**
 * @Description: 查询盘点装箱单表头的出参
 * @author: henry.wang
 * @date: 2018/4/2 9:42
 **/
public class StockTakingConHDRGetResponse extends MessagePack {

    private static final long serialVersionUID = 1L;

    private String reservedNo; // 盘存单号(引用盘存表)
    private String containerSerlno;//箱编号（主键）
    private String trayLabserlno;//容器标签码/货架号
    private Date stocktakingDate;// 盘存日期
    private Long statusNumId;// 状态
    private Long soFromType;// 来源
    private Long physicalNumId;// 物理仓库
    private String remark;// 备注
    private Long carrySign;// 结转标识

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

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

    public Long getCarrySign() {
        return carrySign;
    }

    public void setCarrySign(Long carrySign) {
        this.carrySign = carrySign;
    }
}
