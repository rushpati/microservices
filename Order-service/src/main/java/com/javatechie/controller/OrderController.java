package com.javatechie.controller;

import com.javatechie.comman.Payment;
import com.javatechie.comman.TransactionsResponse;
import com.javatechie.comman.TranscationRequest;
import com.javatechie.entities.Order;
import com.javatechie.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping(path = "/saveOrder")
    public TransactionsResponse saveOrder(@RequestBody TranscationRequest txrequest){

        return orderService.saveOrder(txrequest);

    }
}
