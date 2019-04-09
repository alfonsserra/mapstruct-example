package com.systelab.spring.controller;

import com.systelab.spring.model.Supplier;
import com.systelab.spring.model.SupplierDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SupplierMapper {

    SupplierDTO supplierToDTO(Supplier source);

    List<SupplierDTO> suppliersToSuppliersDtos(List<Supplier> suppliers);


    @Mapping(target = "contact", ignore = true)
    Supplier supplierFromDTO(SupplierDTO destination);

}