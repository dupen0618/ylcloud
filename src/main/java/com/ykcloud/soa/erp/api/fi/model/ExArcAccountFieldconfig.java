package com.ykcloud.soa.erp.api.fi.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author Hewei
 * @Date 2018/3/27 17:31
 */
public class ExArcAccountFieldconfig implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long series;
    private Long tenant_num_id;
    private String AccountName;
    private String ActFieldName;
    private Long QtyOrAmount;
    private Date create_dtme;
    private Date last_updtme;
    private Long create_user_id;
    private Long last_update_user_id;
    private String cancelsign;
    private String insertdata;
    private String updatedata;
    private Long data_sign;

    public Long getSeries() {
        return series;
    }

    public void setSeries(Long series) {
        this.series = series;
    }

    public Long getTenant_num_id() {
        return tenant_num_id;
    }

    public void setTenant_num_id(Long tenant_num_id) {
        this.tenant_num_id = tenant_num_id;
    }

    public String getAccountName() {
        return AccountName;
    }

    public void setAccountName(String accountName) {
        AccountName = accountName;
    }

    public String getActFieldName() {
        return ActFieldName;
    }

    public void setActFieldName(String actFieldName) {
        ActFieldName = actFieldName;
    }

    public Long getQtyOrAmount() {
        return QtyOrAmount;
    }

    public void setQtyOrAmount(Long qtyOrAmount) {
        QtyOrAmount = qtyOrAmount;
    }

    public Date getCreate_dtme() {
        return create_dtme;
    }

    public void setCreate_dtme(Date create_dtme) {
        this.create_dtme = create_dtme;
    }

    public Date getLast_updtme() {
        return last_updtme;
    }

    public void setLast_updtme(Date last_updtme) {
        this.last_updtme = last_updtme;
    }

    public Long getCreate_user_id() {
        return create_user_id;
    }

    public void setCreate_user_id(Long create_user_id) {
        this.create_user_id = create_user_id;
    }

    public Long getLast_update_user_id() {
        return last_update_user_id;
    }

    public void setLast_update_user_id(Long last_update_user_id) {
        this.last_update_user_id = last_update_user_id;
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

    public String getUpdatedata() {
        return updatedata;
    }

    public void setUpdatedata(String updatedata) {
        this.updatedata = updatedata;
    }

    public Long getData_sign() {
        return data_sign;
    }

    public void setData_sign(Long data_sign) {
        this.data_sign = data_sign;
    }
}
