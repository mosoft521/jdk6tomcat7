package com.kakaloans.micro.credit.zh.dto.sub;

import java.util.List;


public class TblPbocResidenceInfo {

    /**
     * 3居住信息
     */
    private List<CrdPiResidence> residencerecord;

    public List<CrdPiResidence> getResidencerecord() {
        return residencerecord;
    }

    public void setResidencerecord(List<CrdPiResidence> residencerecord) {
        this.residencerecord = residencerecord;
    }


}
