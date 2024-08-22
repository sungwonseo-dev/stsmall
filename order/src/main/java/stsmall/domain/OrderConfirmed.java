package stsmall.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import stsmall.domain.*;
import stsmall.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class OrderConfirmed extends AbstractEvent {

    private Long id;
    private String orderId;

    public OrderConfirmed(Order aggregate) {
        super(aggregate);
    }

    public OrderConfirmed() {
        super();
    }
}
//>>> DDD / Domain Event
