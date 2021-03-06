package com.ijinshan.sjk.vo;

// Generated 2013-1-8 15:05:30 by Hibernate Tools 4.0.0

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * 新增相同名字的vo，为了防止传入空值报错
 * BigGamePack generated by hbm2java
 */
public class BigGamePack implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private Integer bigGamePackId;
    private Integer marketAppId;
    private Integer cputype;
    private String url;
    private Integer size;
    private Long freeSize;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date marketUpdateTime;
    private String unsupportPhoneType;
    
    public BigGamePack() {
        super();
    }

    public BigGamePack(Integer bigGamePackId, Integer marketAppId, Integer cputype, String url, Integer size,
            Long freeSize, Date marketUpdateTime, String unsupportPhoneType) {
        super();
        this.bigGamePackId = bigGamePackId;
        this.marketAppId = marketAppId;
        this.cputype = cputype;
        this.url = url;
        this.size = size;
        this.freeSize = freeSize;
        this.marketUpdateTime = marketUpdateTime;
        this.unsupportPhoneType = unsupportPhoneType;
    }

    public Integer getBigGamePackId() {
        return bigGamePackId;
    }

    public void setBigGamePackId(Integer bigGamePackId) {
        this.bigGamePackId = bigGamePackId;
    }

    public Integer getMarketAppId() {
        return marketAppId;
    }

    public void setMarketAppId(Integer marketAppId) {
        this.marketAppId = marketAppId;
    }

    public Integer getCputype() {
        return cputype;
    }

    public void setCputype(Integer cputype) {
        this.cputype = cputype;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Long getFreeSize() {
        return freeSize;
    }

    public void setFreeSize(Long freeSize) {
        this.freeSize = freeSize;
    }

    public Date getMarketUpdateTime() {
        return marketUpdateTime;
    }

    public void setMarketUpdateTime(Date marketUpdateTime) {
        this.marketUpdateTime = marketUpdateTime;
    }

    public String getUnsupportPhoneType() {
        return unsupportPhoneType;
    }

    public void setUnsupportPhoneType(String unsupportPhoneType) {
        this.unsupportPhoneType = unsupportPhoneType;
    }

}
