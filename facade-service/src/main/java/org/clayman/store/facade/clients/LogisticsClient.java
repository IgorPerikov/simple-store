package org.clayman.store.facade.clients;

import org.clayman.store.logistics.domain.DeliveriesSchedule;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "logistics-service")
public interface LogisticsClient {

    @RequestMapping(
            method = RequestMethod.GET,
            value = "/deliveries",
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE,
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
    )
    DeliveriesSchedule getDeliveries();
}
