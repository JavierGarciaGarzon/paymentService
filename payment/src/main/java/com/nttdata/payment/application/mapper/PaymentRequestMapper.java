package com.nttdata.payment.application.mapper;

import com.nttdata.payment.domain.dto.request.PaymentRequest;
import com.nttdata.payment.domain.model.Payment;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface PaymentRequestMapper {
    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "cardNumber", target = "cardNumber"),
            @Mapping(source = "amount", target = "amount"),
            @Mapping(source = "paymentDate", target = "paymentDate"),
            @Mapping(source = "description", target = "description"),
            @Mapping(source = "userId", target = "userId")
    })
    Payment requestToDomain(PaymentRequest request);
}
