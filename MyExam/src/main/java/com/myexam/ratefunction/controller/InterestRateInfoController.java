package com.myexam.ratefunction.controller;

import com.myexam.ratefunction.pojo.InterestRateInfo;
import com.myexam.ratefunction.service.InterestRateInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.sql.Date;
import java.util.List;

/**
 * @author JunFei
 * @data
 * @purpose InterestRateInfo的Controller类
 */
@RestController
@RequestMapping("/interestRateInfo")
public class InterestRateInfoController {
    @Autowired
    private InterestRateInfoService interestRateInfoService;


    /*** 添加利率基本信息方法
     * @param interestRateInfo 利率基本信息对象
     * @return 返回操作是否成功字符串信息
     * */
    @PostMapping
    public String addNewInterestRateInfo(@Valid InterestRateInfo interestRateInfo) {
        Integer result = interestRateInfoService.addOneInterestRateInfo(interestRateInfo.getBankno(),
                                                                        interestRateInfo.getBranchcode(),
                                                                        interestRateInfo.getBrcno(),
                                                                        interestRateInfo.getRatecode(),
                                                                        interestRateInfo.getCcy(),
                                                                        interestRateInfo.getRatterm(),
                                                                        interestRateInfo.getRatunit(),
                                                                        interestRateInfo.getDateval(),
                                                                        interestRateInfo.getIntcodd(),
                                                                        interestRateInfo.getCustratflg(),
                                                                        interestRateInfo.getRattype(),
                                                                        interestRateInfo.getFlgint(),
                                                                        interestRateInfo.getIntrate(),
                                                                        interestRateInfo.getFlgflt(),
                                                                        interestRateInfo.getIntflt(),
                                                                        interestRateInfo.getWayfint(),
                                                                        interestRateInfo.getUppct(),
                                                                        interestRateInfo.getDownpct(),
                                                                        interestRateInfo.getFupper(),
                                                                        interestRateInfo.getDownper(),
                                                                        interestRateInfo.getBaintno(),
                                                                        interestRateInfo.getBaratterm(),
                                                                        interestRateInfo.getBaratunit(),
                                                                        interestRateInfo.getBakamt(),
                                                                        interestRateInfo.getBakfld5(),
                                                                        interestRateInfo.getMainseqno(),
                                                                        interestRateInfo.getStsval());
        if (result.equals(1)) {
            return "add one succeed";
        } else {
            return "add one fail";
        }
    }

    /*** 更新利率基本信息方法
     * @param interestRateInfo 利率基本信息对象
     * @return 返回操作是否成功字符串信息
     * */
    @PutMapping
    public String updateOneInterestRateInfo(@Valid InterestRateInfo interestRateInfo) {
        Integer result = interestRateInfoService.updateOneInterestRateInfo(interestRateInfo.getBankno(),
                                                                            interestRateInfo.getBranchcode(),
                                                                            interestRateInfo.getBrcno(),
                                                                            interestRateInfo.getRatecode(),
                                                                            interestRateInfo.getCcy(),
                                                                            interestRateInfo.getRatterm(),
                                                                            interestRateInfo.getRatunit(),
                                                                            interestRateInfo.getDateval(),
                                                                            interestRateInfo.getIntcodd(),
                                                                            interestRateInfo.getCustratflg(),
                                                                            interestRateInfo.getRattype(),
                                                                            interestRateInfo.getFlgint(),
                                                                            interestRateInfo.getIntrate(),
                                                                            interestRateInfo.getFlgflt(),
                                                                            interestRateInfo.getIntflt(),
                                                                            interestRateInfo.getWayfint(),
                                                                            interestRateInfo.getUppct(),
                                                                            interestRateInfo.getDownpct(),
                                                                            interestRateInfo.getFupper(),
                                                                            interestRateInfo.getDownper(),
                                                                            interestRateInfo.getBaintno(),
                                                                            interestRateInfo.getBaratterm(),
                                                                            interestRateInfo.getBaratunit(),
                                                                            interestRateInfo.getBakamt(),
                                                                            interestRateInfo.getBakfld5(),
                                                                            interestRateInfo.getMainseqno(),
                                                                            interestRateInfo.getStsval());
        if (result.equals(1)) {
            return "update one succeed";
        } else {
            return "update one fail";
        }
    }

    /*** 删除利率基本信息方法，传入参数为主键参数
     * @return 返回操作是否成功字符串信息
     * */
    @DeleteMapping("/{bankno}/{branchcode}/{brcno}/{ratecode}/{ccy}/{ratterm}/{ratunit}/{dateval}")
    public String deleteOneInterestRateInfo(@NotBlank @PathVariable("bankno") String bankno,
                                            @NotBlank @PathVariable("branchcode") String branchcode,
                                            @NotBlank @PathVariable("brcno") String brcno,
                                            @NotBlank @PathVariable("ratecode") String ratecode,
                                            @NotBlank @PathVariable("ccy") String ccy,
                                            @NotBlank @PathVariable("ratterm") Integer ratterm,
                                            @NotBlank @Pattern(regexp = "[YMD]") @PathVariable("ratunit") String ratunit,
                                            @NotBlank @Pattern(regexp = "((\\d{3}[1-9]|\\d{2}[1-9]\\d|\\d[1-9]\\d{2}|[1-9]\\d{3})(((0[13578]|1[02])(0[1-9]|[12]\\d|3[01]))|((0[469]|11)(0[1-9]|[12]\\d|30))|(02(0[1-9]|[1]\\d|2[0-8]))))|(((\\d{2})(0[48]|[2468][048]|[13579][26])|((0[48]|[2468][048]|[3579][26])00))0229)") @PathVariable("dateval") Date dateval) {
        Integer result = interestRateInfoService.deleteOneInterestRateInfo(bankno, branchcode, brcno, ratecode, ccy, ratterm, ratunit, dateval);
        if (result.equals(1)) {
            return "delete one succeed";
        } else {
            return "delete one fail";
        }
    }

    /*** 按利率编号和币种查询利率基本信息方法
     * @param  ratecode 利率编号
     * @param  ccy 币种
     * @return 返回InterestRateInfo类的列表
     * */
    @GetMapping("/{ratecode}/{ccy}")
    public List<InterestRateInfo> selectInterestRateInfoByRateCodeAndCcy(@NotBlank @PathVariable("ratecode") String ratecode, @NotBlank @PathVariable("ccy") String ccy) {
        List<InterestRateInfo> interestRateInfos = interestRateInfoService.selectInterestRateInfoByRateCodeAndCcy(ratecode, ccy);
        return interestRateInfos;
    }



}
