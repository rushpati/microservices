package com.javatechie.comman;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "PAYMENT_TB")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int paymentId;
    private String paymentStatus;
    private String TransactionId;
    private  int orderId;
    private  double amount;

}
