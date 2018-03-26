package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

/**
 * @Author Hewei
 * @Date 2018/3/21 19:41
 */
public class GoodsOutboundGetResponse extends MessagePack {
    private static final long serialVersionUID = -5647792496405192597L;

    //订单号
    private String soNumId;
    //物流波次
    private String wlbc;
    //商品名称
    private String productName;
    //商品条码
    private String productBarcode;

    public String getSoNumId() {
        return soNumId;
    }

    public void setSoNumId(String soNumId) {
        this.soNumId = soNumId;
    }

    public String getWlbc() {
        return wlbc;
    }

    public void setWlbc(String wlbc) {
        this.wlbc = wlbc;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductBarcode() {
        return productBarcode;
    }

    public void setProductBarcode(String productBarcode) {
        this.productBarcode = productBarcode;
    }
}
