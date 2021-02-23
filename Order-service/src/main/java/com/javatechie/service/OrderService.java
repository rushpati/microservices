package com.javatechie.service;

import com.javatechie.comman.Payment;
import com.javatechie.comman.TransactionsResponse;
import com.javatechie.comman.TranscationRequest;
import com.javatechie.entities.Order;
import com.javatechie.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private RestTemplate restTemplate;

    public TransactionsResponse saveOrder(TranscationRequest txrequest){
        String response= null;
        Order order = txrequest.getOrder();
        Payment payment = txrequest.getPayment();
        payment.setOrderId(order.getId());
        payment.setAmount(order.getPrice());
        Payment paymentResponse =  restTemplate.postForObject("http://PAYMENT-SERVICE/payment/doPayment",payment , Payment.class);
        response = paymentResponse.getPaymentStatus().equals("success")? "Payment Processing SUccessful ":"failure in payment , order added to cart ";

        orderRepository.save(order);
       return new TransactionsResponse(order,paymentResponse.getAmount(),paymentResponse.getTransactionId(),response);
    }
}
