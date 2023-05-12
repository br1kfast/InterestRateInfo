package com.myexam.ratefunction.mapper;

import com.myexam.ratefunction.pojo.InterestRateInfo;
import com.myexam.ratefunction.pojo.InterestRateType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.sql.Date;
import java.util.List;

/**
 * @author JunFei
 * @data
 * @purpose SelectMapper接口
 */
@Mapper
public interface SelectMapper {

    /**
     * 按利率编号和银行号查询利率种类
     * */
    List<InterestRateType> selectInterestRateTypeByBankNoAndRateCode(@Param("bankno") String bankno, @Param("ratecode") String ratecode);

    /**
     * 按利率编号和币种查询利率基本信息
     * */
    List<InterestRateInfo> selectInterestRateInfoByRateCodeAndCcy(@Param("ratecode") String ratecode, @Param("ccy") String ccy);

    /**
     * 按利率编号在利率基本信息表中查询记录条数
     * */
    Integer selectInterestRateInfoCountByRateCode(@Param("ratecode") String ratecode);
}
