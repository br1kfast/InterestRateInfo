package com.myexam.ratefunction.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.sql.Date;

/**
 * @author JunFei
 * @data
 * @purpose InsertMapper接口
 */
@Mapper
public interface InsertMapper {

    /**
     * 插入一条InterestRateType
     * */
    int addOneInterestRateType(@Param("bankno") String bankno,
                               @Param("ratecode") String ratecode,
                               @Param("ccy") String ccy,
                               @Param("ratterm") Integer ratterm,
                               @Param("ratunit") String ratunit,
                               @Param("flgint") String flgint,
                               @Param("intcop") String intcop,
                               @Param("intdesc") String intdesc,
                               @Param("intntyp") String intntyp,
                               @Param("bakamt") BigDecimal bakamt,
                               @Param("bakfld5") String bakfld5,
                               @Param("mainseqno") String mainseqno,
                               @Param("stsval") String stsval);

    /**
     * 插入一条InterestRateInfo
     * */
    int addOneInterestRateInfo(@Param("bankno") String bankno,
                               @Param("branchcode") String branchcode,
                               @Param("brcno") String brcno,
                               @Param("ratecode") String ratecode,
                               @Param("ccy") String ccy,
                               @Param("ratterm") Integer ratterm,
                               @Param("ratunit") String ratunit,
                               @Param("dateval") Date dateval,
                               @Param("intcodd") String intcodd,
                               @Param("custratflg") String custratflg,
                               @Param("rattype") String rattype,
                               @Param("flgint") String flgint,
                               @Param("intrate") BigDecimal intrate,
                               @Param("flgflt") String flgflt,
                               @Param("intflt") BigDecimal intflt,
                               @Param("wayfint") String wayfint,
                               @Param("uppct") BigDecimal uppct,
                               @Param("downpct") BigDecimal downpct,
                               @Param("fupper") BigDecimal fupper,
                               @Param("downper") BigDecimal downper,
                               @Param("baintno") String baintno,
                               @Param("baratterm") Integer baratterm,
                               @Param("baratunit") String baratunit,
                               @Param("bakamt") BigDecimal bakamt,
                               @Param("bakfld5") String bakfld5,
                               @Param("mainseqno") String mainseqno,
                               @Param("stsval") String stsval);

}
