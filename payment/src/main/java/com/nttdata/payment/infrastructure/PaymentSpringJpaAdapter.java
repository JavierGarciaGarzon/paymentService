package com.nttdata.payment.infrastructure;

import com.nttdata.payment.domain.constants.PaymentConstants;
import com.nttdata.payment.domain.model.Payment;
import com.nttdata.payment.domain.port.PaymentPersistencePort;
import com.nttdata.payment.infrastructure.adapter.exception.PaymentException;
import com.nttdata.payment.infrastructure.adapter.mapper.PaymentDboMapper;
import com.nttdata.payment.infrastructure.adapter.repository.PaymentRepository;
import jakarta.transaction.Transactional;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class PaymentSpringJpaAdapter implements PaymentPersistencePort {
    private final PaymentRepository paymentRepository;
    private final PaymentDboMapper paymentDboMapper;

    public PaymentSpringJpaAdapter(PaymentRepository paymentRepository, PaymentDboMapper paymentDboMapper) {
        this.paymentRepository = paymentRepository;
        this.paymentDboMapper = paymentDboMapper;
    }

    @Override
    public Payment create(Payment payment) {
        var paymentToSave = paymentDboMapper.paymentToEntity(payment);
        var paymentSaved = paymentRepository.save(paymentToSave);

        return paymentDboMapper.entityToPayment(paymentSaved);
    }

    @Override
    public List<Payment> findByUserId(Long userId) {
        List<Payment> payments= paymentRepository.findByUserId(userId).stream().map(paymentDboMapper::entityToPayment).toList();
        if (payments.isEmpty()){
            throw new PaymentException(HttpStatus.NOT_FOUND, PaymentConstants.USER_NOT_FOUND);
        }
        return payments;
    }

}
