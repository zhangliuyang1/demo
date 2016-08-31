package com.zly.model;

import java.math.BigDecimal;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2016/7/21  18:07
 */
public class SeedProductDetail {
    private Long seedProductId;
    private String name;
    private String picture;
    private BigDecimal price;
    private Integer seedNum;
    private Integer isSeed;

    public SeedProductDetail(Long seedProductId, String name, String picture, BigDecimal price, Integer seedNum, Integer isSeed) {
        this.seedProductId = seedProductId;
        this.name = name;
        this.picture = picture;
        this.price = price;
        this.seedNum = seedNum;
        this.isSeed = isSeed;
    }

    public Long getSeedProductId() {
        return seedProductId;
    }

    public void setSeedProductId(Long seedProductId) {
        this.seedProductId = seedProductId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getSeedNum() {
        return seedNum;
    }

    public void setSeedNum(Integer seedNum) {
        this.seedNum = seedNum;
    }

    public Integer getIsSeed() {
        return isSeed;
    }

    public void setIsSeed(Integer isSeed) {
        this.isSeed = isSeed;
    }
}
