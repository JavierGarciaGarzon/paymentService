package com.nttdata.payment.application.usecases;

import com.nttdata.payment.domain.dto.PaymentDTO;
import com.nttdata.payment.domain.dto.request.PaymentRequest;

import java.util.List;

public interface PaymentService {
    PaymentDTO createPayment(PaymentRequest payment);

    List<PaymentDTO> getPaymentsByUserId(Long userId);
}
