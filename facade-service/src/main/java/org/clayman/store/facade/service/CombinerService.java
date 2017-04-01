package org.clayman.store.facade.service;

import org.clayman.store.facade.clients.LogisticsClient;
import org.clayman.store.facade.clients.ShopClient;
import org.clayman.store.facade.domain.Combiner;
import org.clayman.store.facade.domain.DeliveriesSchedule;
import org.clayman.store.facade.domain.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rx.Observable;
import rx.schedulers.Schedulers;

import java.util.List;

@Service
public class CombinerService {

    @Autowired
    private ShopClient shopClient;

    @Autowired
    private LogisticsClient logisticsClient;

    public Combiner combine() {
        Observable<List<Item>> items = Observable.fromCallable(() -> shopClient.getItems())
                .subscribeOn(Schedulers.io());
        Observable<DeliveriesSchedule> schedule = Observable.fromCallable(() -> logisticsClient.getDeliveries())
                .subscribeOn(Schedulers.io());
        Observable<Combiner> combinedObservable = Observable.zip(items, schedule, this::combine);
        return combinedObservable.toBlocking().first();
    }

    private Combiner combine(List<Item> items, DeliveriesSchedule schedule) {
        return new Combiner(items, schedule);
    }
}
