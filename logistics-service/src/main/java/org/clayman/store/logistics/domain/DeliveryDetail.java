package org.clayman.store.logistics.domain;

import java.time.DayOfWeek;
import java.time.OffsetTime;

public class DeliveryDetail {

    private DayOfWeek dayOfWeek;
    private OffsetTime deliveryTime;
    private String description;

    public DeliveryDetail(DayOfWeek dayOfWeek, OffsetTime deliveryTime, String description) {
        this.dayOfWeek = dayOfWeek;
        this.deliveryTime = deliveryTime;
        this.description = description;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public OffsetTime getDeliveryTime() {
        return deliveryTime;
    }

    public String getDescription() {
        return description;
    }
}
