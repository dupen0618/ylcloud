package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

import java.util.List;

/**
 * Created by yiako on 2018/3/28
 */
public class AffectRowsResponse extends MessagePack{

	private static final long serialVersionUID = 1L;
	private List<Integer> rows;

    public List<Integer> getRows() {
        return rows;
    }

    public void setRows(List<Integer> rows) {
        this.rows = rows;
    }
}