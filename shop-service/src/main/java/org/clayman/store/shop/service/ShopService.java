package org.clayman.store.shop.service;

import com.google.common.collect.Lists;
import org.clayman.store.shop.domain.Item;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopService {

    public List<Item> getAvailableItems() {
        return Lists.newArrayList(new Item(1, "book"), new Item(2, "trousers"), new Item(3, "cellphone"));
    }
}
