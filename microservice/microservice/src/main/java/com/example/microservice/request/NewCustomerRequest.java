package com.example.microservice.request;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class NewCustomerRequest implements Serializable {
    // this is dto


    private String name;
    private int age;
}
