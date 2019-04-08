package com.systelab.spring.service.supplier;

import com.systelab.spring.model.Contact;
import com.systelab.spring.model.Supplier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SupplierService {

    public List<Supplier> getSuppliers() {
        List<Supplier> suppliers = new ArrayList<>();
        suppliers.add(new Supplier(1l, "IBM", new Contact("Ginni", "Rometty")));
        suppliers.add(new Supplier(2l, "Whole foods", new Contact("John", "Mackey")));
        suppliers.add(new Supplier(3l, "Apple", new Contact("Tim", "Cook")));
        return suppliers;
    }

    public Supplier getSupplier(Long id) {
        return new Supplier(1l, "IBM", new Contact("Ginni", "Rometty"));
    }
}
