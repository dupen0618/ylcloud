package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.wm.model.ZMProduct;

import java.util.List;

public class ProductChangeGetResponse extends MessagePack {

    private static final long serialVersionUID = 1L;

    private List<ZMProduct> zmProduct;

    public List<ZMProduct> getZmProduct() {
        return zmProduct;
    }

    public void setZmProduct(List<ZMProduct> zmProduct) {
        this.zmProduct = zmProduct;
    }
}
