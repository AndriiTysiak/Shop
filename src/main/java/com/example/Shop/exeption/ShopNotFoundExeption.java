package com.example.Shop.exeption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ShopNotFoundExeption extends RuntimeException {

    public ShopNotFoundExeption(String message) {
        super(message);
    }
}
