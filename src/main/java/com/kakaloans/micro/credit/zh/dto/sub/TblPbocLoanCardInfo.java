package com.kakaloans.micro.credit.zh.dto.sub;

import java.util.List;


public class TblPbocLoanCardInfo {

    /**
     * 9贷记卡信息、10准贷记卡信息
     */
    private List<CardRecord> cardRecord;

    public List<CardRecord> getCardRecord() {
        return cardRecord;
    }

    public void setCardRecord(List<CardRecord> cardRecord) {
        this.cardRecord = cardRecord;
    }


}
