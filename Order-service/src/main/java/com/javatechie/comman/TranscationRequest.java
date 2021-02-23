package com.javatechie.comman;

import com.javatechie.entities.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TranscationRequest {
    private Order order;
    private Payment payment;

}
