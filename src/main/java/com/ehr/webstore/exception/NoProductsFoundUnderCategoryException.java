package com.ehr.webstore.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "There are no products in such category.")
public class NoProductsFoundUnderCategoryException extends RuntimeException {
    public static final long serialVersionUID = 3935230281455340039L;
}
