package com.myexam.ratefunction.service;

import com.myexam.ratefunction.pojo.InterestRateInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.text.ParseException;
import java.sql.Date;
import java.util.List;


/**
 * @author JunFei
 * @data
 * @purpose InterestRateInfoService单元测试类
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class InterestRateInfoServiceTest {

    @Autowired
    private InterestRateInfoService interestRateInfoService;

    /**
     * 测试添加
     * */
    @Test
    public void TestInsert() throws ParseException {
        String str = "2023-05-12";
        Date date = Date.valueOf(str);
        Integer result = interestRateInfoService.addOneInterestRateInfo("111", "22", "333", "444", "CNY", 234, "D", date, "666", "1", "D", "1", new BigDecimal("22.22"), "01", new BigDecimal("33.33"),
                "01", new BigDecimal("44.44"), new BigDecimal("55.55"), new BigDecimal("66.66"), new BigDecimal("77.77"), "777", 234, "D", new BigDecimal("88.88"), "999", "1000", "1");
        if (result.equals(1)) {
            System.out.println("成功");
        } else {
            System.out.println("失败");
        }
    }

    /**
     * 测试修改
     * */
    @Test
    public void TestUpdate() {
        String str = "2023-05-12";
        Date date = Date.valueOf(str);
        Integer result = interestRateInfoService.updateOneInterestRateInfo("111", "22", "333", "444", "CNY", 234, "D", date, "666", "1", "D", "1", new BigDecimal("22.22"), "01", new BigDecimal("33.33"),
                "01", new BigDecimal("44.44"), new BigDecimal("55.55"), new BigDecimal("66.66"), new BigDecimal("77.77"), "777", 234, "D", new BigDecimal("88.88"), "999", "1000", "1");
        if (result.equals(1)) {
            System.out.println("成功");
        } else {
            System.out.println("操作失败");
        }
    }

    /**
     * 测试查询行数
     * */
    @Test
    public void TestSelect01() {
        Integer count = interestRateInfoService.selectInterestRateInfoCountByRatecode("44");
        System.out.println(count);
    }

    /**
     * 测试查询
     * */
    @Test
    public void TestSelect02() {
        List<InterestRateInfo> interestRateInfo = interestRateInfoService.selectInterestRateInfoByRateCodeAndCcy("44", "55");
        for (InterestRateInfo o : interestRateInfo) {
            System.out.println(o.toString());
        }
    }

    /**
     * 测试删除
     * */
    @Test
    public void TestDelete() {
        String str = "2020-06-06";
        Date date = Date.valueOf(str);
        Integer result = interestRateInfoService.deleteOneInterestRateInfo("111", "22", "33", "44", "55", 66, "7", date);
        if (result.equals(1)) {
            System.out.println("删除成功");
        } else {
            System.out.println("删除失败");
        }
    }
}
