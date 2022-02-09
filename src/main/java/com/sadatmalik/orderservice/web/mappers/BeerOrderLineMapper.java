package com.sadatmalik.orderservice.web.mappers;

import com.sadatmalik.orderservice.domain.BeerOrderLine;
import com.sadatmalik.orderservice.web.model.BeerOrderLineDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerOrderLineMapper {
    BeerOrderLineDto beerOrderLineToDto(BeerOrderLine line);

    BeerOrderLine dtoToBeerOrderLine(BeerOrderLineDto dto);
}
