package org.clayman.store.facade.controller;

import org.clayman.store.facade.clients.LogisticsClient;
import org.clayman.store.facade.clients.ShopClient;
import org.clayman.store.logistics.domain.DeliveriesSchedule;
import org.clayman.store.shop.domain.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rx.Observable;

import java.util.List;

@RestController
@RequestMapping("/facade")
public class FacadeController {

    @Autowired
    private ShopClient shopClient;

    @Autowired
    private LogisticsClient logisticsClient;

    @GetMapping("/data")
    public Combiner returnCombinedData() {
        Observable<List<Item>> items = Observable.fromCallable(() -> shopClient.getItems());
        Observable<DeliveriesSchedule> schedule = Observable.fromCallable(() -> logisticsClient.getDeliveries());
        Observable<Combiner> combinedObservable = Observable.zip(items, schedule, this::combine);
        return combinedObservable.toBlocking().first();
    }

    private Combiner combine(List<Item> items, DeliveriesSchedule schedule) {
        return new Combiner(items, schedule);
    }

    private class Combiner {

        private List<Item> items;
        private DeliveriesSchedule schedule;

        public Combiner() {
        }

        public Combiner(List<Item> items, DeliveriesSchedule schedule) {
            this.items = items;
            this.schedule = schedule;
        }

        public List<Item> getItems() {
            return items;
        }

        public Combiner setItems(List<Item> items) {
            this.items = items;
            return this;
        }

        public DeliveriesSchedule getSchedule() {
            return schedule;
        }

        public Combiner setSchedule(DeliveriesSchedule schedule) {
            this.schedule = schedule;
            return this;
        }
    }
}
