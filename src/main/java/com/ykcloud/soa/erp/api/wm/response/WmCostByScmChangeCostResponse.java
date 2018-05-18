package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.scm.model.ScmBlChangeCostAll;

import java.util.List;

public class WmCostByScmChangeCostResponse extends MessagePack
{
    private static final long serialVersionUID = 1L;

    private List<ScmBlChangeCostAll> scmBlChangeCostAllList;

    public List<ScmBlChangeCostAll> getScmBlChangeCostAllList()
    {
        return scmBlChangeCostAllList;
    }

    public void setScmBlChangeCostAllList(List<ScmBlChangeCostAll> scmBlChangeCostAllList)
    {
        this.scmBlChangeCostAllList = scmBlChangeCostAllList;
    }
}
