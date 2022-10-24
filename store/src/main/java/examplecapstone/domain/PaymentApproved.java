package examplecapstone.domain;

import examplecapstone.domain.*;
import examplecapstone.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class PaymentApproved extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String orderStatus;
}


