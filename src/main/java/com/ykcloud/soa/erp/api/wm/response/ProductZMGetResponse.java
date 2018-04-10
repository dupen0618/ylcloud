package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.wm.model.ZMProduct;

public class ProductZMGetResponse extends MessagePack {

    private static final long serialVersionUID = 1L;

    private ZMProduct zmProduct;

    public ZMProduct getZmProduct() {
        return zmProduct;
    }

    public void setZmProduct(ZMProduct zmProduct) {
        this.zmProduct = zmProduct;
    }
}
