package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractSessionRequest;
import com.ykcloud.soa.erp.api.scm.model.ChangeCost;

import java.util.Date;
import java.util.List;

public class WmCostByScmChangeCostRequest extends AbstractSessionRequest
{
    private static final long serialVersionUID = 1L;

    private List<ChangeCost> changeCostList ;

    private Date orderDate;

    public List<ChangeCost> getChangeCostList() {
        return changeCostList;
    }

    public void setChangeCostList(List<ChangeCost> changeCostList) {
        this.changeCostList = changeCostList;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
}
