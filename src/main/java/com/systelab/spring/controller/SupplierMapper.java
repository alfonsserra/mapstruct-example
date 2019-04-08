package com.systelab.spring.controller;

import com.systelab.spring.model.Supplier;
import com.systelab.spring.model.SupplierDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SupplierMapper {

    SupplierDTO supplierToDTO(Supplier source);

    Supplier supplierFromDTO(SupplierDTO destination);
}