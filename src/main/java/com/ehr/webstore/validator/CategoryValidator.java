package com.ehr.webstore.validator;

import com.ehr.webstore.domain.Product;
import com.ehr.webstore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class CategoryValidator implements ConstraintValidator<Category, String> {

    @Autowired
    ProductService productService;

    List<String> allowedCategories;

    @Override
    public void initialize(Category constraintAnnotation) {
        allowedCategories = new ArrayList<>(Arrays.asList(constraintAnnotation.allowedCategories()));
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        for (String category : allowedCategories) {
            if (category.equalsIgnoreCase(value)) {
                return true;
            }
        }
        return false;
    }
}
