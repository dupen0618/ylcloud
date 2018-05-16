package com.ykcloud.soa.erp.api.fi.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.fi.model.FiAccountantcyc;

import java.util.List;

public class FiAccountantcycResponse extends MessagePack {

  private FiAccountantcyc fiAccountantcyc;

    public FiAccountantcyc getFiAccountantcyc() {
        return fiAccountantcyc;
    }

    public void setFiAccountantcyc(FiAccountantcyc fiAccountantcyc) {
        this.fiAccountantcyc = fiAccountantcyc;
    }
}
