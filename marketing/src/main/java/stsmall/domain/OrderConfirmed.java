package stsmall.domain;

import java.util.*;
import lombok.*;
import stsmall.domain.*;
import stsmall.infra.AbstractEvent;

@Data
@ToString
public class OrderConfirmed extends AbstractEvent {

    private Long id;
    private String orderId;
}
