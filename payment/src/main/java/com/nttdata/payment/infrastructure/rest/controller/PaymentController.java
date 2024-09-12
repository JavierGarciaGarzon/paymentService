package com.nttdata.payment.infrastructure.rest.controller;

import com.nttdata.payment.application.usecases.PaymentService;
import com.nttdata.payment.domain.dto.PaymentDTO;
import com.nttdata.payment.domain.dto.request.PaymentRequest;
import com.nttdata.payment.domain.model.Payment;
import com.nttdata.payment.application.service.PaymentServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping
    public PaymentDTO createPayment(@RequestBody PaymentRequest payment) {
        return paymentService.createPayment(payment);
    }

    @GetMapping("/user/{userId}")
    public List<PaymentDTO> getPaymentsByUserId(@PathVariable Long userId) {
        return paymentService.getPaymentsByUserId(userId);
    }
}