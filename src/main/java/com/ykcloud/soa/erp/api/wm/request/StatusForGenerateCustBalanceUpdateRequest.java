package com.ykcloud.soa.erp.api.wm.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import java.util.Date;
import java.util.List;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @Description: 生成购销客户结算单后，回写出库单状态的入参
 * @author: henry.wang
 * @date: 2018/6/12 10:05
 **/
public class StatusForGenerateCustBalanceUpdateRequest extends AbstractUserSessionRequest {
    private static final long serialVersionUID = 1L;

    @NotNull(message = "门店不能为空！")
    private Long subUnitNumId;

    @NotEmpty(message = "出库单号不能为空！")
    private List<String> reservedNoList;

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }

    public List<String> getReservedNoList() {
        return reservedNoList;
    }

    public void setReservedNoList(List<String> reservedNoList) {
        this.reservedNoList = reservedNoList;
    }
}
