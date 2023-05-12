package com.myexam.ratefunction.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.sql.Date;

/**
 * @author JunFei
 * @data
 * @purpose DeleteMapper接口
 */
@Mapper
public interface DeleteMapper {

    /**
     * 删除一条InterestRateInfo
     * */
    int deleteOneInterestRateInfo(@Param("bankno") String bankno,
                                  @Param("branchcode") String branchcode,
                                  @Param("brcno") String brcno,
                                  @Param("ratecode") String ratecode,
                                  @Param("ccy") String ccy,
                                  @Param("ratterm") Integer ratterm,
                                  @Param("ratunit") String ratunit,
                                  @Param("dateval") Date dateval);

    /**
     * 删除一条InterestRateType
     * */
    int deleteOneInterestRateType(@Param("bankno") String bankno,
                                  @Param("ratecode") String ratecode,
                                  @Param("ccy") String ccy,
                                  @Param("ratterm") Integer ratterm,
                                  @Param("ratunit") String ratunit);
}
