package com.ykcloud.soa.erp.api.scm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.scm.model.ScmBlChangeCost;
import com.ykcloud.soa.erp.api.scm.model.ScmBlChangeCostAll;
import com.ykcloud.soa.erp.api.scm.model.ScmBlChangeCostDtl;
import com.ykcloud.soa.erp.api.scm.model.ScmBlChangeCostShop;

import java.util.List;

public class ScmBlChangeCostResponse extends MessagePack
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
