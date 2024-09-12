package com.nttdata.payment.application.service;

import com.nttdata.payment.application.mapper.PaymentDtoMapper;
import com.nttdata.payment.application.mapper.PaymentRequestMapper;
import com.nttdata.payment.application.usecases.PaymentService;
import com.nttdata.payment.domain.dto.PaymentDTO;
import com.nttdata.payment.domain.dto.request.PaymentRequest;
import com.nttdata.payment.domain.port.PaymentPersistencePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {

    private final PaymentPersistencePort paymentPersistencePort;
    private final PaymentRequestMapper paymentRequestMapper;
    private final PaymentDtoMapper paymentDtoMapper;

    @Autowired
    public PaymentServiceImpl(PaymentPersistencePort paymentPersistencePort, PaymentRequestMapper paymentRequestMapper, PaymentDtoMapper paymentDtoMapper) {
        this.paymentPersistencePort = paymentPersistencePort;
        this.paymentRequestMapper = paymentRequestMapper;
        this.paymentDtoMapper = paymentDtoMapper;
    }

    @Override
    public PaymentDTO createPayment(PaymentRequest paymentRequest) {
        var paymentToCreate = paymentRequestMapper.requestToDomain(paymentRequest);
        var paymentCreated = paymentPersistencePort.create(paymentToCreate);
        return paymentDtoMapper.paymentToPaymentDto(paymentCreated);
    }

    @Override
    public List<PaymentDTO> getPaymentsByUserId(Long userId) {
        return paymentPersistencePort.findByUserId(userId).stream().map(paymentDtoMapper::paymentToPaymentDto).toList();
    }
}