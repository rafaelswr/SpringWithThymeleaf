package com.rafaelswr.tacos.entities;

import lombok.Data;

import java.util.List;

@Data
public class TacoOrder {

    private String deliveryName;
    private String deliveryStreet;
    private String deliveryCity;

    private String deliveryState;

    private String deliveryZip;
    private String ccNumber;
    private String ccExpiration;
    private String ccCVV;

    private List<Taco> tacos;

    public void addTaco (Taco taco ){
        this.tacos.add(taco);
    }






}
