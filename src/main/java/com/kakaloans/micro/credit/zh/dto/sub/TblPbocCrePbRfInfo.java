package com.kakaloans.micro.credit.zh.dto.sub;

import java.util.List;


public class TblPbocCrePbRfInfo {

    /**
     * 12住房公积金参缴记录
     */
    private List<CrdPiAccfund> crepbrfrecord;

    public List<CrdPiAccfund> getCrepbrfrecord() {
        return crepbrfrecord;
    }

    public void setCrepbrfrecord(List<CrdPiAccfund> crepbrfrecord) {
        this.crepbrfrecord = crepbrfrecord;
    }


}
