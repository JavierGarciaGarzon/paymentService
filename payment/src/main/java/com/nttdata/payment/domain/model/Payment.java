package com.nttdata.payment.domain.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    private Long id;
    private String cardNumber;
    private BigDecimal amount;
    private LocalDate paymentDate;
    private String description;
    private Long userId;
}