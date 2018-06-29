package com.ykcloud.soa.erp.api.scm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

public class ProtocolShopCopyResponse extends MessagePack {

    /**
     *
     */
    private static final long serialVersionUID = 8374979547542202485L;

    public String startTime;

    public String endTime;

    public Long timeInterval;

    public Long handleNum;

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Long getTimeInterval() {
        return timeInterval;
    }

    public void setTimeInterval(Long timeInterval) {
        this.timeInterval = timeInterval;
    }

    public Long getHandleNum() {
        return handleNum;
    }

    public void setHandleNum(Long handleNum) {
        this.handleNum = handleNum;
    }

}
