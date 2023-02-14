package com.ouagaou.analyticsservice.services;


import com.ouagaou.analyticsservice.entities.Order;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.KeyValue;
import org.apache.kafka.streams.kstream.Grouped;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.Materialized;
import org.apache.kafka.streams.kstream.TimeWindows;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.util.function.Function;


@Service
public class OrderEventService {

    @Bean
    public Function<KStream<String, Order>, KStream<String, Long>> KStreamFunction()
    {
        return (input) -> {
            return input
                    .map((k, v) -> new KeyValue<>(v.getCustomerId().toString(), 0L))
                    .groupBy((k, v) -> k, Grouped.with(Serdes.String(), Serdes.Long()))
                    .windowedBy(TimeWindows.of(Duration.ofSeconds(30)))
                    .count(Materialized.as("orders-analysis"))
                    .toStream()
                    .map((k, v) -> new KeyValue<>("-- " + k.key() + " : " + k.window().startTime() + " and " + k.window().endTime() + " =>", v));
        };
    }
}
