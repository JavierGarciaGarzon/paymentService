package com.nttdata.payment.infrastructure.adapter.mapper;

import com.nttdata.payment.domain.model.Payment;
import com.nttdata.payment.infrastructure.adapter.entity.PaymentEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PaymentDboMapper {

    @Mapping(source ="userId", target = "user.id")
    PaymentEntity paymentToEntity(Payment domain);

    @InheritInverseConfiguration
    Payment entityToPayment(PaymentEntity entity);
}
