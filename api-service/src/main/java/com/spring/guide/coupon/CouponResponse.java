package com.spring.guide.coupon;

import com.spring.guide.domain.coupon.Coupon;
import com.spring.guide.domain.coupon.CouponCode;
import lombok.Getter;

import java.time.LocalDate;

@Getter
public class CouponResponse {

    private final CouponCode code;
    private final double discount;
    private final LocalDate expirationDate;
    private final boolean expiration;

    public CouponResponse(final Coupon coupon) {
        this.code = coupon.getCode();
        this.discount = coupon.getDiscount();
        this.expirationDate = coupon.getExpirationDate();
        this.expiration = coupon.isExpiration();
    }
}
