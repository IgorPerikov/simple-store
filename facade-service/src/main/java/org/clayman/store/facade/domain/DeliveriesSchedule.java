package org.clayman.store.facade.domain;

import java.util.ArrayList;
import java.util.List;

public class DeliveriesSchedule {

    private final List<DeliveryDetail> deliveries;

    public DeliveriesSchedule() {
        deliveries = new ArrayList<>();
    }

    public DeliveriesSchedule(List<DeliveryDetail> deliveries) {
        this.deliveries = deliveries;
    }

    public List<DeliveryDetail> getDeliveries() {
        return deliveries;
    }

    public List<DeliveryDetail> addDelivery(DeliveryDetail deliveryDetail) {
        deliveries.add(deliveryDetail);
        return deliveries;
    }
}
