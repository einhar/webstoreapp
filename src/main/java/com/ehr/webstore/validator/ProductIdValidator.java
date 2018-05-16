package com.ehr.webstore.validator;

import com.ehr.webstore.domain.Product;
import com.ehr.webstore.exception.ProductNotFoundException;
import com.ehr.webstore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@Component
public class ProductIdValidator implements ConstraintValidator<ProductId, String> {

    @Autowired
    ProductService productService;

    @Override
    public void initialize(ProductId constraintAnnotation) {

    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        Product product;
        try {
            product = productService.getProductById(value);
        } catch (ProductNotFoundException e) {
            return true;
        }

        if(product!= null) {
            return false;
        }

        return true;
    }
}
