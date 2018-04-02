package com.ykcloud.soa.erp.api.wm.model;

import java.util.Date;

/**
 * @Author Hewei
 * @Date 2018/3/27 19:36
 */
public class ExArcBalanceFuncStkWba {
    private int series;
    private int tenant_num_id;
    private String bill_type_num_name;
    private String bill_type_num_id;
    private int type_num_id;
    private int balance_function_id;
    private String balance_function_name;
    private String bill_dtl_tablename;
    private int aval_qty_sign;
    private int lock_qty_sign;
    private int physic_qty_sign;
    private int virtual_qty_sign;
    private int fact_virtual_qty_sign;
    private int reserved_qty_sign;
    private String aval_qty;
    private int canbenegative;
    private String wbaQtyFieldName;
    private int accountType;
    private Date create_dtme;
    private Date last_updtme;
    private int create_user_id;
    private int last_update_user_id;
    private char cancelsign;
    private char insertdata;
    private char updatedata;
    private int data_sign;
    private String gaCompareFieldName;

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

    public String getBill_type_num_name() {
        return bill_type_num_name;
    }

    public void setBill_type_num_name(String bill_type_num_name) {
        this.bill_type_num_name = bill_type_num_name;
    }

    public String getBill_type_num_id() {
        return bill_type_num_id;
    }

    public void setBill_type_num_id(String bill_type_num_id) {
        this.bill_type_num_id = bill_type_num_id;
    }

    public int getType_num_id() {
        return type_num_id;
    }

    public void setType_num_id(int type_num_id) {
        this.type_num_id = type_num_id;
    }

    public int getBalance_function_id() {
        return balance_function_id;
    }

    public void setBalance_function_id(int balance_function_id) {
        this.balance_function_id = balance_function_id;
    }

    public String getBalance_function_name() {
        return balance_function_name;
    }

    public void setBalance_function_name(String balance_function_name) {
        this.balance_function_name = balance_function_name;
    }

    public String getBill_dtl_tablename() {
        return bill_dtl_tablename;
    }

    public void setBill_dtl_tablename(String bill_dtl_tablename) {
        this.bill_dtl_tablename = bill_dtl_tablename;
    }

    public int getAval_qty_sign() {
        return aval_qty_sign;
    }

    public void setAval_qty_sign(int aval_qty_sign) {
        this.aval_qty_sign = aval_qty_sign;
    }

    public int getLock_qty_sign() {
        return lock_qty_sign;
    }

    public void setLock_qty_sign(int lock_qty_sign) {
        this.lock_qty_sign = lock_qty_sign;
    }

    public int getPhysic_qty_sign() {
        return physic_qty_sign;
    }

    public void setPhysic_qty_sign(int physic_qty_sign) {
        this.physic_qty_sign = physic_qty_sign;
    }

    public int getVirtual_qty_sign() {
        return virtual_qty_sign;
    }

    public void setVirtual_qty_sign(int virtual_qty_sign) {
        this.virtual_qty_sign = virtual_qty_sign;
    }

    public int getFact_virtual_qty_sign() {
        return fact_virtual_qty_sign;
    }

    public void setFact_virtual_qty_sign(int fact_virtual_qty_sign) {
        this.fact_virtual_qty_sign = fact_virtual_qty_sign;
    }

    public int getReserved_qty_sign() {
        return reserved_qty_sign;
    }

    public void setReserved_qty_sign(int reserved_qty_sign) {
        this.reserved_qty_sign = reserved_qty_sign;
    }

    public String getAval_qty() {
        return aval_qty;
    }

    public void setAval_qty(String aval_qty) {
        this.aval_qty = aval_qty;
    }

    public int getCanbenegative() {
        return canbenegative;
    }

    public void setCanbenegative(int canbenegative) {
        this.canbenegative = canbenegative;
    }

    public String getWbaQtyFieldName() {
        return wbaQtyFieldName;
    }

    public void setWbaQtyFieldName(String wbaQtyFieldName) {
        this.wbaQtyFieldName = wbaQtyFieldName;
    }

    public int getAccountType() {
        return accountType;
    }

    public void setAccountType(int accountType) {
        this.accountType = accountType;
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

    public String getGaCompareFieldName() {
        return gaCompareFieldName;
    }

    public void setGaCompareFieldName(String gaCompareFieldName) {
        this.gaCompareFieldName = gaCompareFieldName;
    }
}
