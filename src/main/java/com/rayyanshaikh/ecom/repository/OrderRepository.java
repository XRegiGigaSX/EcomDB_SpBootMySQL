package com.rayyanshaikh.ecom.repository;

import com.rayyanshaikh.ecom.entity.CustomOrder;
import com.rayyanshaikh.ecom.enums.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<CustomOrder, Long> {
    CustomOrder findByUserIdAndOrderStatus(Long userId, OrderStatus orderStatus);

}
