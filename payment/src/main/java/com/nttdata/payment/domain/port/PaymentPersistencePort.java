package com.nttdata.payment.domain.port;

import com.nttdata.payment.domain.model.Payment;

import java.util.List;

public interface PaymentPersistencePort {
    List<Payment> findByUserId(Long userId);

    Payment create(Payment payment);

}
