package com.kakaloans.micro.credit.zh.dto;


import com.google.gson.annotations.SerializedName;
import com.kakaloans.micro.credit.zh.dto.sub.TblPbocCrePbRfInfo;
import com.kakaloans.micro.credit.zh.dto.sub.TblPbocInfoSumarry;
import com.kakaloans.micro.credit.zh.dto.sub.TblPbocLoanCardInfo;
import com.kakaloans.micro.credit.zh.dto.sub.TblPbocOverDueRecord;
import com.kakaloans.micro.credit.zh.dto.sub.TblPbocPersionalInfo;
import com.kakaloans.micro.credit.zh.dto.sub.TblPbocProfessional;
import com.kakaloans.micro.credit.zh.dto.sub.TblPbocPublicinfo;
import com.kakaloans.micro.credit.zh.dto.sub.TblPbocQueryrecordcollect;
import com.kakaloans.micro.credit.zh.dto.sub.TblPbocResidenceInfo;
import com.kakaloans.micro.credit.zh.dto.sub.TblPbocResultInfo;

public class ZHCreditInfoResponseBo {

    /**
     * 3.1接口中航征信查询申请的申请编号
     */
    private String reqNo;

    /**
     * 变量
     */
    private String seq;

    /**
     * 中航的报告编号
     */
    private String reportid;

    /**
     * 1信用报告主信息
     */
    @SerializedName(value = "tblPbocResultInfo")
    private TblPbocResultInfo tblPbocResultInfo;

    /**
     * 2身份信息
     */
    @SerializedName(value = "tblPbocPersionalInfo")
    private TblPbocPersionalInfo tblPbocPersionalInfo;

    /**
     * 3居住信息
     */
    private TblPbocResidenceInfo tblPbocResidenceInfo;

    /**
     * 4职业信息
     */
    private TblPbocProfessional tblPbocProfessional;

    /**
     * 5信用提示汇总、6逾期及违约信息概要、7授信及负债信息汇总
     */
    private TblPbocInfoSumarry tblPbocInfoSumarry;

//	/**
//	 * 10贷款信息
//	 */
//	@SerializedName(value="crdCdLns",alternate = "CRD_CD_LN")
//	private List<CrdCdLn> crdCdLns;

    /**
     * 8贷款逾期记录明细
     */
    private TblPbocOverDueRecord tblPbocOverDueRecord;

    /**
     * 9贷记卡信息、10准贷记卡信息
     */
    private TblPbocLoanCardInfo tblPbocLoanCardInfo;

    /**
     * 11查询记录汇总信息
     */
    private TblPbocQueryrecordcollect tblPbocQueryrecordcollect;

    /**
     * 12住房公积金参缴记录
     */
    private TblPbocCrePbRfInfo tblPbocCrePbRfInfo;

    /**
     * 13养老保险金缴存记录
     */
    private TblPbocPublicinfo tblPbocPublicinfo;

    public String getReqNo() {
        return reqNo;
    }

    public void setReqNo(String reqNo) {
        this.reqNo = reqNo;
    }

    public String getSeq() {
        return seq;
    }

    public void setSeq(String seq) {
        this.seq = seq;
    }

    public String getReportid() {
        return reportid;
    }

    public void setReportid(String reportid) {
        this.reportid = reportid;
    }

    public TblPbocResultInfo getTblPbocResultInfo() {
        return tblPbocResultInfo;
    }

    public void setTblPbocResultInfo(TblPbocResultInfo tblPbocResultInfo) {
        this.tblPbocResultInfo = tblPbocResultInfo;
    }

    public TblPbocPersionalInfo getTblPbocPersionalInfo() {
        return tblPbocPersionalInfo;
    }

    public void setTblPbocPersionalInfo(TblPbocPersionalInfo tblPbocPersionalInfo) {
        this.tblPbocPersionalInfo = tblPbocPersionalInfo;
    }

    public TblPbocResidenceInfo getTblPbocResidenceInfo() {
        return tblPbocResidenceInfo;
    }

    public void setTblPbocResidenceInfo(TblPbocResidenceInfo tblPbocResidenceInfo) {
        this.tblPbocResidenceInfo = tblPbocResidenceInfo;
    }

    public TblPbocProfessional getTblPbocProfessional() {
        return tblPbocProfessional;
    }

    public void setTblPbocProfessional(TblPbocProfessional tblPbocProfessional) {
        this.tblPbocProfessional = tblPbocProfessional;
    }

    public TblPbocInfoSumarry getTblPbocInfoSumarry() {
        return tblPbocInfoSumarry;
    }

    public void setTblPbocInfoSumarry(TblPbocInfoSumarry tblPbocInfoSumarry) {
        this.tblPbocInfoSumarry = tblPbocInfoSumarry;
    }

    public TblPbocOverDueRecord getTblPbocOverDueRecord() {
        return tblPbocOverDueRecord;
    }

    public void setTblPbocOverDueRecord(TblPbocOverDueRecord tblPbocOverDueRecord) {
        this.tblPbocOverDueRecord = tblPbocOverDueRecord;
    }

    public TblPbocLoanCardInfo getTblPbocLoanCardInfo() {
        return tblPbocLoanCardInfo;
    }

    public void setTblPbocLoanCardInfo(TblPbocLoanCardInfo tblPbocLoanCardInfo) {
        this.tblPbocLoanCardInfo = tblPbocLoanCardInfo;
    }

    public TblPbocQueryrecordcollect getTblPbocQueryrecordcollect() {
        return tblPbocQueryrecordcollect;
    }

    public void setTblPbocQueryrecordcollect(TblPbocQueryrecordcollect tblPbocQueryrecordcollect) {
        this.tblPbocQueryrecordcollect = tblPbocQueryrecordcollect;
    }

    public TblPbocCrePbRfInfo getTblPbocCrePbRfInfo() {
        return tblPbocCrePbRfInfo;
    }

    public void setTblPbocCrePbRfInfo(TblPbocCrePbRfInfo tblPbocCrePbRfInfo) {
        this.tblPbocCrePbRfInfo = tblPbocCrePbRfInfo;
    }

    public TblPbocPublicinfo getTblPbocPublicinfo() {
        return tblPbocPublicinfo;
    }

    public void setTblPbocPublicinfo(TblPbocPublicinfo tblPbocPublicinfo) {
        this.tblPbocPublicinfo = tblPbocPublicinfo;
    }


}
