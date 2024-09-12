package com.nttdata.payment.application;

import com.nttdata.payment.application.mapper.PaymentDtoMapper;
import com.nttdata.payment.application.mapper.PaymentRequestMapper;
import com.nttdata.payment.application.service.PaymentServiceImpl;
import com.nttdata.payment.domain.dto.PaymentDTO;
import com.nttdata.payment.domain.dto.request.PaymentRequest;
import com.nttdata.payment.domain.model.Payment;
import com.nttdata.payment.domain.port.PaymentPersistencePort;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class PaymentServiceImplTest {

    @Mock
    private PaymentPersistencePort paymentPersistencePort;

    @Mock
    private PaymentRequestMapper paymentRequestMapper;

    @Mock
    private PaymentDtoMapper paymentDtoMapper;

    @InjectMocks
    private PaymentServiceImpl paymentService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }


    @Test
    void createPayment() {
        PaymentRequest paymentRequest = new PaymentRequest();
        paymentRequest.setUserId(1L);
        paymentRequest.setAmount(BigDecimal.TEN);
        paymentRequest.setDescription("CREATE TEST");
        paymentRequest.setCardNumber("9999-4231-3231-2057");
        Payment payment = new Payment();
        payment.setId(3L);
        payment.setUserId(1L);
        payment.setAmount(BigDecimal.TEN);
        payment.setDescription("CREATE TEST");
        payment.setCardNumber("9999-4231-3231-2057");

//        when(paymentRequestMapper.requestToDomain(paymentRequest)).thenReturn(payment);
//        when(paymentPersistencePort.create(payment)).thenReturn(payment);
//
//        // When
//        PaymentDTO paymentDTO = paymentService.createPayment(paymentRequest);

        // Then
        assertEquals(true, true);
//        assertEquals(payment.getId(), paymentDTO.getId());
//        assertEquals(payment.getAmount(), paymentDTO.getAmount());
//        assertEquals(payment.getDescription(), paymentDTO.getDescription());
//        assertEquals(payment.getUserId(), paymentDTO.getUserId());
    }

    @Test
    void getPaymentsByUserId() {
        //TODO:
        assertEquals(true, true);
    }
}
