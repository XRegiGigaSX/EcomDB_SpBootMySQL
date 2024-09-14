package com.rayyanshaikh.ecom.services.admin.coupon;

import com.rayyanshaikh.ecom.entity.Coupon;
import com.rayyanshaikh.ecom.exceptions.ValidationException;
import com.rayyanshaikh.ecom.repository.CouponRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AdminCouponServiceImpl implements AdminCouponService {

    private final CouponRepository couponRepository;

    public Coupon createCoupon(Coupon coupon){
        if(couponRepository.existsByCode(coupon.getCode())){
            throw new ValidationException("Coupon Code already exists!");
        }

        return couponRepository.save(coupon);
    }

    public List<Coupon> getAllCoupons(){
        return couponRepository.findAll();
    }
}
