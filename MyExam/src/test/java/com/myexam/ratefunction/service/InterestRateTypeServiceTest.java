package com.myexam.ratefunction.service;

import com.myexam.ratefunction.pojo.InterestRateType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;


/**
 * @author JunFei
 * @data
 * @purpose InterestRateTypeService单元测试类
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class InterestRateTypeServiceTest {

    @Autowired
    private InterestRateTypeService interestRateTypeService;

    /**
     * 测试添加
     * */
    @Test
    public void TestInsert() {
        Integer result = interestRateTypeService.addOneInterestRateType("111", "2222", "CNY", 333, "D", "6", "1", "OK", "1", new BigDecimal("99.99"), "10", "11", "1");
        if (result.equals(1)) {
            System.out.println("成功");
        } else {
            System.out.println("失败");
        }
    }

    /**
     * 测试查询
     * */
    @Test
    public void TestSelect() {
        List<InterestRateType> interestRateType = interestRateTypeService.selectInterestRateTypeByBankNoAndRateCode("110", "1111");
        for (InterestRateType o : interestRateType) {
            System.out.println(o.toString());
        }
    }

    /**
     * 测试修改
     * */
    @Test
    public void TestUpdate() {
        Integer result = interestRateTypeService.updateOneInterestRateType("110", "1111", "CNY", 1234, "D", "7", "1", "Sorry", "0", new BigDecimal("10.10"), "10", "11", "1");
        if (result.equals(1)) {
            System.out.println("成功");
        } else {
            System.out.println("失败");
        }
    }

    /**
     * 测试删除
     * */
    @Test
    public void TestDelete() {
        Integer result = interestRateTypeService.deleteOneInterestRateType("110", "1111", "CNY", 1234, "D");
        if (result.equals(1)) {
            System.out.println("成功");
        } else {
            System.out.println("失败");
        }
    }
}
