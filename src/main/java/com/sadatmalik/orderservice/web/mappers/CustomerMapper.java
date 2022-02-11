package com.sadatmalik.orderservice.web.mappers;

import com.sadatmalik.brewery.model.CustomerDto;
import com.sadatmalik.orderservice.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface CustomerMapper {
    CustomerDto customerToDto(Customer customer);

    Customer dtoToCustomer(Customer dto);
}