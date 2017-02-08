package ru.rgsbank.eOSAGO.PaymentInfo.paymentService;

import ru.rgsbank.eOSAGO.PaymentInfo.rest.response.ResponseCreator;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by Павел on 09.02.2017.
 * Реализация сервиса без учета формата педаваемых данных.
 * Все передается строкой.
 */
public class PaymentInfoRow implements IPaymentInfo {
    @Override
    @POST
    @Consumes(MediaType.APPLICATION_XML)
    @Produces(MediaType.APPLICATION_XML)
    public Response checkPayment(String paymentData) {
        String resp = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><Result>Dummy</Result>";
        return ResponseCreator.success(resp);
    }
}
