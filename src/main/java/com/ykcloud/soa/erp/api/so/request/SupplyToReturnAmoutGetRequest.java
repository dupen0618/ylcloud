package com.ykcloud.soa.erp.api.so.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @Author: fred.zhao
 * @Description:
 * @Date: Created in 17:43:2018/3/30
 */
public class SupplyToReturnAmoutGetRequest extends AbstractRequest {

    private static final long serialVersionUID = -8409296700083263920L;

    @NotNull(message = "门店编码不能为空！")
    private Long subUnitNumId;

    @NotNull(message = "商品编号不能为空！")
    private List<Long> itemNumList;


    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }

    public List<Long> getItemNumList() {
        return itemNumList;
    }

    public void setItemNumList(List<Long> itemNumList) {
        this.itemNumList = itemNumList;
    }
}
