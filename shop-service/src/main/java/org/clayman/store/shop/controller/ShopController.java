package org.clayman.store.shop.controller;

import org.clayman.store.shop.domain.Item;
import org.clayman.store.shop.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShopController {

    @Autowired
    private ShopService shopService;

    @GetMapping("/items")
    public List<Item> listAvailableItems() {
        return shopService.getAvailableItems();
    }
}
