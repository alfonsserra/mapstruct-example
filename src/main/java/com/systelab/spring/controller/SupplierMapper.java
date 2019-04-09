package com.systelab.spring.controller;

import com.systelab.spring.model.Supplier;
import com.systelab.spring.model.SupplierDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SupplierMapper {

    @Mapping(target = "contact", expression = "java(source.getContact().getName()+' '+ source.getContact().getSurname())")
    SupplierDTO supplierToDTO(Supplier source);

    List<SupplierDTO> suppliersToSuppliersDtos(List<Supplier> suppliers);


    @Mapping(target = "country", ignore = true)
    @Mapping(target = "contact", ignore = true)
    Supplier supplierFromDTO(SupplierDTO destination);

}