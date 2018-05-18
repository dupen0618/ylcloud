package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;
import com.ykcloud.soa.erp.api.scm.model.ScmBlChangeCostAll;

import javax.validation.constraints.NotNull;
import java.util.List;

public class WmCostByScmChangeCostRequest extends AbstractRequest
{
    private static final long serialVersionUID = 1L;

    private List<ScmBlChangeCostAll> list ;

    public List<ScmBlChangeCostAll> getList()
    {
        return list;
    }

    public void setList(List<ScmBlChangeCostAll> list)
    {
        this.list = list;
    }
}
