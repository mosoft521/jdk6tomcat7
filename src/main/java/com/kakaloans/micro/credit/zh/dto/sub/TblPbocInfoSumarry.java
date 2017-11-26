package com.kakaloans.micro.credit.zh.dto.sub;

import java.util.List;


public class TblPbocInfoSumarry {

    /**
     * 5信用提示汇总、6逾期及违约信息概要、7授信及负债信息汇总
     */
    private List<Sumarryrecord> sumarryrecord;

    public List<Sumarryrecord> getSumarryrecord() {
        return sumarryrecord;
    }

    public void setSumarryrecord(List<Sumarryrecord> sumarryrecord) {
        this.sumarryrecord = sumarryrecord;
    }

//	/**
//	 * 5信用提示汇总
//	 */
//	@SerializedName(value="crdIsCreditcues",alternate = "CRD_IS_CREDITCUE")
//	private List<CrdIsCreditcue> crdIsCreditcues;
//	
//	/**
//	 * 6逾期及违约信息概要
//	 */
//	@SerializedName(value="crdIsOvdsummarys",alternate = "CRD_IS_OVDSUMMARY")
//	private List<CrdIsOvdsummary> crdIsOvdsummarys;
//	
//	/**
//	 * 7授信及负债信息汇总
//	 */
//	@SerializedName(value="crdIsSharedebts",alternate = "CRD_IS_SHAREDEBT")
//	private List<CrdIsSharedebt> crdIsSharedebts;


}
