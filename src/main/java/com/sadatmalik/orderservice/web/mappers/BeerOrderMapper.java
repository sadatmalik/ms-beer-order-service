package com.sadatmalik.orderservice.web.mappers;

import com.sadatmalik.orderservice.domain.BeerOrder;
import com.sadatmalik.orderservice.web.model.BeerOrderDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class, BeerOrderLineMapper.class})
public interface BeerOrderMapper {

    BeerOrderDto beerOrderToDto(BeerOrder beerOrder);

    BeerOrder dtoToBeerOrder(BeerOrderDto dto);
}
