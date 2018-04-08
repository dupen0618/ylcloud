package com.ykcloud.soa.erp.api.fi.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author Hewei
 * @Date 2018/3/27 17:31
 */
public class ExArcAccountFieldconfig implements Serializable {
    private static final long serialVersionUID = 1L;
    private int series;
    private int tenant_num_id;
    private String AccountName;
    private String ActFieldName;
    private int QtyOrAmount;
    private Date create_dtme;
    private Date last_updtme;
    private int create_user_id;
    private int last_update_user_id;
    private char cancelsign;
    private char insertdata;
    private char updatedata;
    private int data_sign;

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getTenant_num_id() {
        return tenant_num_id;
    }

    public void setTenant_num_id(int tenant_num_id) {
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

    public int getQtyOrAmount() {
        return QtyOrAmount;
    }

    public void setQtyOrAmount(int qtyOrAmount) {
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

    public int getCreate_user_id() {
        return create_user_id;
    }

    public void setCreate_user_id(int create_user_id) {
        this.create_user_id = create_user_id;
    }

    public int getLast_update_user_id() {
        return last_update_user_id;
    }

    public void setLast_update_user_id(int last_update_user_id) {
        this.last_update_user_id = last_update_user_id;
    }

    public char getCancelsign() {
        return cancelsign;
    }

    public void setCancelsign(char cancelsign) {
        this.cancelsign = cancelsign;
    }

    public char getInsertdata() {
        return insertdata;
    }

    public void setInsertdata(char insertdata) {
        this.insertdata = insertdata;
    }

    public char getUpdatedata() {
        return updatedata;
    }

    public void setUpdatedata(char updatedata) {
        this.updatedata = updatedata;
    }

    public int getData_sign() {
        return data_sign;
    }

    public void setData_sign(int data_sign) {
        this.data_sign = data_sign;
    }
}
