package com.myexam.ratefunction.pojo;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.math.BigDecimal;

/**
 * @author JunFei
 * @data
 * @purpose 利率种类类
 */
@Component
public class InterestRateType {

    @NotBlank
    private String bankno;
    @NotBlank
    private String ratecode;
    @NotBlank
    private String ccy;
    @NotBlank
    private Integer ratterm;
    @NotBlank @Pattern(regexp = "[YMD]", message = "只能输入Y，M，D")
    private String ratunit;
    private String flgint;
    @Pattern(regexp = "[0-2]", message = "只能输入0，1，2")
    private String intcop;
    private String intdesc;
    @Pattern(regexp = "[0-5]", message = "只能输入0，1，2，3，4，5")
    private String intntyp;
    private BigDecimal bakamt;
    private String bakfld5;
    private String mainseqno;
    @Pattern(regexp = "[0-1]", message = "只能输入0，1")
    private String stsval;


    public String getBankno() {
        return bankno;
    }

    public String getRatecode() {
        return ratecode;
    }

    public String getCcy() {
        return ccy;
    }

    public Integer getRatterm() {
        return ratterm;
    }

    public String getRatunit() {
        return ratunit;
    }

    public String getFlgint() {
        return flgint;
    }

    public String getIntcop() {
        return intcop;
    }

    public String getIntdesc() {
        return intdesc;
    }

    public String getIntntyp() {
        return intntyp;
    }

    public BigDecimal getBakamt() {
        return bakamt;
    }

    public String getBakfld5() {
        return bakfld5;
    }

    public String getMainseqno() {
        return mainseqno;
    }

    public String getStsval() {
        return stsval;
    }

    public void setBankno(String bankno) {
        this.bankno = bankno;
    }

    public void setRatecode(String ratecode) {
        this.ratecode = ratecode;
    }

    public void setCcy(String ccy) {
        this.ccy = ccy;
    }

    public void setRatterm(Integer ratterm) {
        this.ratterm = ratterm;
    }

    public void setRatunit(String ratunit) {
        this.ratunit = ratunit;
    }

    public void setFlgint(String flgint) {
        this.flgint = flgint;
    }

    public void setIntcop(String intcop) {
        this.intcop = intcop;
    }

    public void setIntdesc(String intdesc) {
        this.intdesc = intdesc;
    }

    public void setIntntyp(String intntyp) {
        this.intntyp = intntyp;
    }

    public void setBakamt(BigDecimal bakamt) {
        this.bakamt = bakamt;
    }

    public void setBakfld5(String bakfld5) {
        this.bakfld5 = bakfld5;
    }

    public void setMainseqno(String mainseqno) {
        this.mainseqno = mainseqno;
    }

    public void setStsval(String stsval) {
        this.stsval = stsval;
    }

    @Override
    public String toString() {
        return "InterestRateType{" +
                "bankno='" + bankno + '\'' +
                ", ratecode='" + ratecode + '\'' +
                ", ccy='" + ccy + '\'' +
                ", ratterm=" + ratterm +
                ", ratunit='" + ratunit + '\'' +
                ", flgint='" + flgint + '\'' +
                ", intcop='" + intcop + '\'' +
                ", intdesc='" + intdesc + '\'' +
                ", intntyp='" + intntyp + '\'' +
                ", bakamt=" + bakamt +
                ", bakfld5='" + bakfld5 + '\'' +
                ", mainseqno='" + mainseqno + '\'' +
                ", stsval='" + stsval + '\'' +
                '}';
    }
}
