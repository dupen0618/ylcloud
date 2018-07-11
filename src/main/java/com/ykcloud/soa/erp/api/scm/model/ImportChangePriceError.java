package com.ykcloud.soa.erp.api.scm.model;

/**
 * 售价调整导入明细
 * @author pengh
 */
public class ImportChangePriceError extends ImportChangePrice {
	
	private static final long serialVersionUID = 1L;
	
	/**
     * 门店简码
     */
    private String subUnitId;
    
	/**
	 * 错误信息
	 */
    private String importError;
    
    
    
    public String getImportError() {
        return importError;
    }
    public void setImportError(String importError) {
        this.importError = importError;
    }
    public String getSubUnitId() {
        return subUnitId;
    }
    public void setSubUnitId(String subUnitId) {
        this.subUnitId = subUnitId;
    }
    

}
