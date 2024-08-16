package com.myownproject.PaymentService.service;

import com.myownproject.PaymentService.model.PaymentRequest;
import com.myownproject.PaymentService.model.PaymentResponse;

public interface PaymentService {
    long doPayment(PaymentRequest paymentRequest);

    PaymentResponse getPaymentDetailsByOrderId(String orderId);
}
