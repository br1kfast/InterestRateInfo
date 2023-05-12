package com.myexam.ratefunction.service;

import com.myexam.ratefunction.mapper.DeleteMapper;
import com.myexam.ratefunction.mapper.InsertMapper;
import com.myexam.ratefunction.mapper.SelectMapper;
import com.myexam.ratefunction.mapper.UpdateMapper;
import com.myexam.ratefunction.pojo.InterestRateType;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author JunFei
 * @data
 * @purpose InterestRateTypeService类
 */
@Service
public class InterestRateTypeService {

    @Resource
    private InsertMapper insertMapper;

    @Resource
    private SelectMapper selectMapper;

    @Resource
    private UpdateMapper updateMapper;

    @Resource
    private DeleteMapper deleteMapper;


    public List<InterestRateType> selectInterestRateTypeByBankNoAndRateCode(String bankno, String ratecode) {
        return selectMapper.selectInterestRateTypeByBankNoAndRateCode(bankno, ratecode);
    }

    public Integer addOneInterestRateType(String bankno, String ratecode, String ccy, Integer ratterm, String ratunit, String flgint, String intcop, String intdesc, String intntyp, BigDecimal bakamt, String bakfld5, String mainseqno, String stsval) {
        return insertMapper.addOneInterestRateType(bankno, ratecode, ccy, ratterm, ratunit, flgint, intcop, intdesc, intntyp, bakamt, bakfld5, mainseqno, stsval);
    }

    public Integer updateOneInterestRateType(String bankno, String ratecode, String ccy, Integer ratterm, String ratunit, String flgint, String intcop, String intdesc, String intntyp, BigDecimal bakamt, String bakfld5, String mainseqno, String stsval) {
        return updateMapper.updateOneInterestRateType(bankno, ratecode, ccy, ratterm, ratunit, flgint, intcop, intdesc, intntyp, bakamt, bakfld5, mainseqno, stsval);
    }

    public Integer deleteOneInterestRateType(String bankno, String ratecode, String ccy, Integer ratterm, String ratunit) {
        return deleteMapper.deleteOneInterestRateType(bankno, ratecode, ccy, ratterm, ratunit);
    }
}

