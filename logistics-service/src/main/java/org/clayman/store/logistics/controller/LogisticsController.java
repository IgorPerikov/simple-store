package org.clayman.store.logistics.controller;

import org.clayman.store.logistics.domain.DeliveriesSchedule;
import org.clayman.store.logistics.service.LogisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogisticsController {

    @Autowired
    private LogisticsService logisticsService;

    @GetMapping("/deliveries")
    public DeliveriesSchedule getDeliveriesSchedule() {
        return logisticsService.getDeliveriesSchedule();
    }
}
