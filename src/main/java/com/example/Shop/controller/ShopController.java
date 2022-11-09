package com.example.Shop.controller;

import com.example.Shop.model.Shop;
import com.example.Shop.service.ShopService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;


@RestController
public class ShopController {
    private ShopService shopService;

    public ShopController(ShopService shopService) {
        this.shopService = shopService;
    }

    @PostMapping(value = "/shop")
    @ResponseStatus(HttpStatus.CREATED)
    public Shop addShop(@RequestBody Shop shop) {
        return shopService.addShop(shop);
    }

    @GetMapping("/shop/{shopId}")
    public Shop getShopById(@PathVariable Integer shopId) {
        return shopService.getShopById(shopId);
    }

    @DeleteMapping(value = "/shop")
    public void deleteSh(@RequestParam Integer shopId) {
        System.out.println("Delete");
        shopService.deleteShop(shopId);
    }

    @GetMapping(value = "/shop/all")
    public HashMap<Integer, Shop> getAllShop() {
        return shopService.getAllShop();
    }

    @PostMapping(value = "/shop/update/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Shop update(@PathVariable int shopId, @RequestBody Shop shop) {
        return shopService.update(shopId, shop);
    }

}
