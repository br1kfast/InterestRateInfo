package com.myexam.ratefunction.pojo;

import org.springframework.stereotype.Component;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.math.BigDecimal;
import java.sql.Date;

/**
 * @author JunFei
 * @data
 * @purpose 利率基本信息类
 */
@Component
public class InterestRateInfo {
    @NotBlank
    private String bankno;
    @NotBlank
    private String branchcode;
    @NotBlank
    private String brcno;
    @NotBlank
    private String ratecode;
    @NotBlank
    private String ccy;
    @NotBlank
    private Integer ratterm;
    @NotBlank @Pattern(regexp = "[YMD]")
    private String ratunit;
    @NotBlank @Pattern(regexp = "((\\d{3}[1-9]|\\d{2}[1-9]\\d|\\d[1-9]\\d{2}|[1-9]\\d{3})(((0[13578]|1[02])(0[1-9]|[12]\\d|3[01]))|((0[469]|11)(0[1-9]|[12]\\d|30))|(02(0[1-9]|[1]\\d|2[0-8]))))|(((\\d{2})(0[48]|[2468][048]|[13579][26])|((0[48]|[2468][048]|[3579][26])00))0229)")
    private Date dateval;
    private String intcodd;
    @Pattern(regexp = "[0-1]")
    private String custratflg;
    @NotBlank @Pattern(regexp = "[YMD]")
    private String rattype;
    @Pattern(regexp = "[0-1]")
    private String flgint;
    private BigDecimal intrate;
    @Pattern(regexp = "[0][1-3]")
    private String flgflt;
    private BigDecimal intflt;
    @Pattern(regexp = "[0][1-3]")
    private String wayfint;
    private BigDecimal uppct;
    private BigDecimal downpct;
    private BigDecimal fupper;
    private BigDecimal downper;
    private String baintno;
    private Integer baratterm;
    @NotBlank @Pattern(regexp = "[YMD]")
    private String baratunit;
    private BigDecimal bakamt;
    private String bakfld5;
    private String mainseqno;
    @Pattern(regexp = "[0-1]")
    private String stsval;

    public String getBankno() {
        return bankno;
    }

    public void setBankno(String bankno) {
        this.bankno = bankno;
    }

    public String getBranchcode() {
        return branchcode;
    }

    public void setBranchcode(String branchcode) {
        this.branchcode = branchcode;
    }

    public String getBrcno() {
        return brcno;
    }

    public void setBrcno(String brcno) {
        this.brcno = brcno;
    }

    public String getRatecode() {
        return ratecode;
    }

    public void setRatecode(String ratecode) {
        this.ratecode = ratecode;
    }

    public String getCcy() {
        return ccy;
    }

    public void setCcy(String ccy) {
        this.ccy = ccy;
    }

    public Integer getRatterm() {
        return ratterm;
    }

    public void setRatterm(Integer ratterm) {
        this.ratterm = ratterm;
    }

    public String getRatunit() {
        return ratunit;
    }

    public void setRatunit(String ratunit) {
        this.ratunit = ratunit;
    }

    public Date getDateval() {
        return dateval;
    }

    public void setDateval(Date dateval) {
        this.dateval = dateval;
    }

    public String getIntcodd() {
        return intcodd;
    }

    public void setIntcodd(String intcodd) {
        this.intcodd = intcodd;
    }

    public String getCustratflg() {
        return custratflg;
    }

    public void setCustratflg(String custratflg) {
        this.custratflg = custratflg;
    }

    public String getRattype() {
        return rattype;
    }

    public void setRattype(String rattype) {
        this.rattype = rattype;
    }

    public String getFlgint() {
        return flgint;
    }

    public void setFlgint(String flgint) {
        this.flgint = flgint;
    }

    public BigDecimal getIntrate() {
        return intrate;
    }

    public void setIntrate(BigDecimal intrate) {
        this.intrate = intrate;
    }

    public String getFlgflt() {
        return flgflt;
    }

    public void setFlgflt(String flgflt) {
        this.flgflt = flgflt;
    }

    public BigDecimal getIntflt() {
        return intflt;
    }

    public void setIntflt(BigDecimal intflt) {
        this.intflt = intflt;
    }

    public String getWayfint() {
        return wayfint;
    }

    public void setWayfint(String wayfint) {
        this.wayfint = wayfint;
    }

    public BigDecimal getUppct() {
        return uppct;
    }

    public void setUppct(BigDecimal uppct) {
        this.uppct = uppct;
    }

    public BigDecimal getDownpct() {
        return downpct;
    }

    public void setDownpct(BigDecimal downpct) {
        this.downpct = downpct;
    }

    public BigDecimal getFupper() {
        return fupper;
    }

    public void setFupper(BigDecimal fupper) {
        this.fupper = fupper;
    }

    public BigDecimal getDownper() {
        return downper;
    }

    public void setDownper(BigDecimal downper) {
        this.downper = downper;
    }

    public String getBaintno() {
        return baintno;
    }

    public void setBaintno(String baintno) {
        this.baintno = baintno;
    }

    public Integer getBaratterm() {
        return baratterm;
    }

    public void setBaratterm(Integer baratterm) {
        this.baratterm = baratterm;
    }

    public String getBaratunit() {
        return baratunit;
    }

    public void setBaratunit(String baratunit) {
        this.baratunit = baratunit;
    }

    public BigDecimal getBakamt() {
        return bakamt;
    }

    public void setBakamt(BigDecimal bakamt) {
        this.bakamt = bakamt;
    }

    public String getBakfld5() {
        return bakfld5;
    }

    public void setBakfld5(String bakfld5) {
        this.bakfld5 = bakfld5;
    }

    public String getMainseqno() {
        return mainseqno;
    }

    public void setMainseqno(String mainseqno) {
        this.mainseqno = mainseqno;
    }

    public String getStsval() {
        return stsval;
    }

    public void setStsval(String stsval) {
        this.stsval = stsval;
    }

    @Override
    public String toString() {
        return "InterestRateInfo{" +
                "bankno='" + bankno + '\'' +
                ", branchcode='" + branchcode + '\'' +
                ", brcno='" + brcno + '\'' +
                ", ratecode='" + ratecode + '\'' +
                ", ccy='" + ccy + '\'' +
                ", ratterm=" + ratterm +
                ", ratunit='" + ratunit + '\'' +
                ", dateval=" + dateval +
                ", intcodd='" + intcodd + '\'' +
                ", custratflg='" + custratflg + '\'' +
                ", rattype='" + rattype + '\'' +
                ", flgint='" + flgint + '\'' +
                ", intrate=" + intrate +
                ", flgflt='" + flgflt + '\'' +
                ", intflt=" + intflt +
                ", wayfint='" + wayfint + '\'' +
                ", uppct=" + uppct +
                ", downpct=" + downpct +
                ", fupper=" + fupper +
                ", downper=" + downper +
                ", baintno='" + baintno + '\'' +
                ", baratterm=" + baratterm +
                ", baratunit='" + baratunit + '\'' +
                ", bakamt=" + bakamt +
                ", bakfld5='" + bakfld5 + '\'' +
                ", mainseqno='" + mainseqno + '\'' +
                ", stsval='" + stsval + '\'' +
                '}';
    }
}
