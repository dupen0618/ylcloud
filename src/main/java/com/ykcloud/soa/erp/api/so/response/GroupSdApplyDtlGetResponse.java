package com.ykcloud.soa.erp.api.so.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.so.model.ReturnApplyGroup;
import com.ykcloud.soa.erp.api.so.model.ReturnApplyHdr;

import java.util.List;

/**
 * @Author: fred.zhao
 * @Description: 获取退货申请单分组数据response
 * @Date: Created in 16:36:2018/3/28
 */
public class GroupSdApplyDtlGetResponse extends MessagePack {

    private static final long serialVersionUID = -7637664904201330746L;

    private List<ReturnApplyGroup> returnApplyGroupList;

    private ReturnApplyHdr returnApplyHdr;

    public ReturnApplyHdr getReturnApplyHdr() {
        return returnApplyHdr;
    }

    public void setReturnApplyHdr(ReturnApplyHdr returnApplyHdr) {
        this.returnApplyHdr = returnApplyHdr;
    }

    public List<ReturnApplyGroup> getReturnApplyGroupList() {
        return returnApplyGroupList;
    }

    public void setReturnApplyGroupList(List<ReturnApplyGroup> returnApplyGroupList) {
        this.returnApplyGroupList = returnApplyGroupList;
    }
}
