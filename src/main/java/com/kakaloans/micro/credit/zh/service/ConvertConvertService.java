package com.kakaloans.micro.credit.zh.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.kakaloans.micro.common.util.GsonUtils;
import com.kakaloans.micro.credit.common.util.DesensitizeUtil;
import com.kakaloans.micro.credit.zh.dto.ZHCalculateDataResponseBo;
import com.kakaloans.micro.credit.zh.dto.ZHCreditInfoResponseBo;
import com.kakaloans.micro.credit.zh.dto.ZHResponseBo;
import com.kakaloans.micro.credit.zh.dto.sub.CardRecord;
import com.kakaloans.micro.credit.zh.dto.sub.CrdCdLnOvd;
import com.kakaloans.micro.credit.zh.dto.sub.CrdHdReport;
import com.kakaloans.micro.credit.zh.dto.sub.CrdPiAccfund;
import com.kakaloans.micro.credit.zh.dto.sub.CrdPiEndinsdpt;
import com.kakaloans.micro.credit.zh.dto.sub.CrdPiIdentity;
import com.kakaloans.micro.credit.zh.dto.sub.CrdPiProfessnl;
import com.kakaloans.micro.credit.zh.dto.sub.CrdPiResidence;
import com.kakaloans.micro.credit.zh.dto.sub.CrdQrReordsmr;
import com.kakaloans.micro.credit.zh.dto.sub.Sumarryrecord;
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
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class ConvertConvertService {

    JsonDeserializer<Date> desDate = new JsonDeserializer<Date>() {
        @Override
        public Date deserialize(JsonElement json, Type typeOfT,
                                JsonDeserializationContext context) throws JsonParseException {
            return deserializeDate(json);
        }
    };

    JsonDeserializer<Long> desLong = new JsonDeserializer<Long>() {
        @Override
        public Long deserialize(JsonElement json, Type typeOfT,
                                JsonDeserializationContext context) throws JsonParseException {
            return deserializeLong(json);
        }
    };

    JsonDeserializer<BigDecimal> desBigDecimal = new JsonDeserializer<BigDecimal>() {
        @Override
        public BigDecimal deserialize(JsonElement json, Type typeOfT,
                                      JsonDeserializationContext context) throws JsonParseException {
            return deserializeBigDecimal(json);
        }
    };

    Gson gson = new GsonBuilder()
            .registerTypeAdapter(Date.class, desDate)
            .registerTypeAdapter(Long.class, desLong)
            .registerTypeAdapter(BigDecimal.class, desBigDecimal)
            .create();

    private Date deserializeDate(JsonElement json) {
        try {
            String stringJson = json.getAsString();
            if (StringUtils.isBlank(stringJson)) {
                return null;
            }
            SimpleDateFormat sdf = null;
            if (stringJson.contains(":")) {
                sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
            } else {
                sdf = new SimpleDateFormat("yyyy.MM.dd");
            }
            Date date = sdf.parse(stringJson);
            return date;
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    private Long deserializeLong(JsonElement json) {
        String stringJson = json.getAsString();
        if (StringUtils.isBlank(stringJson)) {
            return null;
        }
        Long parseLong = Long.parseLong(stringJson);
        return parseLong;
    }


    private BigDecimal deserializeBigDecimal(JsonElement json) {
        String stringJson = json.getAsString();
        if (StringUtils.isBlank(stringJson)) {
            return null;
        }
        BigDecimal bigDecimal = new BigDecimal(stringJson);
        return bigDecimal;
    }


    /**
     * 数据转换
     *
     * @return String    返回类型
     * @Title: convertCreditJson
     */
    public String convertCreditJson(String yhCreditJson) {

        ZHResponseBo zhResponseBo = GsonUtils.convertObj(yhCreditJson, ZHResponseBo.class);
        //calculateData数据
        ZHCalculateDataResponseBo calculateData = zhResponseBo.getCalculateData();
        String reqNo = calculateData.getReqNo();
        String seq = calculateData.getSeq();
        //creditData数据
        ZHCreditInfoResponseBo creditData = zhResponseBo.getCreditData();
        //字段脱敏
        ZHCreditInfoResponseBo boAfterDesensitizate = desensitizate(creditData);
        //添加calculateData数据
        boAfterDesensitizate.setReqNo(reqNo);
        boAfterDesensitizate.setSeq(seq);

        String creditJsonAfterDesensitizate = GsonUtils.toJson(boAfterDesensitizate);
        return creditJsonAfterDesensitizate;
    }

    /**
     * 字段脱敏
     *
     * @return ZHCreditInfoResponseBo    返回类型
     * @Title: desensitizate
     */
    public ZHCreditInfoResponseBo desensitizate(ZHCreditInfoResponseBo zhCreditInfoResponseBo) {
        //1信用报告主信息
        TblPbocResultInfo tblPbocResultInfo = zhCreditInfoResponseBo.getTblPbocResultInfo();
        if (null != tblPbocResultInfo) {
            List<CrdHdReport> baseinforecord = tblPbocResultInfo.getBaseinforecord();
            if (CollectionUtils.isNotEmpty(baseinforecord)) {
                for (CrdHdReport crdHdReport : baseinforecord) {
                    DesensitizeUtil.desensitize(crdHdReport);
                }
            }
        }
        //2身份信息
        TblPbocPersionalInfo tblPbocPersionalInfo = zhCreditInfoResponseBo.getTblPbocPersionalInfo();
        if (null != tblPbocPersionalInfo) {
            List<CrdPiIdentity> persionalinforecord = tblPbocPersionalInfo.getPersionalinforecord();
            if (CollectionUtils.isNotEmpty(persionalinforecord)) {
                for (CrdPiIdentity crdPiIdentity : persionalinforecord) {
                    DesensitizeUtil.desensitize(crdPiIdentity);
                }
            }
        }
        //3居住信息
        TblPbocResidenceInfo tblPbocResidenceInfo = zhCreditInfoResponseBo.getTblPbocResidenceInfo();
        if (null != tblPbocResidenceInfo) {
            List<CrdPiResidence> residencerecord = tblPbocResidenceInfo.getResidencerecord();
            if (CollectionUtils.isNotEmpty(residencerecord)) {
                for (CrdPiResidence crdPiResidence : residencerecord) {
                    DesensitizeUtil.desensitize(crdPiResidence);
                }
            }
        }
        //4职业信息
        TblPbocProfessional tblPbocProfessional = zhCreditInfoResponseBo.getTblPbocProfessional();
        if (null != tblPbocProfessional) {
            List<CrdPiProfessnl> professionalrecord = tblPbocProfessional.getProfessionalrecord();
            if (CollectionUtils.isNotEmpty(professionalrecord)) {
                for (CrdPiProfessnl crdPiProfessnl : professionalrecord) {
                    DesensitizeUtil.desensitize(crdPiProfessnl);
                }
            }
        }
        //5信用提示汇总、6逾期及违约信息概要、7授信及负债信息汇总
        TblPbocInfoSumarry tblPbocInfoSumarry = zhCreditInfoResponseBo.getTblPbocInfoSumarry();
        if (null != tblPbocInfoSumarry) {
            List<Sumarryrecord> sumarryrecord = tblPbocInfoSumarry.getSumarryrecord();
            if (CollectionUtils.isNotEmpty(sumarryrecord)) {
                for (Sumarryrecord sumarryrecord2 : sumarryrecord) {
                    DesensitizeUtil.desensitize(sumarryrecord2);
                }
            }
        }
        //8贷款逾期记录明细
        TblPbocOverDueRecord tblPbocOverDueRecord = zhCreditInfoResponseBo.getTblPbocOverDueRecord();
        if (null != tblPbocOverDueRecord) {
            List<CrdCdLnOvd> overdueRecord = tblPbocOverDueRecord.getOverdueRecord();
            if (CollectionUtils.isNotEmpty(overdueRecord)) {
                for (CrdCdLnOvd crdCdLnOvd : overdueRecord) {
                    DesensitizeUtil.desensitize(crdCdLnOvd);
                }
            }
        }
        //9贷记卡信息、10准贷记卡信息
        TblPbocLoanCardInfo tblPbocLoanCardInfo = zhCreditInfoResponseBo.getTblPbocLoanCardInfo();
        if (null != tblPbocLoanCardInfo) {
            List<CardRecord> cardRecord = tblPbocLoanCardInfo.getCardRecord();
            if (CollectionUtils.isNotEmpty(cardRecord)) {
                for (CardRecord cardRecord2 : cardRecord) {
                    DesensitizeUtil.desensitize(cardRecord2);
                }
            }
        }
        //11查询记录汇总信息
        TblPbocQueryrecordcollect tblPbocQueryrecordcollect = zhCreditInfoResponseBo.getTblPbocQueryrecordcollect();
        if (null != tblPbocQueryrecordcollect) {
            List<CrdQrReordsmr> queryrecordcollect = tblPbocQueryrecordcollect.getQueryrecordcollect();
            if (CollectionUtils.isNotEmpty(queryrecordcollect)) {
                for (CrdQrReordsmr crdQrReordsmr : queryrecordcollect) {
                    DesensitizeUtil.desensitize(crdQrReordsmr);
                }
            }
        }
        //12住房公积金参缴记录
        TblPbocCrePbRfInfo tblPbocCrePbRfInfo = zhCreditInfoResponseBo.getTblPbocCrePbRfInfo();
        if (null != tblPbocCrePbRfInfo) {
            List<CrdPiAccfund> crepbrfrecord = tblPbocCrePbRfInfo.getCrepbrfrecord();
            if (CollectionUtils.isNotEmpty(crepbrfrecord)) {
                for (CrdPiAccfund crdPiAccfund : crepbrfrecord) {
                    DesensitizeUtil.desensitize(crdPiAccfund);
                }
            }
        }
        //13养老保险金缴存记录
        TblPbocPublicinfo tblPbocPublicinfo = zhCreditInfoResponseBo.getTblPbocPublicinfo();
        if (null != tblPbocPublicinfo) {
            List<CrdPiEndinsdpt> crdPiEndinsdpt = tblPbocPublicinfo.getCrdPiEndinsdpt();
            if (CollectionUtils.isNotEmpty(crdPiEndinsdpt)) {
                for (CrdPiEndinsdpt crdPiEndinsdpt2 : crdPiEndinsdpt) {
                    DesensitizeUtil.desensitize(crdPiEndinsdpt2);
                }
            }
        }
        return zhCreditInfoResponseBo;
    }


}
