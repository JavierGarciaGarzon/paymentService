package com.nttdata.payment.domain.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class PaymentDTO {
    private Long id;
    private String maskedCardNumber;
    private BigDecimal amount;
    private String description;
    private LocalDateTime paymentDate;
    private Long userId;

    public PaymentDTO(Long id, String cardNumber, BigDecimal amount, String description, LocalDateTime paymentDate, Long userId) {
        this.id = id;
        this.maskedCardNumber = maskCardNumber(cardNumber);
        this.amount = amount;
        this.description = description;
        this.paymentDate = paymentDate;
        this.userId = userId;
    }

    private String maskCardNumber(String cardNumber) {
        return "****-****-****-" + cardNumber.substring(cardNumber.length() - 4);
    }
}