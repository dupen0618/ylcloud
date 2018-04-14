package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import javax.validation.constraints.NotNull;

/**
 * @Author Hewei
 * @Date 2018/3/21 19:32
 */
public class GoodsOutboundGetRequest extends AbstractUserSessionRequest{
    private static final long serialVersionUID = -7131474983637566672L;

    @NotNull(message = "订单编号不能为空！")
    private String soNumId;

    @NotNull(message = "条码值不能为空! ")
    private String barcode;

    @NotNull(message="托盘号不能为空")
    private String containerSerlno;

    @NotNull(message="周转箱标号不能为空")
    private String containerLabserlno;

    @NotNull(message="小票编号不能为空")
    private String tmlNumId;

    @NotNull(message="商品数量不能为空")
    private Double qty;

    @NotNull(message="波次号不能为空")
    private String wlbc;


    public String getSoNumId() {
        return soNumId;
    }

    public void setSoNumId(String soNumId) {
        this.soNumId = soNumId;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getContainerSerlno() {
        return containerSerlno;
    }

    public void setContainerSerlno(String containerSerlno) {
        this.containerSerlno = containerSerlno;
    }

    public String getContainerLabserlno() {
        return containerLabserlno;
    }

    public void setContainerLabserlno(String containerLabserlno) {
        this.containerLabserlno = containerLabserlno;
    }

    public String getTmlNumId() {
        return tmlNumId;
    }

    public void setTmlNumId(String tmlNumId) {
        this.tmlNumId = tmlNumId;
    }


    

    public Double getQty() {
		return qty;
	}

	public void setQty(Double qty) {
		this.qty = qty;
	}

	public String getWlbc() {
        return wlbc;
    }

    public void setWlbc(String wlbc) {
        this.wlbc = wlbc;
    }
}
