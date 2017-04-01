package org.clayman.store.facade.controller;

import org.clayman.store.facade.domain.Combiner;
import org.clayman.store.facade.service.CombinerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/facade")
public class FacadeController {

    @Autowired
    private CombinerService combinerService;

    @GetMapping("/data")
    public Combiner returnCombinedData() {
        return combinerService.combine();
    }
}
