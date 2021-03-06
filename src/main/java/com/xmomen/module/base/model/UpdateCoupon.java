package com.xmomen.module.base.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.validation.constraints.NotNull;

import lombok.Data;

/**
 * Created by Jeng on 2016/3/30.
 */
public @Data class UpdateCoupon implements Serializable {

    @NotNull
    private Integer id;
    @NotNull
    private Integer couponType;
    private Integer couponCategory;
    private String couponDesc;
    private String couponNumber;
    private String couponPassword;
    private Date beginTime;
    private Date endTime;
    private BigDecimal couponValue;
    private BigDecimal userPrice;
    private Integer isUsed;
    private Integer isUseful;
    private Integer isGift;
    private String notes;
    private Integer paymentType;
}
