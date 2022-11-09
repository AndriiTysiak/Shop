package com.example.Shop.service;

import com.example.Shop.exeption.ShopNotFoundExeption;
import com.example.Shop.model.Shop;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.*;
import java.util.List;

@Service
public class ShopService {
    private HashMap<Integer, Shop> shopsHashMap = new HashMap<>();

    public Shop addShop(Shop shop) {
        return shopsHashMap.put(shop.getShopId(), shop);
    }

    public Shop getShopById(Integer shopId) {
        return shopsHashMap.get(shopId);
    }

    public void deleteShop(Integer shopId) {
        shopsHashMap.remove(shopId);
    }

    public HashMap<Integer, Shop> getAllShop() {
        return shopsHashMap;
    }

    public Shop update(Integer shopId, Shop shop) {
        Shop resShop = new Shop(shopId, shop.getAddress(), shop.getName(), shop.getEmployee(), shop.isInternetShop());
        return shopsHashMap.put(shopId, resShop);
    }
}

