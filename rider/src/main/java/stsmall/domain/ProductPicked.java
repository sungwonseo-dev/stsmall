package stsmall.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import stsmall.domain.*;
import stsmall.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class ProductPicked extends AbstractEvent {

    private Long id;

    public ProductPicked() {
        super();
    }
}
//>>> DDD / Domain Event
