package com.rayyanshaikh.ecom.services.admin.coupon;

import com.rayyanshaikh.ecom.entity.Coupon;

import java.util.List;

public interface AdminCouponService {
    Coupon createCoupon(Coupon coupon);

    List<Coupon> getAllCoupons();
}
