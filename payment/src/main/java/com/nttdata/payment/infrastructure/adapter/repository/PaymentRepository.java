package com.nttdata.payment.infrastructure.adapter.repository;

import com.nttdata.payment.domain.model.Payment;
import com.nttdata.payment.infrastructure.adapter.entity.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentRepository extends JpaRepository<PaymentEntity, Long> {
    List<PaymentEntity> findByUserId(Long userId);
}
