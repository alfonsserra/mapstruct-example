package com.systelab.spring.controller;

import com.systelab.spring.model.Supplier;
import com.systelab.spring.model.SupplierDTO;
import com.systelab.spring.service.supplier.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*", exposedHeaders = "Authorization", allowCredentials = "true")
public class SupplierController {

    private SupplierService supplierService;
    private SupplierMapper supplierMapper;

    @Autowired
    public void setSupplierService(SupplierService supplierService, SupplierMapper supplierMapper) {
        this.supplierService = supplierService;
        this.supplierMapper = supplierMapper;

    }

    @GetMapping("/suppliers")
    public ResponseEntity<List<SupplierDTO>> getAllSuppliers() {
        return ResponseEntity.ok(supplierMapper.suppliersToSuppliersDtos(supplierService.getSuppliers()));
    }

    @GetMapping("/supplier/{id}")
    public ResponseEntity<SupplierDTO> getSupplier(@PathVariable("id") Long id) {
        return ResponseEntity.ok(supplierMapper.supplierToDTO(supplierService.getSupplier(id)));
    }
}