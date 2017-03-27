package org.clayman.store.facade.clients;

import org.clayman.store.facade.domain.Item;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "shop-service")
public interface ShopClient {

    @RequestMapping(
            method = RequestMethod.GET,
            value = "/items",
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE,
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
    )
    List<Item> getItems();
}
