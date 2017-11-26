package com.kakaloans.micro.credit.zh.dto.sub;

import java.util.List;


public class TblPbocOverDueRecord {

    /**
     * 8贷款逾期记录明细
     */
    private List<CrdCdLnOvd> overdueRecord;

    public List<CrdCdLnOvd> getOverdueRecord() {
        return overdueRecord;
    }

    public void setOverdueRecord(List<CrdCdLnOvd> overdueRecord) {
        this.overdueRecord = overdueRecord;
    }


}
