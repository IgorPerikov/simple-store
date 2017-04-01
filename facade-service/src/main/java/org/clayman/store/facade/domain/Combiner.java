package org.clayman.store.facade.domain;

import java.util.List;

public class Combiner {

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
