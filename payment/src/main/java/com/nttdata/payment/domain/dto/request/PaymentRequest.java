package com.nttdata.payment.domain.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PaymentRequest {
    private Long id;
    private String cardNumber;
    private BigDecimal amount;
    private LocalDateTime paymentDate;
    private String description;
    private Long userId;
}
