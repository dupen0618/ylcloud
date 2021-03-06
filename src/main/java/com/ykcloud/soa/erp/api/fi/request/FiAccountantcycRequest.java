package com.ykcloud.soa.erp.api.fi.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class FiAccountantcycRequest extends AbstractRequest {
    /**
	 * 
	 */
	private static final long serialVersionUID = 5388230362972591738L;


	@NotNull(message = "门店编号不能为空!")
    private Long subUnitNumId;

    @NotNull(message = "日期不能为空！")
    private Date recDate;

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }

    public Date getRecDate() {
        return recDate;
    }

    public void setRecDate(Date recDate) {
        this.recDate = recDate;
    }
}
