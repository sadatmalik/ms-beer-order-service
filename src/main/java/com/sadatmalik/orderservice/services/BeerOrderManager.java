package com.sadatmalik.orderservice.services;

import com.sadatmalik.orderservice.domain.BeerOrder;

public interface BeerOrderManager {
    BeerOrder newBeerOrder(BeerOrder beerOrder);
}