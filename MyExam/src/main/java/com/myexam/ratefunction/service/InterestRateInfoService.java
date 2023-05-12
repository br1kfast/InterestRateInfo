package com.myexam.ratefunction.service;


import com.myexam.ratefunction.mapper.DeleteMapper;
import com.myexam.ratefunction.mapper.InsertMapper;
import com.myexam.ratefunction.mapper.SelectMapper;
import com.myexam.ratefunction.mapper.UpdateMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.sql.Date;


/**
 * @author JunFei
 * @data
 * @purpose InterestRateInfoService类
 */
@Service
public class InterestRateInfoService {

    @Autowired
    private DeleteMapper deleteMapper;

    @Autowired
    private InsertMapper insertMapper;

    @Autowired
    private SelectMapper selectMapper;

    @Autowired
    private UpdateMapper updateMapper;


    public int addOneInterestRateInfo(String bankno,
                                      String branchcode,
                                      String brcno,
                                      String ratecode,
                                      String ccy,
                                      Integer ratterm,
                                      String ratunit,
                                      Date dateval,
                                      String intcodd,
                                      String custratflg,
                                      String rattype,
                                      String flgint,
                                      BigDecimal intrate,
                                      String flgflt,
                                      BigDecimal intflt,
                                      String wayfint,
                                      BigDecimal uppct,
                                      BigDecimal downpct,
                                      BigDecimal fupper,
                                      BigDecimal downper,
                                      String baintno,
                                      Integer baratterm,
                                      String baratunit,
                                      BigDecimal bakamt,
                                      String bakfld5,
                                      String mainseqno,
                                      String stsval) {
        return insertMapper.addOneInterestRateInfo(bankno, branchcode, brcno, ratecode, ccy, ratterm, ratunit, dateval, intcodd, custratflg, rattype, flgint, intrate, flgflt, intflt,
                wayfint, uppct, downpct, fupper, downper, baintno, baratterm, baratunit, bakamt, bakfld5, mainseqno, stsval);

    }

    public int updateOneInterestRateInfo(String bankno,
                                         String branchcode,
                                         String brcno,
                                         String ratecode,
                                         String ccy,
                                         Integer ratterm,
                                         String ratunit,
                                         Date dateval,
                                         String intcodd,
                                         String custratflg,
                                         String rattype,
                                         String flgint,
                                         BigDecimal intrate,
                                         String flgflt,
                                         BigDecimal intflt,
                                         String wayfint,
                                         BigDecimal uppct,
                                         BigDecimal downpct,
                                         BigDecimal fupper,
                                         BigDecimal downper,
                                         String baintno,
                                         Integer baratterm,
                                         String baratunit,
                                         BigDecimal bakamt,
                                         String bakfld5,
                                         String mainseqno,
                                         String stsval) {
        return updateMapper.updateOneInterestRateInfo(bankno, branchcode, brcno, ratecode, ccy, ratterm, ratunit, dateval, intcodd, custratflg, rattype, flgint, intrate, flgflt, intflt, wayfint, uppct, downpct, fupper, downper, baintno, baratterm, baratunit, bakamt, bakfld5, mainseqno, stsval);
    }

    public java.util.List<com.myexam.ratefunction.pojo.InterestRateInfo> selectInterestRateInfoByRateCodeAndCcy(String ratecode, String ccy) {
        return selectMapper.selectInterestRateInfoByRateCodeAndCcy(ratecode, ccy);
    }

    public Integer selectInterestRateInfoCountByRatecode(String ratecode) {
        return selectMapper.selectInterestRateInfoCountByRateCode(ratecode);
    }

    public Integer deleteOneInterestRateInfo(String bankno, String branchcode, String brcno, String ratecode, String ccy, Integer ratterm, String ratunit, Date dateval) {
        return deleteMapper.deleteOneInterestRateInfo(bankno, branchcode, brcno, ratecode, ccy, ratterm, ratunit, dateval);
    }

}
