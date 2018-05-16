package com.ehr.webstore.validator;

import com.ehr.webstore.domain.Product;
import org.springframework.stereotype.Component;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.math.BigDecimal;

@Component
public class UnitsInStockValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Product.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Product product = (Product) target;
        if (product.getUnitPrice() != null
                && new BigDecimal(10000).compareTo(product.getUnitPrice()) <= 0
                && product.getUnitsInStock() > 99) {
            errors.rejectValue("unitsInStock", "com.ehr.webstore.validator.UnitsInStockValidator.message");
        }
    }
}
