package com.nttdata.payment.application.mapper;

import com.nttdata.payment.domain.dto.PaymentDTO;
import com.nttdata.payment.domain.model.Payment;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface PaymentDtoMapper {
    @Mappings({
        @Mapping(source = "id", target = "id"),
        @Mapping(source = "cardNumber", target = "maskedCardNumber"),
        @Mapping(source ="amount", target = "amount"),
        @Mapping(source ="paymentDate", target = "paymentDate"),
        @Mapping(source ="description", target = "description"),
        @Mapping(source ="userId", target = "userId")
    })
    PaymentDTO paymentToPaymentDto(Payment payment);
}
