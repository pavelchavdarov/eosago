package ru.rgsbank.eOSAGO.PaymentInfo.paymentService;

/**
 * Created by Павел on 09.02.2017.
 */

import javax.ws.rs.core.Response;

public interface IPaymentInfo {
    Response checkPayment(String paymentData);
}
