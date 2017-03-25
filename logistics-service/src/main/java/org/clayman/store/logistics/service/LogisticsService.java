package org.clayman.store.logistics.service;

import com.google.common.collect.Lists;
import org.clayman.store.logistics.domain.DeliveriesSchedule;
import org.clayman.store.logistics.domain.DeliveryDetail;
import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.OffsetTime;
import java.time.ZoneOffset;
import java.util.ArrayList;

@Service
public class LogisticsService {

    public DeliveriesSchedule getDeliveriesSchedule() {
        ArrayList<DeliveryDetail> deliveries = Lists.newArrayList(
                new DeliveryDetail(DayOfWeek.MONDAY, OffsetTime.of(10, 0, 0, 0, ZoneOffset.ofHours(3)), "some description"),
                new DeliveryDetail(DayOfWeek.FRIDAY, OffsetTime.of(23, 55, 0, 0, ZoneOffset.ofHours(3)), "some description")
        );
        return new DeliveriesSchedule(deliveries);
    }
}
