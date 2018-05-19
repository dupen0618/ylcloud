package com.ykcloud.soa.erp.api.fi.model;

import java.io.Serializable;

public class FiAccountantcyc implements Serializable {
    private long series;
    private long tenant_num_id;
    private long sub_unit_num_id;
    private long accountantcycid;
    private String accountyearmonth;
    private String accountantmonth;
    private String accountyear;
    private String begindate;
    private String enddate;
    private String cancelsign;
    private String insertdata;
    private String alreadysend;
    private String senddata;
    private String updatedata;
    private long data_sign;
    private long currentaccount_sign;

    public long getSeries() {
        return series;
    }

    public void setSeries(long series) {
        this.series = series;
    }

    public long getTenant_num_id() {
        return tenant_num_id;
    }

    public void setTenant_num_id(long tenant_num_id) {
        this.tenant_num_id = tenant_num_id;
    }

    public long getSub_unit_num_id() {
        return sub_unit_num_id;
    }

    public void setSub_unit_num_id(long sub_unit_num_id) {
        this.sub_unit_num_id = sub_unit_num_id;
    }

    public long getAccountantcycid() {
        return accountantcycid;
    }

    public void setAccountantcycid(long accountantcycid) {
        this.accountantcycid = accountantcycid;
    }

    public String getAccountyearmonth() {
        return accountyearmonth;
    }

    public void setAccountyearmonth(String accountyearmonth) {
        this.accountyearmonth = accountyearmonth;
    }

    public String getAccountantmonth() {
        return accountantmonth;
    }

    public void setAccountantmonth(String accountantmonth) {
        this.accountantmonth = accountantmonth;
    }

    public String getAccountyear() {
        return accountyear;
    }

    public void setAccountyear(String accountyear) {
        this.accountyear = accountyear;
    }

    public String getBegindate() {
        return begindate;
    }

    public void setBegindate(String begindate) {
        this.begindate = begindate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public String getCancelsign() {
        return cancelsign;
    }

    public void setCancelsign(String cancelsign) {
        this.cancelsign = cancelsign;
    }

    public String getInsertdata() {
        return insertdata;
    }

    public void setInsertdata(String insertdata) {
        this.insertdata = insertdata;
    }

    public String getAlreadysend() {
        return alreadysend;
    }

    public void setAlreadysend(String alreadysend) {
        this.alreadysend = alreadysend;
    }

    public String getSenddata() {
        return senddata;
    }

    public void setSenddata(String senddata) {
        this.senddata = senddata;
    }

    public String getUpdatedata() {
        return updatedata;
    }

    public void setUpdatedata(String updatedata) {
        this.updatedata = updatedata;
    }

    public long getData_sign() {
        return data_sign;
    }

    public void setData_sign(long data_sign) {
        this.data_sign = data_sign;
    }

    public long getCurrentaccount_sign() {
        return currentaccount_sign;
    }

    public void setCurrentaccount_sign(long currentaccount_sign) {
        this.currentaccount_sign = currentaccount_sign;
    }
}
