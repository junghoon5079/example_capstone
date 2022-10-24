package examplecapstone.domain;

import examplecapstone.domain.*;
import examplecapstone.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class PaymentCnaceled extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String orderStatus;

    public PaymentCnaceled(Payment aggregate){
        super(aggregate);
    }
    public PaymentCnaceled(){
        super();
    }
}
