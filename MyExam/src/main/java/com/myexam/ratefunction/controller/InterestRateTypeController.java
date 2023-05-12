package com.myexam.ratefunction.controller;

import com.myexam.ratefunction.pojo.InterestRateType;
import com.myexam.ratefunction.service.InterestRateInfoService;
import com.myexam.ratefunction.service.InterestRateTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.List;

/**
 * @author JunFei
 * @data
 * @purpose InterestRateType的Controller类
 */
@RestController
public class InterestRateTypeController {

    @Autowired
    private InterestRateTypeService interestRateTypeService;

    @Autowired
    private InterestRateInfoService interestRateInfoService;

    /*** 添加利率种类方法
     * @param interestRateType 利率种类对象
     * @return 返回操作是否成功字符串信息
     * */
    @PostMapping
    public String addNewInterestRateType(@Valid InterestRateType interestRateType) {
        Integer result = interestRateTypeService.addOneInterestRateType(interestRateType.getBankno(),
                                                                        interestRateType.getRatecode(),
                                                                        interestRateType.getCcy(),
                                                                        interestRateType.getRatterm(),
                                                                        interestRateType.getRatunit(),
                                                                        interestRateType.getFlgint(),
                                                                        interestRateType.getIntcop(),
                                                                        interestRateType.getIntdesc(),
                                                                        interestRateType.getIntntyp(),
                                                                        interestRateType.getBakamt(),
                                                                        interestRateType.getBakfld5(),
                                                                        interestRateType.getMainseqno(),
                                                                        interestRateType.getStsval());
        if (result.equals(1)) {
            return "add one succeed";
        } else {
            return "add one fail";
        }
    }

    /*** 更新利率种类方法
     * @param interestRateType 利率种类对象
     * @return 返回操作是否成功字符串信息
     * */
    @PutMapping
    public String updateOneInterestRateType(@Valid InterestRateType interestRateType) {
        Integer result = interestRateTypeService.updateOneInterestRateType(interestRateType.getBankno(),
                                                                            interestRateType.getRatecode(),
                                                                            interestRateType.getCcy(),
                                                                            interestRateType.getRatterm(),
                                                                            interestRateType.getRatunit(),
                                                                            interestRateType.getFlgint(),
                                                                            interestRateType.getIntcop(),
                                                                            interestRateType.getIntdesc(),
                                                                            interestRateType.getIntntyp(),
                                                                            interestRateType.getBakamt(),
                                                                            interestRateType.getBakfld5(),
                                                                            interestRateType.getMainseqno(),
                                                                            interestRateType.getStsval());
        if (result.equals(1)) {
            return "update one succeed";
        } else {
            return "update one fail";
        }
    }

    /*** 删除利率种类方法，传入参数为主键
     * @return 返回操作是否成功字符串信息
     * */
    @DeleteMapping("/{bankno}/{ratecode}/{ccy}/{ratterm}/{ratunit}")
    public String deleteOneInterestRateType(@NotBlank @PathVariable("bankno") String bankno,
                                            @NotBlank @PathVariable("ratecode") String ratecode,
                                            @NotBlank @PathVariable("ccy") String ccy,
                                            @NotBlank @PathVariable("ratterm") Integer ratterm,
                                            @NotBlank @Pattern(regexp = "[YMD]", message = "只能输入Y，M，D") @PathVariable("ratunit") String ratunit) {
        //先根据ratecode查询InterestRateInfo表，检查是否有记录使用该InterestRateType
        Integer count = interestRateInfoService.selectInterestRateInfoCountByRatecode(ratecode);
        //如果有则返回无法删除，没有则进行删除操作
        if (count >= 1) {
            return "delete not allowed";
        } else {
            Integer result = interestRateTypeService.deleteOneInterestRateType(bankno, ratecode, ccy, ratterm, ratunit);
            if (result.equals(1)) {
                return "delete one succeed";
            } else {
                return "delete one fail";
            }
        }
    }

    /*** 按利率编号和银行号查询利率种类方法
     * @param  bankno 银行号
     * @param  ratecode 利率编号
     * @return 返回InterestRateType列表
     * */
    @GetMapping("/{bankno}/{ratecode}")
    public List<InterestRateType> selectInterestRateTypeByBankNoAndRateCode(@NotBlank @PathVariable("bankno") String bankno, @NotBlank @PathVariable("ratecode") String ratecode) {
        List<InterestRateType> interestRateTypes = interestRateTypeService.selectInterestRateTypeByBankNoAndRateCode(bankno, ratecode);
        return interestRateTypes;
    }

}

