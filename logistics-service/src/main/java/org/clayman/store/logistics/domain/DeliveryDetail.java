package org.clayman.store.logistics.domain;

import java.time.DayOfWeek;
import java.time.OffsetTime;

public class DeliveryDetail {

    private DayOfWeek dayOfWeek;
    private OffsetTime deliveryTime;
    private String description;

    public DeliveryDetail() {
    }

    public DeliveryDetail(DayOfWeek dayOfWeek, OffsetTime deliveryTime, String description) {
        this.dayOfWeek = dayOfWeek;
        this.deliveryTime = deliveryTime;
        this.description = description;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public DeliveryDetail setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
        return this;
    }

    public OffsetTime getDeliveryTime() {
        return deliveryTime;
    }

    public DeliveryDetail setDeliveryTime(OffsetTime deliveryTime) {
        this.deliveryTime = deliveryTime;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public DeliveryDetail setDescription(String description) {
        this.description = description;
        return this;
    }
}
